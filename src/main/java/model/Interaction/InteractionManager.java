package model.Interaction;

import java.util.Collection;
import java.util.HashSet;

import model.InteractionResult;

public class InteractionManager {

	Collection<InteractionResult> interactionResults = new HashSet<>();

	public void add(InteractionResult interactionResult) {
		interactionResults.add(interactionResult);
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
