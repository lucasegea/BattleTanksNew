package model.directions;

import model.Position;
import model.Orientation.Orientation;

public abstract class Direction {

	public Orientation orientation;

	public Direction(Orientation orientation) {
		this.orientation = orientation;
	}

	public abstract Position apply(Position position);

	public abstract Position setPositionBullet(Position position);

	public abstract String setSymbolBullet();

	public Orientation getOrientation() {
		return orientation;
	}
}
