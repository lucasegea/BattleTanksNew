package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Square {

	private final Collection<Entity> entities = new ArrayList<>();
	private Entity entity;

	public Square() {

	}

	public String drawSymbol() {

		return entities.isEmpty() ? " "
				: String.join(" ", entities.stream().map(Entity::getSymbol).collect(Collectors.toList()));
	}

	public void addEntity(Entity entity) {
		entities.add(entity);
		this.entity = entity;
	}

	public Collection<Entity> getEntities() {
		return entities;
	}

	public Entity getEntity() {
		return entity;
	}

	public void removeEntity(Entity entity) {
		entities.remove(entity);
	}

	public boolean contains(Entity entity) {
		return entities.contains(entity);
	}

}
