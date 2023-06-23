package model.CollisionManager;

import java.util.Collection;

import model.Board;
import model.Entity;
import model.Game;
import model.Movable;

public class TankCollisionManager implements CollisionManager {

	@Override
	public void handleCollision(Movable tank, Collection<Entity> collisions) {
		Board map = Game.getInstance().getLevel().getMap();

		for (Entity entity1 : collisions) {
			if (entity1.getSymbol().equals("P")) {
				entity1.setActive(false);
				map.removeEntity(entity1);
				tank.getPowerUp();
			}

		}
	}

}
