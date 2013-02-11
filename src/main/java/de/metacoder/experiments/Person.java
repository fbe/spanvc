package de.metacoder.experiments;

public class Person {
	
	private final String forename;
	private final String surname;
	
	public Person(String forename, String surname) {
		this.forename = forename;
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}
	
	public String getSurname() {
		return surname;
	}
	
}
