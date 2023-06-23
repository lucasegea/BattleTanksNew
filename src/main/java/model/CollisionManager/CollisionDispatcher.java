package model.CollisionManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import model.Entity;
import model.Movable;

public class CollisionDispatcher {
	private final List<CollisionManager> collisionManagers;

	public CollisionDispatcher() {
		collisionManagers = new ArrayList<>();
	}

	public void registerCollisionManager(CollisionManager collisionManager) {
		collisionManagers.add(collisionManager);
	}

	public void dispatchCollision(Movable movable, Collection<Entity> collisions) {
		for (CollisionManager manager : collisionManagers) {
			manager.handleCollision(movable, collisions);
		}
	}
}
