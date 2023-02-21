package test.java.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Board;
import model.Position;
import model.Tank;

public class TankTest {

	@Test
	public void createTankTest() {

		Tank tank = new Tank(new Position(1, 1));
		Board board = new Board(tank);
		getEntityMap(board, tank);
	}

	public boolean getEntityMap(Board board, Tank tank) {

		for (int i = 0; i < board.getMap().length; i++) {
			for (int j = 0; j < board.getMap().length; j++) {
				if (board.getMap()[i][j].getEntity() != null) {
					System.out.print(board.getMap()[i][j].drawSymbol());
					assertEquals(tank, board.getMap()[i][j].getEntity());
				}
			}
		}
		return false;
	}
}
