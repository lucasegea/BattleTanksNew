package controller.Players;

import java.awt.event.KeyEvent;
import java.util.HashMap;

import model.Movable;
import model.Position;
import model.Tank;
import model.directions.Direction;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class HumanPlayer extends Players {

	private static final HashMap<Integer, Direction> KEY_TRANSLATOR = new HashMap<>();

	static {
		KEY_TRANSLATOR.put(KeyEvent.VK_UP, new Up());
		KEY_TRANSLATOR.put(KeyEvent.VK_DOWN, new Down());
		KEY_TRANSLATOR.put(KeyEvent.VK_LEFT, new Left());
		KEY_TRANSLATOR.put(KeyEvent.VK_RIGHT, new Right());
	}

	Tank tank = new Tank(new Position(3, 3));

	public void move(KeyEvent e) {
		Integer key = e.getKeyCode();
		if (KEY_TRANSLATOR.containsKey(key)) {
			getEntity().move(KEY_TRANSLATOR.get(key));
		}
	}

	public HumanPlayer() {
	}

	public void getInstance() {
	}

	public Movable getEntity() {
		return tank;
	}
}
