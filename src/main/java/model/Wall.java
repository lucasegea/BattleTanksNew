package model;

import controller.Dimension;
import model.Orientation.Orientation;

public class Wall extends Entity {

	private static final String SYMBOL = "W";
	private static final Dimension DIMENSION = new Dimension(2, 0);
	// private static final Position POSITION = ;
	private Position newPosition;
	private Orientation newOrientation;

	public Wall(Position position) {
		super(SYMBOL, position, DIMENSION);

	}

	public Position getNewPosition() {
		return newPosition;
	}

	public void setNewPosition(Position newPosition) {
		this.newPosition = newPosition;
	}

	public void setNewOrientation(Orientation newOrientation) {
		this.newOrientation = newOrientation;
	}

	public Orientation getNewOrientation() {
		return newOrientation;
	}

	@Override
	public boolean makeDamage() {
		return false;
	}

	@Override
	public boolean receptiveToDamage() {
		return true;
	}

}
