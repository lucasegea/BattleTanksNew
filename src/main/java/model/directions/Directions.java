package model.directions;

import controller.Dimension;
import model.Position;

public abstract class Directions {

	public abstract Position apply(Position position);

	public abstract void setOrientationHorizontal(Dimension dimension);

}
