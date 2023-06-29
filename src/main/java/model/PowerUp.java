package model;

import java.util.Timer;
import java.util.TimerTask;

import controller.Dimension;
import model.Orientation.Orientation;

public abstract class PowerUp extends Entity {

	private static final String SYMBOL = "P";
	private static final Dimension DIMENSION = new Dimension(0, 0);
	private Position newPosition;
	private Orientation newOrientation;
	private final Timer t;
	private Tank tank;
	private PowerUp powerUp;
	private final Timer t2;
	public int count = 0;

	public PowerUp(Position position) {
		super(SYMBOL, position, DIMENSION);
		t = new Timer();
		t2 = new Timer();
	}

	public Position getNewPosition() {
		return newPosition;
	}

	public void setNewPosition(Position newPosition) {
		this.newPosition = newPosition;
	}

	public void setNewOrientation(Orientation newOrientation) {
		this.newOrientation = newOrientation;
	}

	public Orientation getNewOrientation() {
		return newOrientation;
	}

	@Override
	public boolean isObstacle() {
		return false;
	}

	@Override
	public boolean makeDamage() { // borrar
		return false;
	}

	@Override
	public boolean receptiveToDamage() {
		return false;
	}

	@Override
	protected void interact(Tank tank) {
		this.tank = tank;
		if (tank.isHuman()) {
			die();
			tank.add(this);
			powerUp = this;
			t.schedule(removeTask, 10000);
			t2.schedule(countTimeTask, 0, 1000);
		}
	}

	TimerTask countTimeTask = new TimerTask() {

		@Override
		public void run() {
			count++;
		}
	};

	TimerTask removeTask = new TimerTask() {

		@Override
		public void run() {
			tank.removePowerUp(powerUp);
			t2.cancel();
		}

	};

	public abstract void apply(Tank tank);

	@Override
	public abstract String toString();

	protected abstract void remove(Tank tank);

	public int getCount() {
		return count;
	}

}
