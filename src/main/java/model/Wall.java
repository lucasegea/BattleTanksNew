package model;

import controller.Dimension;

public class Wall extends Entity {

	private static final String SYMBOL = "W";
	private static final Dimension DIMENSION = new Dimension(2, 0);
	// private static final Position POSITION = ;

	public Wall(Position position) {
		super(SYMBOL, position, DIMENSION);

	}

}
