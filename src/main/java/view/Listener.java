package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import controller.Player;
import model.Board;
import model.Direction;

public class Listener {

	private final Board board;
	private final Player player;

	public Listener(Window window, Player player, Board board) {

		this.board = board;
		this.player = player;
		KeyEvents(window.getTextField());
		System.out.println(board);
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

			@Override
			public void keyPressed(KeyEvent key) {
				switch (key.getKeyCode()) {
				case KeyEvent.VK_UP: {
					board.move(Direction.UP, player.getEntity());
				}
					break;
				case KeyEvent.VK_DOWN:
					board.move(Direction.DOWN, player.getEntity());
					break;
				case KeyEvent.VK_RIGHT:
					board.move(Direction.RIGHT, player.getEntity());
					break;
				case KeyEvent.VK_LEFT:
					board.move(Direction.LEFT, player.getEntity());
					break;
				default:
					System.out.println("Presionaste una tecla no reconocida");
					break;
				}
				ClearConsole.clearConsole();
				System.out.println(board);

			}

		};
		jTextField.addKeyListener(keyEvent);
	}

}
