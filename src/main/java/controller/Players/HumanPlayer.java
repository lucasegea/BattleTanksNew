package controller.Players;

import java.awt.event.KeyEvent;
import java.util.HashMap;

import model.Tank;
import model.Action.Action;
import model.Action.Movement;
import model.Action.Shoot;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class HumanPlayer extends Player {

	private static final HashMap<Integer, Action> KEY_TRANSLATOR = new HashMap<>();

	static {
		KEY_TRANSLATOR.put(KeyEvent.VK_UP, new Movement(Up.getInstance()));
		KEY_TRANSLATOR.put(KeyEvent.VK_DOWN, new Movement(Down.getInstance()));
		KEY_TRANSLATOR.put(KeyEvent.VK_LEFT, new Movement(Left.getInstance()));
		KEY_TRANSLATOR.put(KeyEvent.VK_RIGHT, new Movement(Right.getInstance()));
		KEY_TRANSLATOR.put(KeyEvent.VK_SPACE, new Shoot());
	}

	private final Tank tank;

	public void doAction(KeyEvent e) {
		Integer key = e.getKeyCode();
		if (KEY_TRANSLATOR.containsKey(key)) {
			KEY_TRANSLATOR.get(key).apply(tank);
		}
	}

	public HumanPlayer(Tank tank) {
		this.tank = tank;
	}

	public void getInstance() {
	}

}
