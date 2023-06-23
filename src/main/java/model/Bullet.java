package model;

import controller.Dimension;
import model.Interaction.Interaction;
import model.directions.Direction;

public class Bullet extends Movable {

	private static String symbolBullet = "→";
	private static final Dimension DIMENSION = new Dimension(0, 0);
	private final Board map = Game.getInstance().getLevel().getMap();

	public Bullet(Position position) {
		super(symbolBullet, position, DIMENSION);
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	@Override
	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public void move(Direction direction) {
		this.direction = direction;
		setNewPosition(direction.apply(getPosition()));
		setNewOrientation(direction.getOrientation());
	}

	@Override
	public boolean makeDamage() {
		return true;
	}

	@Override
	public Interaction registerInteraction(Entity otherEntity) {
		setCanMove(false);
		map.remove(this);
		setActive(false);
		if (otherEntity.receptiveToDamage()) {
			otherEntity.setLife(-1);
		}
		return new Interaction(this, otherEntity);
	}

	@Override
	public void registerInteraction() {
		setCanMove(false);
		map.remove(this);
	}
}
