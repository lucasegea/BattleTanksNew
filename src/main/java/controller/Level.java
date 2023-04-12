package controller;

import model.Board;
import model.Position;
import model.Tank;
import model.Wall;

public class Level {

	Tank tank = new Tank(new Position(3, 4));
	Wall wall = new Wall(new Position(4, 1));
	Wall wallTwo = new Wall(new Position(4, 8));
	Board map = new Board();

	public Level() {
		map.appendEntity(tank);
		map.appendEntity(wall);
		map.appendEntity(wallTwo);
	}

	public Board getMap() {
		return map;
	}

	public Tank getTank() {
		return tank;
	}

}