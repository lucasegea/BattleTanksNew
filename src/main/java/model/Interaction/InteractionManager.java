package model.Interaction;

import java.util.Collection;
import java.util.HashSet;

import model.InteractionResult;

public class InteractionManager {
	Collection<Interaction> interactions = new HashSet<>();
	Collection<InteractionResult> interactionResults = new HashSet<>();

	public void add(Interaction interaction) {
		interactions.add(interaction);
	}

	public void doActions() {
		for (Interaction interaction : interactions) {
			interactionResults.add(interaction.interact());
		}
	}

	public boolean canMove() {
		for (InteractionResult interactionResult : interactionResults) {
			if (!interactionResult.canMove()) {
				return false;
			}
		}
		return true;
	}

}
