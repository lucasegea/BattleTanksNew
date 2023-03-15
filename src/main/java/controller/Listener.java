package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import model.Board;
import view.Window;

public class Listener {

	private final Player player;
	private final Board board;
	public boolean keyPressed = false;

	public Listener(Window window, Player player, Board board) {
		this.board = board;
		this.player = player;
		// board = player.getBoard();
		KeyEvents(window.getTextField());
	}

	public void KeyEvents(JTextField jTextField) {
		KeyListener keyEvent = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			public boolean getKeyPressed() {
				return keyPressed;
			}

			@Override
			public void keyPressed(KeyEvent key) {

				player.getEntity().move(key);
				board.move(player.getEntity());
				keyPressed = true;
			}

		};
		jTextField.addKeyListener(keyEvent);
	}

}
