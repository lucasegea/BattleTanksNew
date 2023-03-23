package model.directions;

import controller.Dimension;
import model.Position;

public class Up extends Directions {

	@Override
	public Position apply(Position position) {
		return new Position(position.getX(), position.getY() - 1);
	}

	@Override
	public void setOrientationHorizontal(Dimension dimension) {
		dimension.setNewOrientation(false);
	}

}
