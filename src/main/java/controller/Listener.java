package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import controller.Players.HumanPlayer;
import model.Board;
import view.Window;

public class Listener {

	private final HumanPlayer player;
	private final Board board;
	private final Level level;

	public Listener(Window window, HumanPlayer player, Board board, Level level) {
		this.board = board;
		this.player = player;
		this.level = level;
		// quitar parametros de constructor
		// cada player deberia tener su propio keylistener
		keyEvents(window.getTextField());
	}

	public void keyEvents(JTextField jTextField) {
		KeyListener keyEvent = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent key) {
				player.doAction(key);

			}

		};
		jTextField.addKeyListener(keyEvent);
	}

}
