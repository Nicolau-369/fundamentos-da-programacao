public class Spaceship {    
	
	// instance variables
	public String callSign;
	private int shieldStrength;

	// constructor method
	public Spaceship() {
		callSign = "The nameless ship";
		shieldStrength = 100;
	}

	// overloaded constructor
	public Spaceship(String name) {
		callSign = name;
		shieldStrength = 200;
	}

	// other methods omitted
}
