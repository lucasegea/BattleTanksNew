package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TankTest {

	@Test
	public void createTankTest() {
		/* create one Entity */
		Tank tank = new Tank(new Position(1, 1));
		Board board = new Board(tank);

		checkEntitiesOnBoard(board, tank);
	}

	@SuppressWarnings("deprecation")
	public void checkEntitiesOnBoard(Board board, Tank tank) {
		int emptySquares = 0;
		int filledSquares = 0;
		int totalSquares = (int) Math.pow(board.getMap().length, 2);

		for (int x = 0; x < board.getMap().length; x++) {
			for (int y = 0; y < board.getMap().length; y++) {
				if (board.getMap()[x][y].getEntities().isEmpty()) {
					emptySquares = emptySquares + 1;
				} else {
					assertEquals(tank, board.getMap()[x][y].getEntity());
					filledSquares = filledSquares + 1;
				}
			}
		}
		assertEquals(totalSquares - filledSquares, emptySquares);
		assertEquals(1, filledSquares);
	}
}
