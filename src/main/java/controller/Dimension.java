package controller;

public class Dimension {
	private final int majorRatio;
	private final int minorRatio;
	public boolean isHorizontal;
	private boolean isNewHorizontal;

	public Dimension(int minorRatio, int majorRatio) {
		this.majorRatio = majorRatio;
		this.minorRatio = minorRatio;
	}

	public int getHorizontalRatio() {
		if (isHorizontal) {
			return minorRatio;
		}
		return majorRatio;
	}

	public int getVerticalRatio() {
		if (isHorizontal) {
			return majorRatio;
		}
		return minorRatio;
	}

	public void setNewOrientation(boolean isNewHorizontal) {
		this.isNewHorizontal = isNewHorizontal;
	}

	public boolean getNewOrientation() {
		return isNewHorizontal;
	}

	public void setOrientation(boolean isHorizontal) {
		this.isHorizontal = isHorizontal;
	}

	public boolean getOrientation() {
		return isHorizontal;
	}

}
