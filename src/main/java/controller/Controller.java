package controller;

import model.Board;
import view.Window;

public class Controller {

	public Controller() {
		// while (true) {
		// Run();
		// }
	}

	public void Run() throws InterruptedException {
		Player player = new Player();
		Window window = new Window();
		window.setVisible(true);
		Board board = new Board(player);
		Listener listener = new Listener(window, player, board);

		while (true) {
			board.update();
			if (listener.keyPressed) {
				board.update();
			}

		}
	}

}
