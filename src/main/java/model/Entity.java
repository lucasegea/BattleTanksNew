package model;

public abstract class Entity implements Showable {
	private final String symbol;
	protected Position position;
	private Direction direction = Direction.LEFT;

	public Entity(String symbol, Position position) {
		this.symbol = symbol;
		setPosition(position);
		setDirection(direction);
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

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

}
