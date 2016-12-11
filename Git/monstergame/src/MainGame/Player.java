package MainGame;

import java.util.ArrayList;
import java.util.Scanner;

import items.Item;

/**
	* @author Nicklas.
	* class Player keeps track of everything that happens to the player.
	*/

public class Player implements IPlayer{
	static ArrayList<Item> playersInventory = new ArrayList<Item>();
	Scanner scan = new Scanner(System.in);
	private String name,weaponName;
	private int hp,experiens,level,nextLevel = 10;
	private int playerCoins,healingPotions;
	private int playerLuck,playerPrecision,playerVitality,playerStrength,playerToughness;
	private int attackPoints,weaponAP,playerMaxhealth,playerStatsPoints;
	private int helm,shoulders,coat,gloves,leggings,boots,totalArmor;
	private String nameHelm,nameShoulders,nameCoat,nameGloves,nameLeggings,nameBoots;
	/**
	*Constructor for class player receives a player name.
	* @param name is the name of the player.
	*/
	public Player(String name) {
		this.name = name;
		this.hp = 200;
		this.level = 1;
		this.experiens = 0;
		this.attackPoints = 10;
		this.playerCoins = 0;
		this.playerStrength = 1;
		this.playerToughness = 1;
		this.playerLuck = 91;
		this.playerPrecision = 1;
		this.healingPotions = 0;
		this.weaponName = "Waking Stick";
		this.weaponAP = 1;
		this.playerVitality = 1;
		this.playerMaxhealth = hp +(playerVitality *10)-10; //den här formen kan behöva ändras.
		this.playerStatsPoints = 0; //Kommer behöva ändra mängden
		//Armor delen
		this.boots = 1;
		this.coat = 1;
		this.gloves = 1;
		this.helm = 1;
		this.leggings = 1;
		this.shoulders = 1;
		this.nameBoots = "Cloth Boots";
		this.nameCoat = "Cloth Coat";
		this.nameGloves = "Cloth Gloves";
		this.nameHelm = "Cloth Helm";
		this.nameLeggings = "Cloth Leggings";
		this.nameShoulders = "Cloth Shoulders";
		

	}
	
	/**
	* Get players name.
	* @return name returns the name of the player.
	*/
	public String getName() {
		return name;
	}
	/**
	* Get players hp.
	* @return hp returns the health of the player.
	*/
	public int getHp() {
		return hp;
	}
	/**
	* Get players experience.
	* @return experience returns the experience of the player.
	*/
	public int getExperiens() {
		return experiens;
	}
	/**
	* Get players level.
	* @return level returns the level of the player.
	*/
	public int getLevel() {
		return level;
	}
	/**
	* Get next level.
	* @return nextLevel returns the nextLevel value.
	*/
	public int getNextLevel() {
		return nextLevel;
	}
	/**
	* Get players money status.
	* @return playerCoins returns how much coins the player have.
	*/
	public int getCoins() {
		return playerCoins;
	}
	/**
	* Changes the players money status.
	* @param coins how much is to be changed to playerCoins.
	*/
	public void setCoins(int coins) {
		this.playerCoins = coins;
	}
	/**
	* Get players strength.
	* @return playerStrength returns the strength of the player.
	*/
	public int getPlayerStrength() {
		return playerStrength;
	}
	/**
	* Changing players strength.
	* @param playerStrength sets the new playerStrength.
	*/
	public void setPlayerStrength(int playerStrength) {
		this.playerStrength = playerStrength;
	}
	/**
	* Get players toughness.
	* @return playerToughness returns the toughness of the player.
	*/
	public int getPlayerToughness() {
		return playerToughness;
	}
	/**
	* Changing players toughness.
	* @param playerToughness sets the new playerToughness.
	*/
	public void setPlayerToughness(int playerToughness) {
		this.playerToughness = playerToughness;
	}
	/**
	* Get players luck.
	* @return playerLuck returns the luck of the player.
	*/
	public int getPlayerLuck() {
		return playerLuck;
	}
	/**
	* Changing players luck.
	* @param playerLuck sets the new playerLuck.
	*/
	public void setPlayerLuck(int playerLuck) {
		this.playerLuck = playerLuck;
	}
	/**
	* Get players precision.
	* @return playerPrecision returns the precision of the player.
	*/
	public int getPlayerPrecision() {
		return playerPrecision;
	}
	/**
	* Changing players precision.
	* @param playerPrecision sets the new playerPrecision.
	*/
	public void setPlayerPrecision(int playerPrecision) {
		this.playerPrecision = playerPrecision;
	}
	/**
	* Get players vitality.
	* @return playerVitality returns the vitality of the player.
	*/
	public int getPlayerVitality() {
		return playerVitality;
	}
	/**
	* Changing players Vitality.
	* @param playerVitality sets the new playerVitality.
	*/
	public void setPlayerVitality(int playerVitality) {
		this.playerVitality = playerVitality;
	}

