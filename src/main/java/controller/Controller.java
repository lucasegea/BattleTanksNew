package controller;

import model.Game;
import view.ClearConsole;

public class Controller {

	// private Game game;

	public Controller() {
		Game.getInstance().initialize();
	}

	public void Run() throws InterruptedException {

		while (true) {
			update();
		}
	}

	private void update() throws InterruptedException {
		ClearConsole.clearConsole();
		System.out.println(Game.getInstance().getLevel().getMap());
		Thread.sleep(125);
	}

}
