package model;

import java.awt.event.KeyListener;

import controller.Player;
import view.ClearConsole;

public class Board {
	// List <String> list = new ArrayList<String>();

	Square matrix[][] = new Square[Constants.BOARD_WIDTH][Constants.BOARD_HEIGHT];
	private Player player;

	public Board(Player player) {
		initialize();
		setEntity(player.getEntity());
		player = this.player;
	}

	private void initialize() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = new Square();
			}
		}
	}

	public void move(Movable entity) {

		if (checkBoundsOfBoard(entity)) {
			remove(entity);
			entity.movePosition();
			setEntity(entity);
		}

	}

	public boolean checkBoundsOfBoard(Movable entity) {

		// for (int y = 0; y < entity.getDimension().width; y++) {
		// for (int x = 0; x < entity.getDimension().height; x++) {
		if (entity.getNewPosition().getX() + entity.getDimension().height >= 0
				&& entity.getNewPosition().getX() + entity.getDimension().height <= Constants.BOARD_WIDTH
				&& entity.getNewPosition().getY() + entity.getDimension().width >= 0
				&& entity.getNewPosition().getY() + entity.getDimension().width <= Constants.BOARD_HEIGHT
				&& entity.getNewPosition().getX() >= 0 && entity.getNewPosition().getY() < Constants.BOARD_HEIGHT
				&& entity.getNewPosition().getY() >= 0) {
			return true;
		}
		// }
		// }
		return false;

	}

	private void remove(Movable entity) {
		for (int y = 0; y < entity.getDimension().width; y++) {
			for (int x = 0; x < entity.getDimension().height; x++) {
				matrix[entity.getPosition().getY() + y][entity.getPosition().getX() + x].removeEntity(entity);
			}
		}
	}

	private void setEntity(Entity entity) {
		for (int y = 0; y < entity.getDimension().width; y++) {
			for (int x = 0; x < entity.getDimension().height; x++) {
				matrix[entity.getPosition().getY() + y][entity.getPosition().getX() + x].addEntity(entity);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Square[] element : matrix) {
			for (int j = 0; j < matrix.length; j++) {
				builder.append("[" + element[j].drawSymbol() + "]");
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
		Thread.sleep(250);
	}

	public void addKeyListener(KeyListener keyEvent) {
		// TODO Auto-generated method stub

	}

}
