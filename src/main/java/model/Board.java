package model;

import java.awt.event.KeyListener;

import controller.Player;

public class Board {
	// List <String> list = new ArrayList<String>();

	Square matrix[][] = new Square[Constants.BOARD_WIDTH][Constants.BOARD_HEIGHT];
	private Object Player;

	public Board(Player player) {
		initialize();
		setEntity(player.getEntity());
	}

	private void initialize() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = new Square();
			}
		}
	}

	public void move(Direction direction, Movible entity) {
		// boolean moveIt = false;
		entity.setDirection(direction);
		entity.setTentativePosition();
		remove(entity);
		// entity.setDirection(direction);
		System.out.println(entity.getDirection());
		entity.movePosition();
		setEntity(entity);
		// entity.getNewPosition();
		// System.out.println("getX new" + entity.getNewPosition().getX());
		if (checkBoundsOfBoard(entity)) {
			// System.out.println("getX" + entity.getPosition().getX());
			// remove(entity);

			// moveIt = true;
			// entity.actualPosition();
		}

	}

	public boolean checkBoundsOfBoard(Movible entity) {

		if (entity.getNewPosition().getX() >= 0) {
			System.out.println("getX" + entity.getNewPosition().getX());
			return true;
		}
		return false;
	}

	private void remove(Movible entity) {
		matrix[entity.getPosition().getY()][entity.getPosition().getX()].removeEntity(entity);
	}

	private void setEntity(Entity entity) {
		matrix[entity.getPosition().getY()][entity.getPosition().getX()].addEntity(entity);
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

	public void addKeyListener(KeyListener keyEvent) {
		// TODO Auto-generated method stub

	}

}
