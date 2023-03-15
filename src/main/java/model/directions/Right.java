package model.directions;

import model.Position;

public class Right extends Directions {
	@Override
	public Position apply(Position position) {
		return new Position(position.getX() + 1, position.getY());
	}
}
