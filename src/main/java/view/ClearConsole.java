package view;

public class ClearConsole {

	public static void clearConsole() {
		System.out.println("");
		System.out.print("\033[H\033[2J");
	}
}
