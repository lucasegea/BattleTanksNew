package model.directions;

import controller.Dimension;
import model.Position;

public class Left extends Directions {

	@Override
	public Position apply(Position position) {
		int x = position.getX();
		int y = position.getY();
		return new Position(x - 1, y);
	}

	@Override
	public void setOrientationHorizontal(Dimension dimension) {
		dimension.setNewOrientation(true);
	}

}
