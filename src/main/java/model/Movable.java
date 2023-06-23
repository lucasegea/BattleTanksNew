package model;

import controller.Dimension;
import model.Orientation.Orientation;
import model.directions.Direction;

public class Movable extends Entity {

	private Position newPosition;
	private Orientation newOrientation;
	protected Direction direction;

	public Movable(String symbol, Position position, Dimension dimension) {
		super(symbol, position, dimension);
	}

	public void movePosition() {
		setPosition(getNewPosition());
		setOrientation(getNewOrientation());
	}

	public void move(Direction direction) {
		this.direction = direction;
		setNewPosition(direction.apply(getPosition()));
		setNewOrientation(direction.getOrientation());
	}

	public int getPotencialMinorX() {
		return newPosition.getX() - newOrientation.getVerticalRadius(dimension);
	}

	public int getPotencialMajorX() {
		return newPosition.getX() + newOrientation.getVerticalRadius(dimension);
	}

	public int getPotencialMinorY() {
		return newPosition.getY() - newOrientation.getHorizontalRadius(dimension);
	}

	public int getPotencialMajorY() {
		return newPosition.getY() + newOrientation.getHorizontalRadius(dimension);
	}

	public Position getNewPosition() {
		return newPosition;
	}

	public void setNewPosition(Position newPosition) {
		this.newPosition = newPosition;
	}

	// juego entre el tanque y la bullet . el shoot tiene q hacer tank.shoot y ya

	public void setNewOrientation(Orientation newOrientation) {
		this.newOrientation = newOrientation;
	}

	public Orientation getNewOrientation() {
		return newOrientation;
	}

	public Direction getDirection() {
		return direction;
	}

	public Bullet shoot() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean makeDamage() {
		return false;
	}

	@Override
	public boolean receptiveToDamage() {
		return true;
	}

	public InteractionResult interact(Entity otherEntity) {
		return new InteractionResult(!otherEntity.isObstacle());
	}

	public void interactWithMapBorders() {
		// TODO Auto-generated method stub

	}

}
