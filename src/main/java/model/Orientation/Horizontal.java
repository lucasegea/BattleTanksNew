package model.Orientation;

import controller.Dimension;

public class Horizontal extends Orientation {
	private static final Horizontal horizontal = new Horizontal();

	private Horizontal() {
	}

	public static Horizontal getInstance() {
		return horizontal;
	}

	@Override
	public int getVerticalRadius(Dimension dimension) {
		return dimension.getMajorRadius();
	}

	@Override
	public int getHorizontalRadius(Dimension dimension) {
		return dimension.getMinorRadius();
	}

}
