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

	public Dimension getNewOrientation(Dimension dimension) {
		return orientation.setRatios(new Dimension(dimension.getMinorRatio(), dimension.getMajorRatio()));
	}
}
