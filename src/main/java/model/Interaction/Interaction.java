package model.Interaction;

import model.Entity;
import model.InteractionResult;
import model.Movable;

public class Interaction {

	private final Entity otherEntity;
	private final Movable movable;

	public Interaction(Movable movable, Entity otherEntity) {
		this.otherEntity = otherEntity;
		this.movable = movable;
	}

	Movable getMovable() {
		return movable;
	}

	Entity getEntity() {
		return otherEntity;
	}

	public InteractionResult interact() {
		return movable.interact(otherEntity);
	}

}
