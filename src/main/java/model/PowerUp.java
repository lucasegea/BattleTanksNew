package model;

import controller.Dimension;
import model.Orientation.Orientation;

public class PowerUp extends Entity {

	private static final String SYMBOL = "P";
	private static final Dimension DIMENSION = new Dimension(0, 0);
	private Position newPosition;
	private Orientation newOrientation;

	public PowerUp(Position position) {
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
	public boolean isObstacle() {
		return false;
	}

	@Override
	public boolean makeDamage() {
		return false;
	}

	@Override
	public boolean receptiveToDamage() {
		return false;
	}

	public void activateDefense() {
		setLife(20);
	}

}
