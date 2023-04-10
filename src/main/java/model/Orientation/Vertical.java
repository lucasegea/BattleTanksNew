package model.Orientation;

import controller.Dimension;

public class Vertical extends Orientation {
	private static final Vertical vertical = new Vertical();

	private Vertical() {
	}

	public static Vertical getInstance() {
		return vertical;
	}

	@Override
	public int getVerticalRadius(Dimension dimension) {
		return dimension.getMinorRadius();
	}

	@Override
	public int getHorizontalRadius(Dimension dimension) {
		return dimension.getMajorRadius();
	}

}
