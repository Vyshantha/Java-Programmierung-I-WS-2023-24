package de.uzk.java.kurs.person;

import de.uzk.java.kurs.Human;

public class Individual extends Human implements Person {

	public void findJob() {
		System.out.println("Person looking for a Job");
	}

	public void findJob(Human h) {
		System.out.println("Person  " + h + " looking for a Job");
	}
	
	public void findHouse() {
		System.out.println("Person finding a house");
	}

}
