package model.directions;

import model.Position;
import model.Orientation.Horizontal;

public class Right extends Direction {

	private static final Right right = new Right();

	private Right() {
		super(Horizontal.getInstance());
	}

	public static Right getInstance() {
		return right;
	}

	@Override
	public Position apply(Position position) {
		return new Position(position.getX() + 1, position.getY());
	}

}
