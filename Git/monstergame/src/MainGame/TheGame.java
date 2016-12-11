package MainGame;
	/**
	* @author Nicklas
	* This class makes a interface of game class and starts the game.
	*/
public class TheGame {

	/**
	* main method:
	* This method will start the game by 
	* To make an object of the Game class.
	* @param args command-line arguments.
	*/
	public static void main(String[] args) {
//		Thread timeThread = new Thread();
//		timeThread.start();
		
		Game game = new Game();
		game.game();
		
	}
	
	
	
	
}
/* 
 * Precision increases critical hit chance.
 * Luck (magic find).
 * Varje spelar kan skriva in sina stats själv med ett maxantal poäng.
 * Flera spelare tävlar i mot varandra. player array?
 * Story?
 * tråd som räknar tid du har spelat? för träningens skull
 * Charm reduce price in shop.
*/