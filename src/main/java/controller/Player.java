package controller;

import java.awt.Dimension;

import model.Movable;
import model.Position;
import model.Tank;

public class Player {

	Position position = new Position(0, 0);
	Dimension dimension = new Dimension(3, 3);
	Tank tank = new Tank(position, dimension);

	public Player() {

	}

	public void getInstance() {
	}

	public Movable getEntity() {
		return tank;
	}

}
