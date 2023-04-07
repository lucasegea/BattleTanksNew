package model.Orientation;

import controller.Dimension;

public abstract class Orientation {

	private int verticalRatio;
	private int horizontalRatio;

	public abstract Orientation setRatios(Dimension dimension);

	public int getVerticalRatio() {
		return verticalRatio;
	}

	public int getHorizontalRatio() {
		return horizontalRatio;
	}

	public void setVerticalRatio(int verticalRatio) {
		this.verticalRatio = verticalRatio;
	}

	public void setHorizontalRatio(int horizontalRatio) {
		this.horizontalRatio = horizontalRatio;

	}

}
