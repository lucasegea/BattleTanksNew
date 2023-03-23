package model;

import java.awt.event.KeyEvent;
import java.util.HashMap;

import controller.Dimension;
import model.directions.Directions;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public abstract class Movable extends Entity {

	protected Position newPosition = new Position(position.getX(), position.getY());
	public boolean isHorizontal;
	private static final HashMap<Integer, Directions> KEY_TRANSLATOR = new HashMap<>();

	static {
		KEY_TRANSLATOR.put(KeyEvent.VK_UP, new Up());
		KEY_TRANSLATOR.put(KeyEvent.VK_DOWN, new Down());
		KEY_TRANSLATOR.put(KeyEvent.VK_LEFT, new Left());
		KEY_TRANSLATOR.put(KeyEvent.VK_RIGHT, new Right());
	}

	public Movable(String symbol, Position position, Dimension dimension) {
		super(symbol, position, dimension);
	}

	public void movePosition() {
		setPosition(getNewPosition());
		dimension.setOrientation(dimension.getNewOrientation());
	}

	public void move(KeyEvent e) {
		Integer key = e.getKeyCode();
		if (KEY_TRANSLATOR.containsKey(key)) {
			setNewPosition(KEY_TRANSLATOR.get(key).apply(getPosition()));
			KEY_TRANSLATOR.get(key).setOrientationHorizontal(dimension);
		}
	}

}
