package model.CollisionManager;

import java.util.Collection;

import model.Board;
import model.Entity;
import model.Game;
import model.Movable;

public class BulletCollisionManager implements CollisionManager {

	@Override
	public void handleCollision(Movable bullet, Collection<Entity> collisions) {
		Board map = Game.getInstance().getLevel().getMap();

		if (!collisions.isEmpty() || !map.checkBoundsOfBoard(bullet)) {
			map.remove(bullet);
			bullet.setActive(false);
		}

		for (Entity entity1 : collisions) {
			entity1.setLife(-1);
			if (entity1.getLife() == 0) {
				entity1.setActive(false);

				map.removeEntity(entity1);

			}
		}
	}

}
