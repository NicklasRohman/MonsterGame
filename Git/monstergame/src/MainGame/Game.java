package MainGame;
import java.util.Scanner;
import MonsterPack.Monster;
import items.Item;
	/**
	 * @author Nicklas.
	 * This class will handle everything with battle, damage and what adventure it will be.
	 */
public class Game {
	
	static Scanner scan = new Scanner(System.in);
	Player player;
	Shop shop = new Shop();

	/**
	* A default constructor.
	*/
	public Game(){
		
	}
	
	/**
	* Print a welcome text and ask for the name of the player.
	*/
	public void game(){
		
		String playerName;
		
		printStars(24);
		System.out.println("\n* Welcome to The Game! *");
		printStars(24);
		
		System.out.print("\nEnter your name: ");
		playerName = scan.nextLine();
		player = new Player(playerName);
		
		player.playersStatusPoints(10);
		
		menu();
						
	}
	
	private void menu(){
		int menuInput;
		
		do {
			System.out.println();
			System.out.println("1. Go adventuring"
							+"\n2. Show Details about your character"
							+"\n3. Show Armor and Weapons"
							+"\n4. Use healing potion " +player.getHealingPotions() +" left" 
							+"\n5. Go shoping"
							+"\n6. Exit game");
		
			menuInput = scan.nextInt();
			
		switch(menuInput){
			case 1:
				System.out.println("Oh a adventure, how exciting!!!");
				goAdventuring();
				break;
			case 2:
				printStars(25);
					
					System.out.println("\n* Name: " + player.getName()
									  +"\n* Level: " + player.getLevel()
									  +"\n* Hp: " + player.getHp() + "/" + player.getPlayerMaxhealth()
									  +"\n* Exp: " + player.getExperiens() + "/" + player.getNextLevel()
									  +"\n* Coins: " + player.getCoins()
									  +"\n* Strength:" + player.getPlayerStrength()
									  +"\n* Toughness: " + player.getPlayerToughness() + " + Armor: +" + player.getTotalArmor()
									  +"\n* Vitality: " + player.getPlayerVitality()
									  +"\n* Presicion: " + player.getPlayerPrecision()
									  +"\n* Luck: " + player.getPlayerLuck()
									  +"\n* Stats Points Avalible: " + player.getPlayerStatsPoints());
									
									  
				printStars(25);
				System.out.println();
				break;
			case 3:
				printStars(25);
				System.out.println("\n* Head: 	" + player.getNameHelm() + " 	+" + player.getHelm() + " Armor"
								 + "\n* Shoulders: 	" + player.getNameShoulders() + " +" + player.getShoulders() + " Armor"
								 + "\n* Coat: 	" + player.getNameCoat() + " 	+" + player.getCoat() + " Armor"
								 + "\n* Gloves: 	" + player.getNameGloves() + "	+" + player.getGloves() +" Armor"
								 + "\n* Leggings: 	" + player.getNameLeggings() + " 	+" + player.getLeggings() + " Armor" 
								 + "\n* Boots: 	" + player.getNameBoots() + " 	+" + player.getBoots()+" Armor" 
								 + "\n* ----------------------------------------------------"
								 + "\n* Total Armor = +"+ player.getTotalArmor()
								 + "\n* Weapon: "+ player.getWeaponName() + " givs: +" + player.getWeaponAP() + " AP extra." 
								 + "\n* Healing potions: "+ player.getHealingPotions());
			
				printStars(25);
				break;
		
			case 4:
				player.restorHealt(player.getHealingPotions());
				break;
			case 5:
				shop.shopList(player);
				
				break;
			case 6:
				System.out.println("Bye");
				System.exit(0);
				break;	
			default:
				System.out.println("Not a valid choice, try again");
			break;
			}				
		} while (menuInput != 6);	
	}

	private void goAdventuring(){
		boolean happening = RandomClass.getAdvetureChance();
		if (happening) {
			scan.nextLine();
			battle(Monster.monsterID(player),Item.itemRarity());
		}
		else {
			int easyWalk = RandomClass.getInt(1, 3);
			
			switch (easyWalk) {
			case 1:
				System.out.println("Taking a easy walk i the park isen't a adventure.");
				break;
			case 2:
				System.out.println("You walk in to the forest to chop soom wood for to night.");
				break;
			case 3:
				System.out.println("You call a easy walk by the lake a adventure?");
				break;
			default:
				break;
			}
		}
	}
	
