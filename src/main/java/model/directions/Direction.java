package model.directions;

import controller.Dimension;
import model.Position;
import model.Orientation.Orientation;

public abstract class Direction {

	public Orientation orientation;

	public Direction(Orientation orientation) {
		this.orientation = orientation;
	}

	public abstract Position apply(Position position);

	public Orientation getNewOrientation(Dimension dimension) {
		return orientation.setRatios(dimension);
	}
}
