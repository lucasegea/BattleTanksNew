package model;

public class Tank extends Movible {

	private static final String SYMBOL = "x";
	public Direction direction;

	public Tank(Position position) {
		super(SYMBOL, position);
	}

}
