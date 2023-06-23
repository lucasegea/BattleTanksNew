package view;

import model.Game;

public class DetailsViewGame {

	public DetailsViewGame() {
		Game.getInstance().getLevel().getTank().printDetails();
	}
}
