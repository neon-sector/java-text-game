package ml.polymetric.textgame03;

public class Main
{
	private static Game game; // Create new game object
	
	public static void main(String[] args)
	{
		game = new Game();
		game.start();
		return;
	}
	
	public static Game getGame()
	{
		return game;
	}
}
