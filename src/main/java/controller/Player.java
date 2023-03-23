package controller;

import model.Movable;
import model.Tank;

public class Player {

	Tank tank = new Tank();

	public Player() {
	}

	public void getInstance() {
	}

	public Movable getEntity() {
		return tank;
	}
}
