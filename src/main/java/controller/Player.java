package controller;

import model.Entity;
import model.Position;
import model.Tank;

public class Player {

	Position position = new Position(3, 2);
	Tank tank = new Tank(position);

	public void getInstance() {
	}

	public Entity getEntity() {
		return tank;
	}

}
