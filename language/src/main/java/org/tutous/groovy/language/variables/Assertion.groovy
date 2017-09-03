package org.tutous.groovy.language.variables;

import groovy.util.logging.*;

class Assertion {

	public static void main(String[] args) {
		
		try {
			assert true == false : "true can not be false"
		}
		catch(AssertionError error) {
			println error
		}
		
	}

}