	/**
	* Get number of players healing.
	* @return healingPotions returns how many health potions player have left.
	*/
	public int getHealingPotions() {
		return healingPotions;
	}
	/**
	* Changing number of healing potion.
	* @param healingPotions sets the new number of amount.
	*/
	public void setHealingPotions(int healingPotions) {
		this.healingPotions = healingPotions;
	}
	/**
	* Get players attack points.
	* @return attackPoints returns players attackPoints.
	*/
	public int getAttackPoints() {
		return attackPoints;
	}
	/**
	* Changes the player's hp.
	* @param hp sets what the new hp will be.
	*/
	public void setHp(int hp) {
		this.hp = hp;	
	}
	/**
	* Get players WeaponAP status.
	* @return weaponAP returns players weapon attack points.
	*/
	public int getWeaponAP() {
		return weaponAP;
	}
	/**
	* Changes the player's weapon attack points.
	* @param weaponAP sets how much weapon points it will be.
	*/
	public void setWeaponAP(int weaponAP){
		this.weaponAP = weaponAP;
	}
	/**
	* Get players WeaponName.
	* @return weaponName returns the name of players weapon.
	*/
	public String getWeaponName(){
		return weaponName;
	}
	/**
	* Changes the player's weapon name.
	* @param name sets the name of the weapon.
	*/
	public void setWeaponName(String name){
		this.weaponName = name;
	}
	public int getPlayerMaxhealth() {
		return playerMaxhealth;
	}

	public void setPlayerMaxhealth(int playerMaxhealth) {
		this.playerMaxhealth = playerMaxhealth;
	}

	public int getPlayerStatsPoints() {
		return playerStatsPoints;
	}

	public void setPlayerStatsPoints(int playerStatsPoints) {
		this.playerStatsPoints = playerStatsPoints;
	}

	public int getHelm() {
		return helm;
	}

	public void setHelm(int helm) {
		this.helm = helm;
	}

	public int getShoulders() {
		return shoulders;
	}

	public void setShoulders(int shoulders) {
		this.shoulders = shoulders;
	}

	public int getCoat() {
		return coat;
	}

	public void setCoat(int coat) {
		this.coat = coat;
	}

	public int getGloves() {
		return gloves;
	}

	public void setGloves(int gloves) {
		this.gloves = gloves;
	}

	public int getLeggings() {
		return leggings;
	}

	public void setLeggings(int leggings) {
		this.leggings = leggings;
	}

	public int getBoots() {
		return boots;
	}

	public void setBoots(int boots) {
		this.boots = boots;
	}

	public String getNameHelm() {
		return nameHelm;
	}

	public void setNameHelm(String nameHelm) {
		this.nameHelm = nameHelm;
	}

	public String getNameShoulders() {
		return nameShoulders;
	}

	public void setNameShoulders(String nameShoulders) {
		this.nameShoulders = nameShoulders;
	}

	public String getNameCoat() {
		return nameCoat;
	}

	public void setNameCoat(String nameCoat) {
		this.nameCoat = nameCoat;
	}

	public String getNameGloves() {
		return nameGloves;
	}

	public void setNameGloves(String nameGloves) {
		this.nameGloves = nameGloves;
	}

	public String getNameLeggings() {
		return nameLeggings;
	}

	public void setNameLeggings(String nameLeggings) {
		this.nameLeggings = nameLeggings;
	}

	public String getNameBoots() {
		return nameBoots;
	}

	public void setNameBoots(String nameBoots) {
		this.nameBoots = nameBoots;
	}

	public int getTotalArmor() {
		totalArmor = getBoots() + getCoat() + getCoat() + getGloves() + getHelm() + getLeggings(); 
		return totalArmor;
	}

