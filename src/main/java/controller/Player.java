package controller;

import model.Movible;
import model.Position;
import model.Tank;

public class Player {

	private int x;
	private int y;
	Position position = new Position(3, 3);
	Tank tank = new Tank(position);

	public Player() {

		// updatePosition(tank);
	}

	public void getInstance() {
	}

	public Movible getEntity() {
		return tank;
	}

	public void updatePosition(Tank tank) {
		tank.setPosition(tank.getNewPosition());
	}
}
