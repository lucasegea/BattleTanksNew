package model.directions;

import model.Position;
import model.Orientation.Vertical;

public class Up extends Direction {
	private static final Up up = new Up();

	private Up() {
		super(Vertical.getInstance());
	}

	public static Up getInstance() {
		return up;
	}

	@Override
	public Position apply(Position position) {
		return new Position(position.getX(), position.getY() - 1);
	}

	@Override
	public Position setPositionBullet(Position position) {
		return new Position(position.getX(), position.getY() - 1);
	}

	@Override
	public String setSymbolBullet() {
		// TODO Auto-generated method stub
		return "↑";
	}
}
