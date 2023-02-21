package controller;

import model.Board;
import model.Position;
import model.Tank;

public class Main {

	public static void main(String[] args) {

		Position position = new Position(2, 1);
		Tank tank = new Tank(position);
		Board board = new Board(tank);

	}

}
