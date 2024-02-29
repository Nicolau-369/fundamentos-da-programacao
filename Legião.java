public class Legião {
   	// instance variables
	public String callSign;
	private int shieldStrength;

	// methods
	public String fireMissile() {
		return "Pew!";
	}

	public void reduceShield(int amount) {
		shieldStrength -= amount;
	}
} 

