package model;

import java.util.Collection;
import java.util.HashSet;

import controller.Dimension;

public class Tank extends Movable {

	private static final String SYMBOL = "x";
	private static final Dimension DIMENSION = new Dimension(1, 1);
	private boolean isHuman = false;
	private final Collection<PowerUp> powerUps = new HashSet<>();

	public Tank(Position position) {
		super(SYMBOL, position, DIMENSION);
	}

	@Override
	public Bullet shoot() {
		Bullet bullet = new Bullet(getDirection().setPositionBullet(getPosition()));
		bullet.setDirection(getDirection());
		bullet.setSymbol(new String(getDirection().setSymbolBullet()));
		return bullet;
	}

	public void setIsHuman(boolean isHuman) {
		this.isHuman = isHuman;

	}

	@Override
	public InteractionResult interact(Entity otherEntity) {
		otherEntity.interact(this);
		return new InteractionResult(!otherEntity.isObstacle());
	}

	public void add(PowerUp powerUp) {
		powerUps.add(powerUp);
		powerUp.apply(this);
	}

	public boolean isHuman() {
		return isHuman;
	}

	public String getPowerUp() {
		for (PowerUp powerUp : powerUps) {
			return "      PowerUp " + powerUp.toString();
		}
		return "";
	}

	public int getCountPowerUp() {
		for (PowerUp powerUp : powerUps) {
			return powerUp.getCount();
		}
		return 0;
	}

	public void removePowerUp(PowerUp powerUp) {
		powerUps.remove(powerUp);
		powerUp.remove(this);
	}

}
