package model;

import java.awt.Dimension;

public class Tank extends Movable {

	private static final String SYMBOL = "x";

	public Tank(Position position, Dimension dimension) {
		super(SYMBOL, position, dimension);
	}

}
