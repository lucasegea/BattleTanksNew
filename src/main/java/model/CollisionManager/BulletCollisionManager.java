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

		if (!collisions.isEmpty() || !map.willBeInBounds(bullet)) {
			map.remove(bullet);
			bullet.die();
		}

		for (Entity entity1 : collisions) {
			entity1.setLife(-1);
			if (entity1.getLife() == 0) {
				entity1.die();

				map.removeEntity(entity1);

			}
		}
	}

}
