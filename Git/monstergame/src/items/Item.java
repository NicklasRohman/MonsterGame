package items;

import MainGame.RandomClass;

public class Item {
	
	private String itemName;
	private int itemPoints;
	
	public Item(String name,int points) {
	this.itemName = name;
	this.itemPoints = points;
	}
	
	public int getItemPoints() {
		return itemPoints;
	}

	public void setItemPoints(int itemPoints) {
		this.itemPoints = itemPoints;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public static Item itemRarity(){
		int itemMax;
		int itemMin;
		int points = 0;
		int itemRarity = RandomClass.getInt(1, 100)+1; 
		String itemName1 = null;
		if (itemRarity >= 1 && itemRarity <= 65) {
			//common
			itemName1 = "Cloth ";
			itemMin = 1;
			itemMax = 4;
			points = RandomClass.getInt(itemMin, itemMax);
		}
		else if (itemRarity >= 66 && itemRarity <= 89) {
			//uncommon
			itemName1 = "Leather ";
			itemMin = 5;
			itemMax = 9;
			points = RandomClass.getInt(itemMin, itemMax);
		}
		else if (itemRarity >= 90 && itemRarity <= 99) {
			//rare
			itemName1 = "Metalic ";
			itemMin = 10;
			itemMax = 15;
			points = RandomClass.getInt(itemMin, itemMax);
		}
		else if (itemRarity == 100) {
			//Legandary
			System.out.println("You found a Legendary item!!!");
			itemName1 = "Legendary ";
			itemMin = 15;
			itemMax = 20;
			points = RandomClass.getInt(itemMin, itemMax);
		}
		else{
			System.out.println("It's broken!!");
		}
		String itemName2 = null;
		String itemName = null;
		int itemNumber = RandomClass.getInt(1, 6);
		switch (itemNumber) {
		case 1:
			itemName2 = "Helmet";
			itemName = itemName1 + itemName2;
			return new Helmet(itemName,points);
			
		case 2:
			itemName2 = "Shoulders";
			itemName = itemName1 + itemName2;
			
			return new Shoulders(itemName,points);
			
		case 3:
			itemName2 = "Gloves";
			itemName = itemName1 + itemName2;
			
			return new Gloves(itemName,points);
			
		case 4:
			itemName2 = "Coat";
			itemName = itemName1 + itemName2;
			
			return new Coat(itemName,points);
			
		case 5:
			itemName2 = "Leggings";
			itemName = itemName1 + itemName2;
			
			return new Leggings(itemName,points);
			
		case 6:
			itemName2 = "Boots";
			itemName = itemName1 + itemName2;
			
			return new Boots(itemName,points);
			
		default:
			System.out.println("Somthing got wrong");
			break;
		}
		return null;
		
	}
}
