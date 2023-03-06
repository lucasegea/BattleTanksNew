package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Square {

	private final Collection<Entity> entities = new ArrayList<>();
	// private static String symbol = "d";

	public Square() {

	}

	public String drawSymbol() {

		return entities.isEmpty() ? " "
				: String.join(" ", entities.stream().map(Entity::getSymbol).collect(Collectors.toList()));
	}

	public void addEntity(Entity entity) {
		entities.add(entity);
	}

	public Collection<Entity> getEntities() {
		return entities;
	}

	public void removeEntity(Entity entity) {
		entities.remove(entity);

	}

}
