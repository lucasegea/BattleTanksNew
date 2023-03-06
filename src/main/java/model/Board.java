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

		entity.setDirection(direction);
		entity.setTentativePosition();
		if (checkBoundsOfBoard(entity)) {
			remove(entity);
			entity.movePosition();
			setEntity(entity);
		}

	}

	public boolean checkBoundsOfBoard(Movible entity) {

		if (entity.getNewPosition().getX() >= 0 && entity.getNewPosition().getX() < Constants.BOARD_WIDTH
				&& entity.getNewPosition().getY() >= 0 && entity.getNewPosition().getY() < Constants.BOARD_HEIGHT) {
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
