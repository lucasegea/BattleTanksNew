package model;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import model.directions.Directions;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class Movable extends Entity {

	protected Position newPosition = new Position(position.getX(), position.getY());
	private static final HashMap<Integer, Directions> KEY_TRANSLATOR = new HashMap<>();

	static {
		KEY_TRANSLATOR.put(KeyEvent.VK_UP, new Up());
		KEY_TRANSLATOR.put(KeyEvent.VK_DOWN, new Down());
		KEY_TRANSLATOR.put(KeyEvent.VK_LEFT, new Left());
		KEY_TRANSLATOR.put(KeyEvent.VK_RIGHT, new Right());
	}

	public Movable(String symbol, Position position, Dimension dimension) {
		super(symbol, position, dimension);

		// TODO Auto-generated constructor stub
	}

	public void movePosition() {
		setPosition(newPosition);
	}

	public Position getNewPosition() {
		return newPosition;
	}

	public void setNewPosition(Position newPosition) {
		this.newPosition = newPosition;
	}

	public void move(KeyEvent e) {
		Integer key = e.getKeyCode();
		if (KEY_TRANSLATOR.containsKey(key)) {
			setNewPosition(KEY_TRANSLATOR.get(key).apply(getPosition()));
			// setDirection(KEY_TRANSLATOR.get(key));
		}
		// setTentativePosition(KEY_TRANSLATOR.get(key).apply(position);)
		// TODO Auto-generated method stub

	}

}
