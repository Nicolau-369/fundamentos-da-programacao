public Legião: NSObject {
	
	// instance variables
	public var callSign: String
	private var _shieldStrength: Int

	// methods
	func fireMissile() -> String {
		return "Pew!"
	}

	func reduceShield(amount: Int) {
		_shieldStrength -= amount
	}
}