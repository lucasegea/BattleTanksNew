package model;

import controller.Dimension;

public class Tank extends Movable {

	private static final String SYMBOL = "x";
	private static final Dimension DIMENSION = new Dimension(1, 1);

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

	@Override
	public void printDetails() {
		System.out.print("Life " + getLife());
		System.out.println("     powerUp ");
	}

}
