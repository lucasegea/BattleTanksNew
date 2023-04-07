package model.directions;

import model.Position;
import model.Orientation.Horizontal;
import model.Orientation.Orientation;

public class Left extends Direction {
	private static Orientation ORIENTATION = new Horizontal();

	public Left() {
		super(ORIENTATION);
	}

	@Override
	public Position apply(Position position) {
		return new Position(position.getX() - 1, position.getY());
	}
}
