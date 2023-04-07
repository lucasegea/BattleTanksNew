package model.Orientation;

import controller.Dimension;

public class Vertical extends Orientation {

	public Vertical() {
	}

	@Override
	public Orientation setRatios(Dimension dimension) {
		if (dimension != null) {
			setVerticalRatio(dimension.getMinorRatio());
			setHorizontalRatio(dimension.getMajorRatio());
		}
		return this;
	}

}
