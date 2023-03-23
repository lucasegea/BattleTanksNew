package model;

import controller.Dimension;

public abstract class Entity implements Showable {
	private final String symbol;
	protected Position position;
	protected Dimension dimension;
	private Position newPosition;

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
		return position.getX() - dimension.getVerticalRatio();
	}

	public int getMajorX() {
		return position.getX() + dimension.getVerticalRatio();
	}

	public int getMinorY() {
		return position.getY() - dimension.getHorizontalRatio();
	}

	public int getMajorY() {
		return position.getY() + dimension.getHorizontalRatio();
	}

	public int getPotencialMinorX() {
		return newPosition.getX() - dimension.getVerticalRatio();
	}

	public int getPotencialMajorX() {
		return newPosition.getX() + dimension.getVerticalRatio();
	}

	public int getPotencialMinorY() {
		return newPosition.getY() - dimension.getHorizontalRatio();
	}

	public int getPotencialMajorY() {
		return newPosition.getY() + dimension.getHorizontalRatio();
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

}
