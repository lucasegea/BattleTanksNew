package model.Interaction;

import java.util.Collection;
import java.util.HashSet;

import model.Board;
import model.Entity;
import model.Game;
import model.Movable;

public class InteractionManager {
	Collection<Interaction> interactions = new HashSet<>();
	Movable movable;
	Entity otherEntity;

	public void add(Interaction interaction) {
		interactions.add(interaction);
		workInteraction();
	}

	public void workInteraction() {
		Board map = Game.getInstance().getLevel().getMap();

		for (Interaction interaction : interactions) {
			otherEntity = interaction.getEntity();
			movable = interaction.getMovable();

			if (!movable.makeDamage() && !otherEntity.isObstacle()) {
				map.removeEntity(otherEntity);
				// movable.getPowerUp();
			}

		}
	}

}
