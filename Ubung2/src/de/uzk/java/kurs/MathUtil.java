package de.uzk.java.kurs;

public class MathUtil {
	void operationUtil () {
		System.out.println("Code läuft im MathUtil");
	}
	
	static void addieren (int Zahl1, int Zahl2 ) {
		System.out.println("Method addieren");
	
		System.out.println(Zahl1 + Zahl2);
	}
	
	static void multiplizieren (int Zahl1, int Zahl2 ) {
		System.out.println("Method multiplizieren");
		int x = Zahl1;
		int y = Zahl2;
		
		int ergebnis = x * y;
		
		System.out.println(ergebnis);
	}
	
	static void substrahieren (int Zahl1, int Zahl2 ) {
		System.out.println("Method substrahieren");
		int x = Zahl1;
		int y = Zahl2;
		
		int ergebnis = x - y;
		
		System.out.println(ergebnis);
	}
	
	static void dividieren (int Zahl1, int Zahl2 ) {
		System.out.println("Method dividieren");
		int x = Zahl1;
		int y = Zahl2;
		
		int ergebnis = x / y;
		
		System.out.println(ergebnis);
	}
	
	static void hochZwei(int Nummer) {
		System.out.println("Method hochZwei");
		int ergebnis = Nummer * Nummer;
		System.out.println(ergebnis);
	}
	
	static void hochDrei(int Nummer) {
		System.out.println("Method hochDrei");
		int ergebnis = Nummer * Nummer * Nummer;
		System.out.println(ergebnis);
	}
}

 /* 
   PrintOnConsole drücken = new PrintOnConsole();
   drücken.ausdrücken();
  */