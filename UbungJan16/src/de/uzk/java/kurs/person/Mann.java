package de.uzk.java.kurs.person;

import de.uzk.java.kurs.Human;

public class Mann extends Human {
	
	int numberOfChildren;
	boolean inUnionOrPair;
	
	public void inAUnionOrAPair(boolean setAsPair) {
		inUnionOrPair = setAsPair;
	}
	
	public boolean isFather() {
//		if (numberOfChildren > 0) {
//			return true;
//		}
//		return false;
		return (numberOfChildren > 0) ? true : false;
	}
	
	public void beingParent() {
		numberOfChildren++;
	}
	
	public Mann() {
		numberOfChildren = 0;
		inUnionOrPair = false;
	}
	
	public void findJob(Human h) {
		System.out.println("Person to find job");
	}
}
