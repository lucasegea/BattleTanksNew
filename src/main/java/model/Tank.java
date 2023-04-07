package model;

import controller.Dimension;

public class Tank extends Movable {

	private static final String SYMBOL = "x";

	public Tank() {
		super(SYMBOL, new Position(3, 3), new Dimension(1, 2));
	}

}
