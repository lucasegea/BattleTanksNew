package model;

import controller.Dimension;
import model.Orientation.Orientation;
import model.Orientation.Vertical;

public abstract class Entity implements Showable {
	private String symbol;
	protected Position position;
	protected Dimension dimension;
	public Orientation orientation = Vertical.getInstance();
	private int life = 2;
	private boolean alive = true;

	public Entity(String symbol, Position position, Dimension dimension) {
		this.symbol = symbol;
		this.dimension = dimension;

		setPosition(position);
	}

	@Override
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public Position getPosition() {
		return position;
	}

	public int getMinorX() {
		return position.getX() - orientation.getVerticalRadius(dimension);
	}

	public int getMajorX() {
		return position.getX() + orientation.getVerticalRadius(dimension);
	}

	public int getMinorY() {
		return position.getY() - orientation.getHorizontalRadius(dimension);
	}

	public int getMajorY() {
		return position.getY() + orientation.getHorizontalRadius(dimension);
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation newOrientation) {
		orientation = newOrientation;
	}

	public void setLife(int i) {
		life = life + i;
		if (getLife() == 0) {
			die();
		}
	}

	public int getLife() {
		return life;
	}

	public boolean isObstacle() {
		return true;
	}

	public abstract boolean makeDamage();

	public abstract boolean receptiveToDamage();

	public void die() {
		alive = false;
		Game.getInstance().getLevel().getMap().removeEntity(this);
	}

	public boolean isAlive() {
		return alive;
	}

	public void printDetails() {
	}
}
