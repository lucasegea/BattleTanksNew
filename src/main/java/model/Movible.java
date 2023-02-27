package model;

public class Movible extends Entity {

	// Position newPosition = new Position(x, y);

	public Movible(String symbol, Position position) {
		super(symbol, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void movePosition(Entity entity) {
		// TODO Auto-generated method stub
		super.movePosition(entity);
		Direction dir = entity.getDirection();
		position = entity.getPosition();
		x = position.getX();
		y = position.getY();

		switch (dir) {
		case UP: {
			entity.position.setY(y - 1);
			entity.position.setX(x);
			break;
		}
		case DOWN: {
			entity.position.setY(y + 1);
			break;
		}
		case RIGHT: {
			entity.position.setX(x + 1);
			break;
		}
		case LEFT: {
			entity.position.setX(x - 1);
			break;
		}
		default:
			break;

		}
	}

	@Override
	public void move(Entity entity) {
		super.move(entity);
	}

}
