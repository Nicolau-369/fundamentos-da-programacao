public class Legião-2 {
    
    // instance variables
	public String callSign;
	private int shieldStrength;

	// constructor method
	public Legião() {
		callSign = "The nameless ship";
		shieldStrength = 100;
	}

	// overloaded constructor
	public Legião(String name) {
		callSign = name;
		shieldStrength = 200;
	}

	// other methods omitted
}
