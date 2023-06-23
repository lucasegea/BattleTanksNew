package model.Action;

import model.Game;
import model.Movable;
import model.directions.Direction;

public class Movement implements Action {

	private final Direction direction;

	public Movement(Direction direction) {
		this.direction = direction;
	}

	@Override
	public void apply(Movable movable) {
		movable.move(direction);
		Game.getInstance().getLevel().getMap().move(movable);
	}

}
