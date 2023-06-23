package model;

import controller.Level;
import controller.Listener;
import controller.Players.HumanPlayer;
import controller.Players.PlayerBot;
import model.Strategy.RandomStrategy;
import model.Strategy.Strategy;
import view.Window;

public class Game {
	private static final Game game = new Game();
	private Level level;
	private final Strategy randomStrategy = new RandomStrategy();

	private Game() {
	}

	public static Game getInstance() {
		return game;
	}

	public void initialize() {
		level = new Level();
		Tank tank = level.getTank();
		Tank tankBot = level.getTankBot();
		Board board = level.getMap();
		HumanPlayer player = new HumanPlayer(tank);
		PlayerBot playerBot = new PlayerBot(tankBot, randomStrategy);
		Window window = new Window();
		window.setVisible(true);
		Listener listener = new Listener(window, player, board, level);
	}

	public Level getLevel() {
		return level;
	}

}