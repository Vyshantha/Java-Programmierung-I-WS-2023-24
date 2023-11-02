package de.uzk.java.kurs;

public class Comparison {
	void vergleich () {
		System.out.println("Code läuft im Comparison");
	}
	
	static void vergleichZwischenZahlen(int i, int j) {
		boolean wert = i == j;
		System.out.println("vergleichZweiZahlen : Zahl1 " + i + " Zahl2 " + j + " Auswertung "+ wert);  
	}
	
	static void grosseralsZwischenZahlen(int i, int j) {
		boolean wert = i > j;
		System.out.println("grosseralsZweiZahlen : Zahl1  " + i + " Zahl2 " + j + " Auswertung " + wert);  
	}
	
	static void kleineralsZwischenZahlen(int i, int j) {
		boolean wert = i < j;
		System.out.println("kleineralsZweiZahlen : Zahl1 " + i + " Zahl2 " + j + " Auswertung "+  wert);  
	}
}

/*
   static void vergleichZweiZeichenketten(String Zeichenketten1, String Zeichenketten2) {
		boolean wert = Zeichenketten1 == Zeichenketten2;
		System.out.println("vergleichen wir zwei Zeichenketten " + wert); 
	}
	
	static void vergleichZeichenketteEineZahl(String Zeichenketten, int Zahl) {
		int Nummer = Integer.valueOf(Zahl);
		boolean wert = Zeichenketten == Nummer;
		System.out.println("vergleichen wir eine Zeichenkette und eine Zahl " + wert); 
	}
 */