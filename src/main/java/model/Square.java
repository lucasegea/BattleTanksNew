package model;

import java.util.ArrayList;
import java.util.Collection;

public class Square {

	private Entity entity = null;
	private final Collection<Entity> entities = new ArrayList<>();
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
		entities.add(entity);
	}

	public Collection<Entity> getEntities() {
		return entities;
	}

}
