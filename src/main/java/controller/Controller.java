package controller;

import model.Game;
import view.ClearConsole;

public class Controller {

	// private Game game;

	public Controller() {
		Game.getInstance().initialize();

	}

	private void update() throws InterruptedException {
		ClearConsole.clearConsole();
		System.out.println(Game.getInstance().getLevel().getMap());
		Thread.sleep(125);
	}

	public void run() {
		while (true) {
			try {
				update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