	private void battle(Monster monster,Item item){
		do {
			int damage = hitFor(player.getAttackPoints()+player.getPlayerStrength()+player.getWeaponAP()) ;
			if (player.isAlive()) {
				System.out.println("Hero "+ player.getName() +" hits with a " + player.getWeaponName()+ " and is dealing "+ damage + " damage to the "+ monster.getMonsterName());
				monster.setHp(monster.getMonsterHp() - damage);			
			}
			else {
				System.out.printf("You have been slayed by the %s",monster.getMonsterName());
				player.setHp(0);
				if (player.getHealingPotions() > 0) {
					System.out.println("Do you want to use a potion? y/n ");
					String input = scan.next();
					if (input.equalsIgnoreCase("y")) {
						player.restorHealt(player.getHealingPotions());
					}
					else {
						System.exit(0);
					}
				}
				else {
					System.exit(0);
				}
			}
			
			damage = hitFor(monster.getMonsterAttackPoints() - player.getPlayerToughness());
			if (monster.isAlive()) {
				System.out.printf("%s hits for %s damage to the hero %s%n",monster.getMonsterName() ,damage ,player.getName());
				player.setHp(player.getHp()-damage);
				if (monster.getMonsterName().equalsIgnoreCase("Vampire Bat")) {
					int vampireBit = damage /3;
					System.out.printf("%s restor %s helth from biting you%n",monster.getMonsterName(),vampireBit);
					monster.setHp(monster.getMonsterHp()+vampireBit);
				}
				
				if (!player.isAlive()) {
						System.out.printf("You have been slayed by the %s",monster.getMonsterName());
						player.setHp(0);
						if (player.getHealingPotions() > 0) {
							System.out.println("Do you want to use a potion? y/n ");
							String input = scan.next();
							if (input.equalsIgnoreCase("y")) {
								player.restorHealt(player.getHealingPotions());
							}
							else {
								System.exit(0);
							}
						}
						else {
							System.exit(0);
						}
					}
			}
			
			else {
				int coin = monster.monsterGiveCoin(player.getPlayerLuck());
				System.out.printf("You have slayed the %s and getting %s experiens and %s coins "
						+ "%n",monster.getMonsterName(),monster.getMonsterGivenExp(),coin);
				boolean magicFind = RandomClass.getMagicFind(player);
				if (magicFind == true) {
					System.out.printf("The %s alsow drops a %s +%s%n",monster.getMonsterName(),item.getItemName(),item.getItemPoints());
					System.out.printf("Do you want to use this %s? y/n ",item.getItemName());
					String input = scan.nextLine();
					if (input.equalsIgnoreCase("y")) {
						
						player.useItem(item.getItemName(),item.getItemPoints());
						
					}
				}
				player.Experiens(monster.getMonsterGivenExp());
				player.setCoins(player.getCoins() + coin);
			
			
			System.out.println();
			}
			
			if (monster.isAlive()) {
				System.out.printf("%s: Hp: %s\n",player.getName(),player.getHp());
				System.out.printf("%s: Hp: %s\n",monster.getMonsterName(),monster.getMonsterHp());	
				System.out.printf("\nContinue fighting press Enter"
						+ "\nR. for run away "
						+ "\nH. to use healing Potion ("+player.getHealingPotions() +")\n");
				
				String input = scan.nextLine();
				if (input.equalsIgnoreCase("R")) {
					break;
				}
				else if (input.equalsIgnoreCase("H")) {
					do {
						player.restorHealt(player.getHealingPotions());
						if (player.getHealingPotions()>0) {
							System.out.println("Use more healing potion? y/n");
							input = scan.next();
						}
						
					} while (input.equalsIgnoreCase("y"));
					
				}
			}
		
		} while (player.isAlive() && monster.isAlive());
	}

	private int hitFor(int d){
		
		if (d <= 0) {
			return 0;
		}
		else {
		int	damage = RandomClass.getInt(0, d);	
			if (damage <0) {
				damage = 0;
			}
			return damage;
		}
		
	}

	private void printStars(int stars){
		for (int i = 0; i < stars; i++) {
			System.out.print("*");
		}
	}
	
}