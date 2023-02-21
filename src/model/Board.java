package model;

public class Board {
	// List <String> list = new ArrayList<String>();
	Square matrix[][] = new Square[3][3];

	public Board(Entity entity) {
		initialize();
		setEntity(entity);
		drawMap();
	}

	private void initialize() {
		// matrix[1][1] = new Square(entity);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = new Square();
				// matrix[1][1] = new Square(square);
			}
		}
	}

	private void setEntity(Entity entity) {
		matrix[entity.getPosition().getY()][entity.getPosition().getX()].setEntity(entity);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Square[] element : matrix) {
			for (int j = 0; j < matrix.length; j++) {
				builder.append("[" + element[j].drawSymbol() + "]");
			}
			builder.append("\n");
		}
		return builder.toString();
	}

	private void drawMap() {
		System.out.print(toString());
	}

	public Square[][] getMap() {
		return matrix;
	}
}
