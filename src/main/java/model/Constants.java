package model;

import java.util.HashMap;

import model.Action.Action;
import model.Action.Movement;
import model.Action.Shoot;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class Constants {
	public static int BOARD_WIDTH = 15;
	public static int BOARD_HEIGHT = 15;

	// public static final ArrayList<Direction> DIRECTIONS = new ArrayList<>();
	public static final HashMap<Integer, Action> key_TRANSLATOR = new HashMap<>();
	static {
		key_TRANSLATOR.put(0, new Movement(Up.getInstance()));
		key_TRANSLATOR.put(1, new Movement(Down.getInstance()));
		key_TRANSLATOR.put(2, new Movement(Left.getInstance()));
		key_TRANSLATOR.put(3, new Movement(Right.getInstance()));
		key_TRANSLATOR.put(4, new Shoot());

	}

}
