package model.directions;

import model.Position;
import model.Orientation.Orientation;

public abstract class Direction {

	public Orientation orientation;

	public Direction(Orientation orientation) {
		this.orientation = orientation;
	}

	public abstract Position apply(Position position);

	public Orientation getNewOrientation() {
		return orientation;
	}
}
