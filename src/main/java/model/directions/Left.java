package model.directions;

import model.Position;
import model.Orientation.Horizontal;

public class Left extends Direction {

	private static final Left left = new Left();

	private Left() {
		super(Horizontal.getInstance());
	}

	public static Left getInstance() {
		return left;
	}

	@Override
	public Position apply(Position position) {
		return new Position(position.getX() - 1, position.getY());
	}
}
