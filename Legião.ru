class Legiao
	
	# instance variables
	@call_sign
	@shield_strength

	# methods
	def fire_missile
		return "Pew!"
	end

	def reduce_Shield(amount)
		shield_strength -= amount
	end

end