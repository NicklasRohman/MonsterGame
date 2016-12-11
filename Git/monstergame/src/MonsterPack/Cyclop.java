package MonsterPack;

import MainGame.RandomClass;
	/** 
	* @author Nicklas
	* class that is making a Cyclop and all things are a Cyclop is doing.  
	*/
public class Cyclop extends Monster {

	/**
	* A constructor that makes a Cyclop monster.
	* @param hp Is how much health points Cyclop have.
	* @param exp Is how much experience points Cyclop give.
	* @param ap Is how much action points Cyclop have.
	*/
	public Cyclop(int hp, int exp, int ap) {
		super("Cyclop", hp, exp, ap);
		printMonsterSound();
	}

	@Override
	public void printMonsterSound() {
		System.out.println("AHHHHHHH the Cyclop is awaken");

	}

	@Override
	public int monsterGiveCoin(int luck) {
		return RandomClass.getInt(10, (30+luck));
	}

}
