package model;

public abstract class Entity implements Showable {
	private final String symbol;

	private Position position;

	public Entity(String symbol, Position position) {
		this.symbol = symbol;
		setPosition(position);
	}

	@Override
	public String getSymbol() {
		return symbol;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
