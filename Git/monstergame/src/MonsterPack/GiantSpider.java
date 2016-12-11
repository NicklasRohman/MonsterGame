package MonsterPack;

import MainGame.Player;
import MainGame.RandomClass;
	/**
	* @author Nicklas
	* class that making a Giant Spider and all things are a Giant Spider is doing.
	*/
public class GiantSpider extends Monster{
	Player p;
	/**
	* A constructor that makes a Giant Spider.
	* @param hp is how much health points Giant spider have.
	* @param exp is how much experience points Giant spider give.
	* @param ap is how much action points Giant spider have.
	*/
	public GiantSpider(int hp, int exp, int ap) {
		super("Giant Spider",hp,exp,ap);
		printMonsterSound();
	}
	
	@Override
	public void printMonsterSound() {
		System.out.println("Klick Klick, fsss"
				+ " Ohh no a Giant spider appered.");
	}

	@Override
	public int monsterGiveCoin(int luck) {
		int coins = RandomClass.getInt(5, (14+luck));
		return coins;
		
	}
}
