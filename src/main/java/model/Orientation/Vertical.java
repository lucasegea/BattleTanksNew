package model.Orientation;

import controller.Dimension;

public class Vertical extends Orientation {

	public Vertical() {
	}

	@Override
	public Dimension setRatios(Dimension dimension) {
		if (dimension != null) {
			dimension.setVerticalRatio(dimension.getMinorRatio());
			dimension.setHorizontalRatio(dimension.getMajorRatio());
		}
		return dimension;
	}

}
