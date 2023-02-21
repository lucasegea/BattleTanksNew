package model;

public class Square {

	private Entity entity = null;
	// private static String symbol = "d";

	public Square() {

	}

	public String drawSymbol() {

		return entity == null ? " " : entity.getSymbol();
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

}
