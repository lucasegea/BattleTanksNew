package model;

import controller.Dimension;

public class Tank extends Movable {

	private static final String SYMBOL = "x";
	private static final Dimension DIMENSION = new Dimension(1, 2);

	public Tank(Position position) {
		super(SYMBOL, position, DIMENSION);
	}

}
