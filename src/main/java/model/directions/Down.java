package model.directions;

import model.Position;
import model.Orientation.Vertical;

public class Down extends Direction {

	private static final Down down = new Down();

	private Down() {
		super(Vertical.getInstance());
	}

	public static Down getInstance() {
		return down;
	}

	@Override
	public Position apply(Position position) {
		return new Position(position.getX(), position.getY() + 1);
	}

}
