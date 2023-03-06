package model;

public class Movible extends Entity {

	protected Position newPosition = new Position(position.getX(), position.getY());

	public Movible(String symbol, Position position) {
		super(symbol, position);
		// TODO Auto-generated constructor stub
	}

	public void movePosition() {
		setPosition(newPosition);

		/*
		 * Direction dir = getDirection(); position = getPosition(); x =
		 * position.getX(); y = position.getY();
		 *
		 * switch (dir) { case UP: { position.setY(y - 1); setNewPosition(position);
		 * break; } case DOWN: { position.setY(y + 1); setNewPosition(position); break;
		 * } case RIGHT: { System.out.println(position.getX()); position.setX(x + 1);
		 * setNewPosition(position); System.out.println(newPosition.getX()); break; }
		 * case LEFT: { // System.out.println(position.getX()); position.setX(x - 1);
		 * setNewPosition(position); System.out.println(newPosition.getX()); break; }
		 * default: break;
		 *
		 * }
		 */
	}

	public void setTentativePosition() {
		Direction dir = getDirection();
		position = getPosition();
		int x = position.getX();
		int y = position.getY();
		switch (dir) {
		case UP: {
			setNewPosition(new Position(x, y - 1));
			break;
		}
		case DOWN: {
			setNewPosition(new Position(x, y + 1));
			break;
		}
		case RIGHT: {
			setNewPosition(new Position(x + 1, y));
			break;
		}
		case LEFT: {
			setNewPosition(new Position(x - 1, y));

			break;
		}
		default:
			break;

		}
	}

	public Position getNewPosition() {
		return newPosition;
	}

	public void setNewPosition(Position newPosition) {
		this.newPosition = newPosition;
	}

}
