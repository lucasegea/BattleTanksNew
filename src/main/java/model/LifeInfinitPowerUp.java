package model;

public class LifeInfinitPowerUp extends PowerUp {

	private final String nameOfPowerUp = "Eternal life";

	public LifeInfinitPowerUp(Position position) {
		super(position);

	}

	@Override
	public void apply(Tank tank) {
		tank.setReceptiveToDamage(false);
	}

	@Override
	public String toString() {
		return nameOfPowerUp;
	}

	@Override
	protected void remove(Tank tank) {
		tank.setReceptiveToDamage(true);
	}

}
