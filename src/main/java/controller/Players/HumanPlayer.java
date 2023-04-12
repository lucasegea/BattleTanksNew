package controller.Players;

import java.awt.event.KeyEvent;
import java.util.HashMap;

import model.Tank;
import model.directions.Direction;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class HumanPlayer extends Player {

	private static final HashMap<Integer, Direction> KEY_TRANSLATOR = new HashMap<>();

	static {
		KEY_TRANSLATOR.put(KeyEvent.VK_UP, Up.getInstance());
		KEY_TRANSLATOR.put(KeyEvent.VK_DOWN, Down.getInstance());
		KEY_TRANSLATOR.put(KeyEvent.VK_LEFT, Left.getInstance());
		KEY_TRANSLATOR.put(KeyEvent.VK_RIGHT, Right.getInstance());
	}

	private final Tank tank;

	public void move(KeyEvent e) {
		Integer key = e.getKeyCode();
		if (KEY_TRANSLATOR.containsKey(key)) {
			tank.move(KEY_TRANSLATOR.get(key));
		}
	}

	public HumanPlayer(Tank tank) {
		this.tank = tank;
	}

	public void getInstance() {
	}

}
