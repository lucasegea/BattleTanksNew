package model.Interaction;

import model.Entity;
import model.Movable;

public class Interaction {

	private final Entity otherEntity;
	private final Movable movable;
	InteractionManager interactionManager = new InteractionManager();

	public Interaction(Movable movable, Entity otherEntity) {
		this.otherEntity = otherEntity;
		this.movable = movable;
		interactionManager.add(this);
	}

	Movable getMovable() {
		return movable;
	}

	Entity getEntity() {
		return otherEntity;
	}

}
