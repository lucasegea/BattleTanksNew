package controller;

import model.Board;
import model.LifeInfinitPowerUp;
import model.Position;
import model.PowerUp;
import model.Tank;
import model.Wall;

public class Level {

	Tank tank = new Tank(new Position(3, 4));
	Tank tankBot = new Tank(new Position(10, 10));
	Wall wall = new Wall(new Position(4, 1));
	Wall wallTwo = new Wall(new Position(4, 8));
	PowerUp powerUp = new LifeInfinitPowerUp(new Position(6, 6));
	Board map = new Board();

	public Level() {
		map.appendEntity(tank);
		map.appendEntity(tankBot);
		map.appendEntity(wall);
		map.appendEntity(wallTwo);
		map.appendEntity(powerUp);

	}

	public void getAndPrintParameters() {

		System.out.print("Life " + tank.getLife());
		if (tank.getCountPowerUp() != 0) {
			System.out.print(" " + tank.getPowerUp() + ".  Time  " + tank.getCountPowerUp());
		}
		System.out.println(" ");

	}

	public Board getMap() {
		return map;
	}

	public Tank getTank() {
		return tank;
	}

	public Tank getTankBot() {
		return tankBot;
	}

}