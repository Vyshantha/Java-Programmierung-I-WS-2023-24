/*
 * 
 * 1. Erstell 3 `Klasse` nämliche `Mann`, `Frau`, `NonBinary` im eine Person Package, die eine `de.uzk.java.kurs.Human` Klasse vererbt. Die `Human` Klasse hat 3 Eigenschaften - age, name, gender und auf die vererbte Klasse es gibt inUnionOrAPair, numberOfChildren Eigenschaften. Notizen die nötige Eigenschaften müssen initialisiert werden.
 * 
 * 2. Schreib auf die erbte Klassen die Methode - `inAUnionOrAPair(boolean setAsPair)`, `beingParent()`, `boolean isParent()` geeignet für die obenstehende Eigenschaften.
 * 
 * 3. Erstell die `setFrau(Human h)`, `setMann(Human h)`, `setNonBinary(Human h)` Methode, die statische Instanz mit die erbte Klasse verbinden wäre.
 * 
 * 4. Schreib eine Method `foundMate(Human h1, Human h2)`, wo die sie sich paaren und eine Method `havingBaby(Human h1, Human h2)` wo die paarchen eine Kind bekommen.
 * 
 * 5. Was müssen im Code geändert werden, damit diese Zuweisung `Human h = new Human()` verhindert wird.
 * 
 * 6. Wie kann man eine findJob(Human h) Method in erbte Klasse deklarieren.
 * 
 * 7. Zeig eine interface Beispiel mit eine neue Person Klasse
 *
 */

package de.uzk.java.kurs;

import de.uzk.java.kurs.person.Mann;
import de.uzk.java.kurs.person.NonBinary;
import de.uzk.java.kurs.person.Frau;

public class Human {
	
	String name;
	int age;
	String gender;
	
	static Mann m;
	static Frau f;
	static NonBinary nb;
	
	static void foundMate(Human h1, Human h2) {
		if(h1.gender.equals("Frau") && h2.gender.equals("Mann")) {
			m.inAUnionOrAPair(true);
			f.inAUnionOrAPair(true);
		} else if (h1.gender.equals("Frau") && h2.gender.equals("Frau")) {
			f.inAUnionOrAPair(true);
			f.inAUnionOrAPair(true);
		} else if (h1.gender.equals("Mann") && h2.gender.equals("Mann")) {
			m.inAUnionOrAPair(true);
			m.inAUnionOrAPair(true);
		} else if (h1.gender.equals("NonBinary") && h2.gender.equals("NonBinary")) {
			nb.inAUnionOrAPair(true);
			nb.inAUnionOrAPair(true);
		} else if (h1.gender.equals("Frau") && h2.gender.equals("NonBinary")) {
			f.inAUnionOrAPair(true);
			nb.inAUnionOrAPair(true);
		} else if (h1.gender.equals("NonBinary") && h2.gender.equals("Mann")) {
			nb.inAUnionOrAPair(true);
			m.inAUnionOrAPair(true);
		}
	}
	
	static Human havingBaby(Human h1, Human h2) {
		if(h1.gender.equals("Frau") && h2.gender.equals("Mann")) {
			Human h3 = new Human();
			h3.name = "Thomas";
			h3.age = 1;
			m.beingParent();
			f.beingParent();
			if (f.isMother() == true) {
				System.out.println(h1.name + " is a mother at age of " + h1.age);
			} else {
				System.out.println(h1.name + " is not yet a mother");
			}
			if (m.isFather() == true) {
				System.out.println(h2.name + " is a father at age of " + h2.age);
			} else {
				System.out.println(h2.name + " is not yet a father");
			}
			return h3;
		} else if(h1.gender.equals("Frau") && h2.gender.equals("Frau")) {
			Human h3 = new Human();
			h3.name = "Thomas";
			h3.age = 1;
			f.beingParent();
			f.beingParent();
			if (nb.isParent() == true) {
				System.out.println(h1.name + " is a parent at age of " + h1.age);
			} else {
				System.out.println(h1.name + " is not yet a parent");
			}
			if (nb.isParent() == true) {
				System.out.println(h2.name + " is a parent at age of " + h2.age);
			} else {
				System.out.println(h2.name + " is not yet a parent");
			}
			return h3;
		} else if(h1.gender.equals("Mann") && h2.gender.equals("Mann")) {
			Human h3 = new Human();
			h3.name = "Thomas";
			h3.age = 1;
			m.beingParent();
			m.beingParent();
			if (nb.isParent() == true) {
				System.out.println(h1.name + " is a parent at age of " + h1.age);
			} else {
				System.out.println(h1.name + " is not yet a parent");
			}
			if (nb.isParent() == true) {
				System.out.println(h2.name + " is a parent at age of " + h2.age);
			} else {
				System.out.println(h2.name + " is not yet a parent");
			}
			return h3;
		} else if(h1.gender.equals("NonBinary") && h2.gender.equals("NonBinary")) {
			Human h3 = new Human();
			h3.name = "Thomas";
			h3.age = 1;
			nb.beingParent();
			nb.beingParent();
			if (nb.isParent() == true) {
				System.out.println(h1.name + " is a parent at age of " + h1.age);
			} else {
				System.out.println(h1.name + " is not yet a parent");
			}
			if (nb.isParent() == true) {
				System.out.println(h2.name + " is a parent at age of " + h2.age);
			} else {
				System.out.println(h2.name + " is not yet a parent");
			}
			return h3;
		}
		return null;
	}
	
	protected void setNonBinary(Human h) {
		gender = "NonBinary";
		//this.nb = new NonBinary();
		Human.nb = new NonBinary();
		if (Human.nb.isParent() == true) {
			System.out.println(h.name + " is a parent at age of " + h.age);
		} else {
			System.out.println(h.name + " is not yet a parent");
		}
	}
	
	protected void setMann(Human h) {
		gender = "Mann";
		//this.m = new Mann();
		Human.m = new Mann();
		if (Human.m.isFather() == true) {
			System.out.println(h.name + " is a father at age of " + h.age);
		} else {
			System.out.println(h.name + " is not yet a father");
		}
	}
	
	protected void setFrau(Human h) {
		gender = "Frau";
		//this.f = new Frau();
		Human.f = new Frau();
		if (Human.f.isMother() == true) {
			System.out.println(h.name + " is a mother at age of " + h.age);
		} else {
			System.out.println(h.name + " is not yet a mother");
		}
	}
	
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "Anna";
		h1.age = 30;
		h1.setFrau(h1);
		
		Human h2 = new Human();
		h2.name = "Gerald";
		h2.age = 31;
		h2.setMann(h2);
		
		foundMate(h1, h2);
		havingBaby(h1, h2);
	}
}
