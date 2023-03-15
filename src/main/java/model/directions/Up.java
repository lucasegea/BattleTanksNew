package model.directions;

import model.Position;

public class Up extends Directions {

	@Override
	public Position apply(Position position) {
		return new Position(position.getX(), position.getY() - 1);
	}

}
