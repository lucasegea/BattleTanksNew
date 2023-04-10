package controller;

import controller.Players.HumanPlayer;
import model.Board;
import view.Window;

public class Controller {

	public Controller() {
	}

	public void Run() throws InterruptedException {
		HumanPlayer player = new HumanPlayer();
		Window window = new Window();
		window.setVisible(true);
		Board board = new Board(player);
		Listener listener = new Listener(window, player, board);

		while (true) {
			board.update();
		}
	}

}
