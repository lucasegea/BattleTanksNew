package model;

import controller.Dimension;
import model.Orientation.Orientation;
import model.Orientation.Vertical;

public abstract class Entity implements Showable {
	private final String symbol;
	protected Position position;
	protected Dimension dimension;
	private Position newPosition;
	public Orientation orientation = Vertical.getInstance();
	private Orientation newOrientation;

	public Entity(String symbol, Position position, Dimension dimension) {
		this.symbol = symbol;
		this.dimension = dimension;

		setPosition(position);
	}

	@Override
	public String getSymbol() {
		return symbol;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public Position getPosition() {
		return position;
	}

	public int getMinorX() {
		return position.getX() - orientation.getVerticalRadius(dimension);
	}

	public int getMajorX() {
		return position.getX() + orientation.getVerticalRadius(dimension);
	}

	public int getMinorY() {
		return position.getY() - orientation.getHorizontalRadius(dimension);
	}

	public int getMajorY() {
		return position.getY() + orientation.getHorizontalRadius(dimension);
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

	public void setPosition(Position position) {
		this.position = position;
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

	public Orientation getOrientation() {
		return orientation;
	}

	public Orientation getNewOrientation() {
		return newOrientation;
	}

	public void setOrientation(Orientation newOrientation) {
		orientation = newOrientation;
	}

}
