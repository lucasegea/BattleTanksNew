package model.Strategy;

import java.util.Random;

import model.Constants;
import model.Movable;

public class RandomStrategy implements Strategy {

	private final Random generator = new Random(4);
	private Movable movable;

	@Override
	public void getNextAction(Movable movable) {
		this.movable = movable;

		doAction();

	}

	public int nextRandom() {
		return generator.nextInt(5);
	}

	public void doAction() {
		// movable.doAction(Constants.key_TRANSLATOR.get(nextRandom()));
		// Game.getInstance().getLevel().getMap().move(movable);

		Integer key = nextRandom();
		if (Constants.key_TRANSLATOR.get(key) != null) {
			Constants.key_TRANSLATOR.get(key).apply(movable);
			// Game.getInstance().getLevel().getMap().move(movable);
		}
		// board.move(movable);
	}

}
