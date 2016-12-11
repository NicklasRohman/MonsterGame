package MonsterPack;

import MainGame.RandomClass;
	/**
 	* @author Nicklas.
 	* class that making a Vampire Bat and all things are a Vampire Bat is doing.
 	*/
public class VampireBat extends Monster{

	/**
	* A Constructor that makes a Vampire Bat.
	* @param hp is how much health points Vampire Bat have.
	* @param exp is how much experience points Vampire Bat give.
	* @param ap is how much action points Vampire Bat have.
	*/
	public VampireBat(int hp, int exp, int ap) {
		super("Vampire Bat", hp, exp, ap);
		printMonsterSound();
	}
	
	@Override
	public void printMonsterSound() {
		System.out.println("Swoff, swoff. "
						+ " look out a Vampire Bat appered.");
	}

	@Override
	public int monsterGiveCoin(int luck) {
		int coins = RandomClass.getInt(3, (10+luck));
		return coins;
	}
}
