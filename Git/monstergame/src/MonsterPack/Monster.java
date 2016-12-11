package MonsterPack;
import MainGame.Player;
import MainGame.RandomClass;
	/**
 	* @author Nicklas
 	* An abstract class that takes care of all general monsters methods.
 	*/
public abstract class Monster {
	Player p;
	private int monsterGivenExp;
	private int monsterHp,monsterAttackPoints;
	private String monsterName;
	
	
	/**
	* Constructor for class monster receives a monster name,health points,experience it will give and its attack points.
	* @param name 	name of the monster.
	* @param hp	health of the monster.
	* @param exp	experience the monster will give if its killed.
	* @param ap	monsters attack points.
	*/
	public Monster(String name,int hp,int exp, int ap) {
		
		this.monsterName = name;
		this.monsterHp = hp;
		this.monsterGivenExp = exp;
		this.monsterAttackPoints = ap;
		
	}
	/**
	* Get the monsters health.
	* @return monsterHp returns monsters health points.
	*/
	public int getMonsterHp() {
		return monsterHp;
	}
	/**
	* Get the experience from the killed monster.
	* @return monsterGivenExp returns what the monster will give in  experience if its killed.
	*/
	public int getMonsterGivenExp() {
		return monsterGivenExp;
	}
	/**
	* get the monsters attack points
	* @return monsterAttackPoints returns monsters attack points.
	*/
	public int getMonsterAttackPoints() {
		return monsterAttackPoints;
	}
	/**
	* Get the monster name
	* @return monsterName returns monsters name.
	*/
	public String getMonsterName(){
		return monsterName;
	}
	/**
	* Changes monsters health.
	* @param d sets what the new monsterHp will be.
	*/
	public void setHp(int d) {
		this.monsterHp = d;
	}

	/**
	* Check if the the monster still alive.
	* @return true if the monster lives, otherwise false.
	*/
	public boolean isAlive(){
		if (getMonsterHp()>0) {
			return true;
		}
		return false;
	}
	/**
	* monsterID method is randomizing what monster showing up on adventure.
	* @return monster returns witch monster it will be.
	*/
	public static Monster monsterID(Player p){
		int monsterLevel = (p.getLevel()/4)+1;
		int monsterNumberID = RandomClass.getInt(1, 10); 
		switch (monsterNumberID) {
		case 1:
		case 3:
		case 5:
		case 7:
			int hp = (RandomClass.getInt(11, 40))*monsterLevel;
			int ap = (RandomClass.getInt(3, 10))*monsterLevel;
			int exp = (RandomClass.getInt(ap, hp));
			
			return new VampireBat(hp, exp, ap);
			
		case 2:
		case 4:
		case 6:
		case 8:
			hp = RandomClass.getInt(20, 40)*monsterLevel;
			ap = RandomClass.getInt(6, 19)*monsterLevel;
			exp = (RandomClass.getInt(ap, hp));
			return new GiantSpider(hp, exp, ap);
			
		case 9:
			hp = RandomClass.getInt(30,60)*monsterLevel;
			ap = RandomClass.getInt(10, 25)*monsterLevel;
			exp = (RandomClass.getInt(ap, hp));
			
			return new Cyclop(hp, exp, ap);
		
		default:
			System.out.println("The monster run away");
			break;
		}
		return null;
	}
	/**
 	* prints out the monsters sound.
 	*/
	public abstract void printMonsterSound();
	/**
	* Gives the player its coins. 
	 * @param luck 
	* @return coins returns how much coins the monster will give if its killed.
	*/
	public abstract int monsterGiveCoin(int luck);
	
}
