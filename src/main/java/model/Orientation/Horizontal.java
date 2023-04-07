package model.Orientation;

import controller.Dimension;

public class Horizontal extends Orientation {

	public Horizontal() {
	}

	@Override
	public Orientation setRatios(Dimension dimension) {
		if (dimension != null) {
			setVerticalRatio(dimension.getMajorRatio());
			setHorizontalRatio(dimension.getMinorRatio());
		}
		return this;

	}

}
