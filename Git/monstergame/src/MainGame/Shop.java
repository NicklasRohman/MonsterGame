package MainGame;

import java.util.ArrayList;
	/**
	* @author Nicklas
	* Class Shop keeps track of everything that happens in the shop 
	*/

public class Shop{
	
	static ArrayList<String>weponsLvl3Stenght2 = new ArrayList<String>();
	static ArrayList<String>weponsLvl5Stenght4 = new ArrayList<String>();
	static ArrayList<String>weponsLvl7Stenght6 = new ArrayList<String>();
	/**
	* a default constructor for the shop
	*/
	public Shop() {
		weponsLvl3Stenght2.add(0,"wood club");
		weponsLvl3Stenght2.add(1,"knife");
		weponsLvl3Stenght2.add(2,"axe");
		
		weponsLvl5Stenght4.add(0,"morning star");
		weponsLvl5Stenght4.add(1,"sword");
		weponsLvl5Stenght4.add(2,"maul");
		
		weponsLvl7Stenght6.add(0,"great Sword");
		weponsLvl7Stenght6.add(1,"war Hammer");
		weponsLvl7Stenght6.add(2,"bardiche");
		
	}
	
	/**
	* Shows all the things in the shop and change status depending on what player bought in the store.
	* @param p Instance of the Player class
	*/
	protected void shopList(Player p){
		int shopInput = 0;
		do {
	
		int counterLvl3 = 4;
		int counterLvl5 = 7;
		int counterLvl7 = 10;
		
			printStars(25);
			
			System.out.println("\n* This things are in the store."
					+ "\n* 0. Exit shop." 
					+ "\n* 1. Amulet of strengh: givs you +1 in strength. Cost: 5 Coins"
					+ "\n* 2. Ring of toughness: givs you +1 in toughness. Cost: 5 Coins"
					+ "\n* 3. Healing Potions: givs back 20hp. Cost: 5 Coins");
			if((p.getLevel()>=3) &&(p.getPlayerStrength() >=2)) {
			for (String wL3 : weponsLvl3Stenght2) {
				System.out.println("* "+ counterLvl3 + ". "+ wL3 + " +3 Attack Points. Cost 5 Coins");
				counterLvl3++;
				}
			}
			if((p.getLevel()>=5)&&(p.getPlayerStrength()>=4)){
				for (String wL5 : weponsLvl5Stenght4) {
					System.out.println("* "+ counterLvl5 + ". "+ wL5 + " +5 Attack Points. Cost 7 Coins");
					counterLvl5++;
					}
				}
			if((p.getLevel()>=7)&&(p.getPlayerStrength()>=6)){
				for (String wL7 : weponsLvl7Stenght6) {
					System.out.println("* "+ counterLvl7 + ". "+ wL7 + " +10 Attack Points. Cost 12 Coins");
					counterLvl7++;
					}
				}
			
			printStars(25);
				System.out.print("\n* You have "+ p.getCoins() + " coins"
					+ "\n* What do you want to buy: ");
				shopInput = Game.scan.nextInt();
				
					if (shopInput != 0 &&  p.getCoins() < 5) {
						System.out.println("Can't afford that, now get out of my shop!!!");
						shopInput = 0;
						if (shopInput >= counterLvl3 &&  p.getCoins() < 7){
							System.out.println("Can't afford that, now get out of my shop!!!");
							shopInput = 0;
						}
						if (shopInput >= counterLvl5 &&  p.getCoins() < 10){
							System.out.println("Can't afford that, now get out of my shop!!!");
							shopInput = 0;
						}
						if (shopInput >= counterLvl7 &&  p.getCoins() < 15){
							System.out.println("Can't afford that, now get out of my shop!!!");
							shopInput = 0;
						}
					}
					else {
						switch (shopInput) {
						case 1:
							p.setPlayerStrength(p.getPlayerStrength() +1);
							p.setCoins(p.getCoins() - 5);
							System.out.println("You have now "+ p.getPlayerStrength() +" in Strenght");
							break;
						case 2:
							p.setPlayerToughness(p.getPlayerToughness() + 1);
							p.setCoins(p.getCoins() - 5);
							System.out.println("You have now "+ p.getPlayerToughness() +" in Toughness");
							break;
						case 3:
							p.setHealingPotions(p.getHealingPotions()+1);
							p.setCoins(p.getCoins() - 5);
							System.out.println("You have now "+ p.getHealingPotions() +" of healing potions");
							break;
							
						case 4:
						case 5:
						case 6:
							p.setWeaponAP(3);
							p.setCoins(p.getCoins() - 5);
								if (shopInput == 4) {
									p.setWeaponName(Shop.weponsLvl3Stenght2.get(0));
								}
								if (shopInput == 5) {
									p.setWeaponName(Shop.weponsLvl3Stenght2.get(1));
								}
								if (shopInput == 6) {
									p.setWeaponName(Shop.weponsLvl3Stenght2.get(2));
								}
							
							break;
						
						case 7:
						case 8:
						case 9:
							p.setWeaponAP(5);
							p.setCoins(p.getCoins() - 7);
								if (shopInput == 7) {
									p.setWeaponName(weponsLvl5Stenght4.get(0));
								}
								if (shopInput == 8) {
									p.setWeaponName(weponsLvl5Stenght4.get(1));
								}
								if (shopInput == 9) {
									p.setWeaponName(weponsLvl5Stenght4.get(2));
								}
							
							break;
							
						case 10:
						case 11:
						case 12:
							p.setWeaponAP(10);
							p.setCoins(p.getCoins() - 12);
								if (shopInput == 10) {
									p.setWeaponName(weponsLvl7Stenght6.get(0));
								}
								if (shopInput == 11) {
									p.setWeaponName(weponsLvl7Stenght6.get(1));
								}
								if (shopInput == 12) {
									p.setWeaponName(weponsLvl7Stenght6.get(2));
								}
							
							break;
							
						default:
							break;
						}
					}
		} while (shopInput != 0);
	}		
	
	private void printStars(int stars){
		for (int i = 0; i < stars; i++) {
			System.out.print("*");
		}
	}
}

