package controller;

public class Dimension {
	private final int majorRatio;
	private final int minorRatio;

	public Dimension(int minorRatio, int majorRatio) {
		this.majorRatio = majorRatio;
		this.minorRatio = minorRatio;
	}

	public int getMinorRadius() {
		return minorRatio;
	}

	public int getMajorRadius() {
		return majorRatio;
	}

}
