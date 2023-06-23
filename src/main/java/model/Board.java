package model;

import java.util.Collection;
import java.util.HashSet;

import model.Interaction.Interaction;
import model.Interaction.InteractionManager;
import view.ClearConsole;
import view.DetailsViewGame;

public class Board {
	// List <String> list = new ArrayList<String>();

	Square matrix[][] = new Square[Constants.BOARD_WIDTH][Constants.BOARD_HEIGHT];

	public Board() {
		initialize();
	}

	private void initialize() {
		for (int i = 0; i < Constants.BOARD_WIDTH; i++) {
			for (int j = 0; j < Constants.BOARD_HEIGHT; j++) {
				matrix[i][j] = new Square();
			}
		}
	}

	public boolean move(Movable movable) {
		if (willBeInBounds(movable)) {
			InteractionManager interactionManager = new InteractionManager();
			for (Entity entity : getCollisions(movable)) {
				interactionManager.add(new Interaction(movable, entity));
			}
			interactionManager.doActions();
			if (interactionManager.canMove()) {
				remove(movable);
				movable.movePosition();
				addEntity(movable);
				return true;
			}
		} else {
			movable.interactWithMapBorders();
		}
		return false;
	}

	public Collection<Entity> getCollisions(Movable movable) {
		Collection<Entity> collisions = new HashSet<>();

		for (int y = movable.getPotencialMinorY(); y <= movable.getPotencialMajorY(); y++) {
			for (int x = movable.getPotencialMinorX(); x <= movable.getPotencialMajorX(); x++) {
				collisions.addAll(matrix[y][x].getEntities());
			}
		}
		collisions.remove(movable);

		return collisions;
	}

	public boolean willBeInBounds(Movable entity) {
		return entity.getPotencialMinorX() >= 0 && entity.getPotencialMajorX() < Constants.BOARD_WIDTH
				&& entity.getPotencialMinorY() >= 0 && entity.getPotencialMajorY() < Constants.BOARD_HEIGHT;
	}
	public void remove(Movable entity) {
		for (int y = entity.getMinorY(); y <= entity.getMajorY(); y++) {
			for (int x = entity.getMinorX(); x <= entity.getMajorX(); x++) {
				matrix[y][x].removeEntity(entity);
			}
		}
	}

	public void removeEntity(Entity entity) {
		for (int y = entity.getMinorY(); y <= entity.getMajorY(); y++) {
			for (int x = entity.getMinorX(); x <= entity.getMajorX(); x++) {
				matrix[y][x].removeEntity(entity);
			}
		}
	}

	private void addEntity(Entity entity) {
		for (int y = entity.getMinorY(); y <= entity.getMajorY(); y++) {
			for (int x = entity.getMinorX(); x <= entity.getMajorX(); x++) {
				matrix[y][x].addEntity(entity);
			}
		}
	}

	public void appendEntity(Entity entity) {
		addEntity(entity);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		new DetailsViewGame();
		for (Square[] column : matrix) {
			for (Square square : column) {
				builder.append("[" + square.drawSymbol() + "]");
			}
			builder.append("\n");
		}
		return builder.toString();
	}

	public Square[][] getMap() {
		return matrix;
	}

	public void update() throws InterruptedException {
		ClearConsole.clearConsole();
		System.out.println(this);
		Thread.sleep(125);
	}
}
