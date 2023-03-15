package model;

import java.awt.Dimension;

public abstract class Entity implements Showable {
	private final String symbol;
	protected Position position;
	protected Dimension dimension;

	public Entity(String symbol, Position position, Dimension dimension) {
		this.symbol = symbol;
		this.dimension = dimension;
		setPosition(position);
	}

	@Override
	public String getSymbol() {
		return symbol;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
