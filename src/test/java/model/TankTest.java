package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import controller.Player;

public class TankTest {

	@Test
	public void createTankTest() {
		/* create one Entity */
		Player player = new Player();
		Board board = new Board(player);
		checkEntitiesOnBoard(board, player.getEntity());
	}

	public void moveTankTest() {

	}

	@SuppressWarnings("deprecation")
	public void checkEntitiesOnBoard(Board board, Entity entity) {
		int emptySquares = 0;
		int filledSquares = 0;
		int totalSquares = (int) Math.pow(board.getMap().length, 2);

		for (int x = 0; x < board.getMap().length; x++) {
			for (int y = 0; y < board.getMap().length; y++) {
				if (board.getMap()[x][y].getEntities().isEmpty()) {
					emptySquares = emptySquares + 1;
				} else {
					assertEquals(1, board.getMap()[x][y].getEntities().size());
					assertEquals(entity, board.getMap()[x][y].getEntities().toArray()[0]);
					filledSquares = filledSquares + 1;
				}
			}
		}
		assertEquals(totalSquares - filledSquares, emptySquares);
		assertEquals(1, filledSquares);
	}
}
