package model;

public class InteractionResult {

	private final boolean canMove;

	public InteractionResult(boolean canMove) {
		this.canMove = canMove;
	}

	public boolean canMove() {
		return canMove;
	}

}
