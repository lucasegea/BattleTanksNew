package controller;

import model.Board;
import model.Position;
import model.Tank;

public class Main {

	public static void main(String[] args) {

		Position position = new Position(1, 2);
		Tank tank = new Tank(position);
		Board board = new Board(tank);

	}

}
