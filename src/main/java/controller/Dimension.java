package controller;

public class Dimension {
	private final int majorRatio;
	private final int minorRatio;
	private int verticalRatio;
	private int horizontalRatio;

	public Dimension(int minorRatio, int majorRatio) {
		this.majorRatio = majorRatio;
		this.minorRatio = minorRatio;
	}

	public int getMinorRatio() {
		return minorRatio;
	}

	public int getMajorRatio() {
		return majorRatio;
	}

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
