package de.uzk.java.kurs.person;

import de.uzk.java.kurs.Human;

public class Frau extends Human {
	
	int numberOfChildren;
	boolean inUnionOrPair;
	
	public void inAUnionOrAPair(boolean setAsPair) {
		inUnionOrPair = setAsPair;
	}

	public boolean isMother() {
		if (numberOfChildren > 0) {
			return true;
		}
		return false;
	}
	
	public void beingParent() {
		numberOfChildren++;
	}
	
	public Frau() {
		numberOfChildren = 0;
		inUnionOrPair = false;
	}
	
	public void findJob(Human h) {
		System.out.println("Person to find job");
	}
}