	/**
	* Check if the the player's still alive.
	* @return true if the player lives, otherwise false.
	*/
	public boolean isAlive(){
		if (getHp()>0) {
			return true;
		}
		return false;
	}
	/**
	* Adding on the player's experience and check if the player has leveled up.
	* @param exp exp is the number of experience points. 
	*/
	public void Experiens(int exp){
		experiens += exp;
		
		while (experiens >= nextLevel) {
			int remain = experiens - nextLevel;
			experiens = 0;
			experiens = remain;
			level++;
			nextLevel *= 2;
			hp = 200;
			System.out.printf("You have levled up and are now level %s%n",level);
			
			if (level >= 10) {
				System.out.println("You win the game!!");
				System.exit(0);
			}	
		}
	}

	/**
	* restorHealt method restore players hp, unless the player has already max hp.
	*@param healthPotain checks if player have any helthPotain left
	*/
	public void restorHealt(int healthPotain){
		String input = "n";
		healthPotain += getHealingPotions();
		do {
			if (healthPotain>0) {
				int normalHealingPotion = 20;
				if (getHp() >= getPlayerMaxhealth()) {
					setHp(playerMaxhealth);
					System.out.println("Your helth is now: "+getHp());
					break;
				}
				else {
					setHp(getHp() + normalHealingPotion);
					setHealingPotions(getHealingPotions() -1);
					if (getHp() >= getPlayerMaxhealth()) {
						setHp(playerMaxhealth);
						System.out.println("Your helth is now: "+getHp());
						break;
					}	
					System.out.println("Your helth is now: "+getHp());
				}
					
			}
			else {
				System.out.println("You dont have any potions left");
				}
			if (healthPotain>0 && getHp()<playerMaxhealth) {
				System.out.println("Do you want to use more healing potion? y/n");
				input = scan.next();
			}
	
		} while (input.equalsIgnoreCase("y")&&healingPotions>0);
	}

	public void useItem(String itemName,int itemPoints){
		if (itemName.contains("Helmet")) {
			setNameHelm(itemName);
			setHelm(itemPoints);
		}
		else if (itemName.contains("Shoulder")) {
			setNameShoulders(itemName);
			setShoulders(itemPoints);
		}
		else if (itemName.contains("Boots")) {
			setNameBoots(itemName);
			setBoots(itemPoints);
		}
		else if (itemName.contains("Coat")) {
			setNameCoat(itemName);
			setCoat(itemPoints);
		}
		else if (itemName.contains("Leggings")) {
			setNameLeggings(itemName);
			setLeggings(itemPoints);
		}
		else if (itemName.contains("Gloves")){
			setNameGloves(itemName);
			setGloves(itemPoints);
		}
	}
	public void changePlayergear(){
		
	}
	public void playersInventory(){
		for (Item i : playersInventory) {
			System.out.println(i);
		}
	}
	public void playersArmor(){
		
	}
	
	public void playersStatusPoints(int statsPoints) {
		
		statsPoints += playerStatsPoints;
		while (statsPoints>0) {
			
			System.out.printf("Do you want to use your %s points? y/n ", statsPoints);
			String input = scan.nextLine();
			if (input.equalsIgnoreCase("y")) {
				
			System.out.println("What stats do you want to incress? "
						+ "\n0: Save points for later."
						+ "\n1: Strength"
						+ "\n2: Toughness"
						+ "\n3: Precision"
						+ "\n4: Vitality"
						+ "\n5: Luck");
				int statusInput = scan.nextInt();
				if (statusInput == 0) {
						playersStatusPoints(getPlayerStatsPoints() + statsPoints);
				}
			System.out.print("How many point do you want to spend? ");
				int numbers = scan.nextInt();
				if (numbers > statsPoints) {
					System.out.println("You do not have that many points ");
				}
				else {
						 if(statusInput == 1){
							setPlayerStrength(numbers);
							statsPoints -= numbers; 
							}
						else if(statusInput == 2){
							setPlayerToughness(numbers);
							statsPoints -= numbers;
							}
						else if(statusInput == 3){
							setPlayerPrecision(numbers);
							statsPoints -= numbers;
							}
						else if(statusInput == 4){
							setPlayerVitality(numbers);
							statsPoints -= numbers;
							}
						else if(statusInput == 5){
							setPlayerLuck(numbers);
							statsPoints -= numbers;
							}
						else {
							setPlayerStatsPoints(getPlayerStatsPoints() + statsPoints);
							break;
						}
					}
				}
			else {
				setPlayerStatsPoints(getPlayerStatsPoints() + statsPoints);
				break;
			}
		}
	}
}
