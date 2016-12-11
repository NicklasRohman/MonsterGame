package MainGame;
	/**
 * @author Nicklas
	* Interface IPlayer keeps track of everything that class Player need to now
	*/
interface IPlayer{
	
	/**
	* Get players name.
	* @return name returns the name of the player.
	*/
	public String getName();
	
	/**
	* Get players hp.
	* @return hp returns the health of the player.
	*/
	public int getHp();
	
	/**
	* Get players experience.
	* @return experience returns the experience of the player.
	*/
	public int getExperiens();
	
	/**
	* Get players level.
	* @return level returns the level of the player.
	*/
	public int getLevel();
	
	/**
	* Get next level.
	* @return nextLevel returns the nextLevel value.
	*/
	public int getNextLevel();
	
	/**
	* Get players money status.
	* @return playerCoins returns how much coins the player have.
	*/
	public int getCoins();
	
	/**
	* Changes the players money status.
	* @param coins how much is to be changed to playerCoins.
	*/
	public void setCoins(int coins);
	
	/**
	* Get players strength.
	* @return playerStrength returns the strength of the player.
	*/
	public int getPlayerStrength();
	
	/**
	* Changing players strength.
	* @param playerStrength sets the new playerStrength.
	*/
	public void setPlayerStrength(int playerStrength);
	
	/**
	* Get players toughness.
	* @return playerToughness returns the toughness of the player.
	*/
	public int getPlayerToughness();
	
	/**
	* Changing players toughness.
	* @param playerToughness sets the new playerToughness.
	*/
	public void setPlayerToughness(int playerToughness);
	
	/**
	* Get number of players healing.
	* @return healingPotions returns how many health potions player have left.
	*/
	public int getHealingPotions();
	
	/**
	* Changing number of healing potion.
	* @param healingPotions sets the new number of amount.
	*/
	public void setHealingPotions(int healingPotions);
	
	/**
	* Get players attack points.
	* @return attackPoints returns players attackPoints.
	*/
	public int getAttackPoints();
	
	/**
	* Changes the player's hp.
	* @param hp sets what the new hp will be.
	*/
	public void setHp(int hp);	
	
	/**
	* Get players WeaponAP status.
	* @return weaponAP returns players weapon attack points.
	*/
	public int getWeaponAP();
	/**
	* Changes the player's weapon attack points.
	* @param weaponAP sets how much weapon points it will be.
	*/
	public void setWeaponAP(int weaponAP);
	/**
	* Get players WeaponName.
	* @return weaponName returns the name of players weapon.
	*/
	public String getWeaponName();
	/**
	* Changes the player's weapon name.
	* @param name sets the name of the weapon.
	*/
	public void setWeaponName(String name);
	/**
	* Check if the the player's still alive.
	* @return true if the player lives, otherwise false.
	*/
	public boolean isAlive();
	
	/**
	* Adding on the player's experience and check if the player has leveled up.
	* @param exp exp is the number of experience points. 
	*/
	public void Experiens(int exp);
	
	/**
	* restorHealt method restore players hp, unless the player has already max hp.
	*@param healthPotain checks if player have any helthPotain left
	*/
	public void restorHealt(int healthPotain);
}
