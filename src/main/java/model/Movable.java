package model;

import controller.Dimension;
import model.directions.Direction;

public class Movable extends Entity {

	protected Position newPosition = new Position(position.getX(), position.getY());

	public Movable(String symbol, Position position, Dimension dimension) {
		super(symbol, position, dimension);
	}

	public void movePosition() {
		setPosition(getNewPosition());
		setOrientation(getNewOrientation());
	}

	public void move(Direction direction) {
		setNewPosition(direction.apply(getPosition()));
		setNewOrientation(direction.getNewOrientation(dimension));
	}

}
