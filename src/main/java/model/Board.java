package model;

import controller.Players.HumanPlayer;
import view.ClearConsole;

public class Board {
	// List <String> list = new ArrayList<String>();

	Square matrix[][] = new Square[Constants.BOARD_WIDTH][Constants.BOARD_HEIGHT];
	private HumanPlayer player;

	public Board(HumanPlayer player) {
		initialize();
		setEntity(player.getEntity());
		player = this.player;
	}

	private void initialize() {
		for (int i = 0; i < Constants.BOARD_WIDTH; i++) {
			for (int j = 0; j < Constants.BOARD_HEIGHT; j++) {
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
		return entity.getPotencialMinorX() >= 0 && entity.getPotencialMajorX() <= Constants.BOARD_WIDTH
				&& entity.getPotencialMinorY() >= 0 && entity.getPotencialMajorY() < Constants.BOARD_HEIGHT - 1;

	}

	private void remove(Movable entity) {
		for (int y = entity.getMinorY(); y <= entity.getMajorY(); y++) {
			for (int x = entity.getMinorX(); x <= entity.getMajorX(); x++) {
				matrix[y][x].removeEntity(entity);
			}
		}
	}

	private void setEntity(Entity entity) {
		for (int y = entity.getMinorY(); y <= entity.getMajorY(); y++) {
			for (int x = entity.getMinorX(); x <= entity.getMajorX(); x++) {
				matrix[y][x].addEntity(entity);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
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
