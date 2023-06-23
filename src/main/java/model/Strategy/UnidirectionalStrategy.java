package model.Strategy;

import model.Board;
import model.Game;
import model.Movable;

public class UnidirectionalStrategy implements Strategy {

	@Override
	public void getNextAction(Movable bullet) {
		Board map = Game.getInstance().getLevel().getMap();
		bullet.move(bullet.getDirection());
		map.move(bullet);
		// map.checkCollisions(map.getCollisionsEntities(bullet)

	}
}
