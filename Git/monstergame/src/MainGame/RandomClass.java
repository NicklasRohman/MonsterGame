package MainGame;

import java.util.ArrayList;
import java.util.Random;
	/**
	* @author Nicklas.
	* RandomClass is for all the random functions.
	*/
public class RandomClass {
	static Random random = new Random();
	int[] common = new int[65]; 
	ArrayList<String>uncommon = new ArrayList<String>();
	
	
	/**
	* Method that returns 90% true else false.
	* @return true/false.
	*/
	public static boolean getAdvetureChance(){
		return random.nextDouble()<0.9;
	}
	
	/**
	* Method that is generate a value between max and min.
	* @param min minimum number.
	* @param max maximum number.
	* @return value of a number betwin max - min.
	*/
	public static int getInt(int min,int max){
		
			return min+random.nextInt(max-min);
		
	}
	public static boolean getMagicFind(Player p){
		double magic = (double)p.getPlayerLuck()/100;
		return random.nextDouble()<(0.01 + magic);
	}
	
}
