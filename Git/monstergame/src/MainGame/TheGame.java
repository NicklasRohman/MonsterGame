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
 * Varje spelar kan skriva in sina stats sj�lv med ett maxantal po�ng.
 * Flera spelare t�vlar i mot varandra. player array?
 * Story?
 * tr�d som r�knar tid du har spelat? f�r tr�ningens skull
 * Charm reduce price in shop.
*/