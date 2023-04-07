package model.Orientation;

import controller.Dimension;

public class Horizontal extends Orientation {

	public Horizontal() {
	}

	@Override
	public Dimension setRatios(Dimension dimension) {
		if (dimension != null) {
			dimension.setVerticalRatio(dimension.getMajorRatio());
			dimension.setHorizontalRatio(dimension.getMinorRatio());
		}
		return dimension;
	}

}
