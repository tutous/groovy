package org.tutous.groovy.language.variables

class Booleans {

	public static void main(String[] args) {

		def truth = true
		def lies = false

		assert truth && lies == false
		
		// useful methods
		assert truth.and(lies).equals(false)
		assert truth.or(lies).equals(true)

	}
}
