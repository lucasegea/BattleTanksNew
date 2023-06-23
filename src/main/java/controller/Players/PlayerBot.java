package controller.Players;

import model.Movable;
import model.Strategy.Strategy;

public class PlayerBot extends Player {

	private final Movable movable;
	private final Strategy strategy;

	public void doAction() {
		strategy.getNextAction(movable);
	}

	public PlayerBot(Movable movable, Strategy strategy) {
		this.strategy = strategy;
		this.movable = movable;
		Thread t = new Thread() {

			@Override
			public void run() {
				while (true && movable.getActive()) {
					doAction();
					try {
						sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
	}

}
