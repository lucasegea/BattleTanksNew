package model;

import java.awt.event.KeyListener;

import controller.Player;
import view.ClearConsole;

public class Board {
	// List <String> list = new ArrayList<String>();
	Square matrix[][] = new Square[6][6];

	public Board(Player player) {
		initialize();
		setEntity(player.getEntity());
		drawMap();
	}

	private void initialize() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = new Square();
			}
		}
	}

	public void update(Entity entity) {
		ClearConsole.clearConsole();
		initialize();
		setEntity(entity);
		// entity.move(entity);
		drawMap();
	}

	public void move(Direction direction, Entity entity) {
		entity.setDirection(direction);
		entity.movePosition(entity);
		update(entity);

	}

	private void setEntity(Entity entity) {
		matrix[entity.getPosition().getY()][entity.getPosition().getX()].setEntity(entity);
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

	private void drawMap() {
		System.out.print(toString());
	}

	public Square[][] getMap() {
		return matrix;
	}

	public void addKeyListener(KeyListener keyEvent) {
		// TODO Auto-generated method stub

	}

}
