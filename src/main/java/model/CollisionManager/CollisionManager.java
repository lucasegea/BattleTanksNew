package model.CollisionManager;

import java.util.Collection;

import model.Entity;
import model.Movable;

public interface CollisionManager {
	void handleCollision(Movable movable, Collection<Entity> collisions);
}
