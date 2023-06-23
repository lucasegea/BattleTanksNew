package model.Action;

import controller.Players.PlayerBot;
import model.Bullet;
import model.Movable;
import model.Strategy.UnidirectionalStrategy;

public class Shoot implements Action {

	public Shoot() {
	}

	@Override
	public void apply(Movable movable) {
		Bullet bullet = movable.shoot();
		PlayerBot playerBot = new PlayerBot(bullet, new UnidirectionalStrategy());
	}
}
