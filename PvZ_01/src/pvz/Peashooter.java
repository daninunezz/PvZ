package pvz;

public class Peashooter {
	private static final int cost = 50;
	private int endurance = 3;
	private static final int frequency = 2;
	private static final int damage = 1;
	//Range only shoots forward
	public int getEndurance() {
		return endurance;
	}
	public static int getCost() {
		return cost;
	}
	public static int getFrequency() {
		return frequency;
	}
	public static int getDamage() {
		return damage;
	}	
}
