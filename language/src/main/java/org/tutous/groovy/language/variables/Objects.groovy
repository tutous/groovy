package org.tutous.groovy.language.variables

class Objects {

	public static void main(String[] args) {

		def employee = new Employee(name: "Uwe", email: "usluga@t-online.de")

		println employee.getName()
		println employee.getEmail()

		// set name to Anton
		employee.setName("Anton");
		println employee.getName()

		// useful methods
		println employee.dump()
		employee.with{ setName("Uwe") }
		println employee.dump()

	}


	static class Employee{
		def name
		def email
		def getName() {
			return name;
		}
		def setName(name) {
			this.name = name;
		}
		def getEmail() {
			return email;
		}
		def setEmail(email) {
			this.email = email;
		}
	}
}
