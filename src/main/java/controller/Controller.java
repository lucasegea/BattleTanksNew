package controller;

import model.Board;
import view.Listener;
import view.Window;

public class Controller {

	public Controller() {
		// while (true) {
		// Run();
		// }
	}

	private void Update() {

	}

	public void Run() {
		Player player = new Player();
		Window window = new Window();
		window.setVisible(true);
		Board board = new Board(player);
		Listener listener = new Listener(window, player, board);
	}

}
