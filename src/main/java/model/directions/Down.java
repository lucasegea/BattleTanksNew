package model.directions;

import model.Position;
import model.Orientation.Orientation;
import model.Orientation.Vertical;

public class Down extends Direction {

	private static Orientation ORIENTATION = new Vertical();

	public Down() {
		super(ORIENTATION);
	}

	@Override
	public Position apply(Position position) {
		return new Position(position.getX(), position.getY() + 1);
	}

}
