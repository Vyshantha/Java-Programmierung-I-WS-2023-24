package de.uzk.java.kurs;

public class MathUtil {
	
	PrintOnConsole drucker = new PrintOnConsole();
	
	void operationUtil () {
		drucker.drückenMitWunsch("Code läuft im MathUtil");
	}
	
	int addieren ( int Zahl1, int Zahl2 ) {
//		drucker.drückenMitWunsch("Method addieren");
		int x = Zahl1;
		int y = Zahl2;
		
		int ergebnis = x + y;
		
//		drucker.drückenMitWunsch(ergebnis + "");
		
		return ergebnis;
	}
	
	int multiplizieren ( int Zahl1, int Zahl2 ) {
		drucker.drückenMitWunsch("Method multiplizieren");
		int x = Zahl1;
		int y = Zahl2;
		
		int ergebnis = x * y;
		
		return ergebnis;
	}
	
	int substrahieren ( int Zahl1, int Zahl2 ) {
		drucker.drückenMitWunsch("Method substrahieren");
		int x = Zahl1;
		int y = Zahl2;
		
		int ergebnis = x - y;
		
		drucker.drückenMitWunsch(ergebnis + "");
		
		return ergebnis;
	}
	
	int dividieren ( int Zahl1, int Zahl2 ) {
		drucker.drückenMitWunsch("Method dividieren");
		int x = Zahl1;
		int y = Zahl2;
		
		int ergebnis = x / y;
		
		drucker.drückenMitWunsch(ergebnis + "");
		
		return ergebnis;
	}
	
	void hochZwei(int Nummer) {
		drucker.drückenMitWunsch("Method hochZwei");
		int ergebnis = Nummer * Nummer;
		drucker.drückenMitWunsch(ergebnis + "");
	}
	
	int hochDrei(int Nummer) {
		drucker.drückenMitWunsch("Method hochDrei");
		int ergebnis = Nummer * Nummer * Nummer;
		drucker.drückenMitWunsch(ergebnis + "");
		
		return ergebnis;
	}
}


//PrintOnConsole drucker = new PrintOnConsole();
//drucker.drücken("Method addieren " + Zahl1 + Zahl2 + "");
//drucker.drücken(Zahl1 + Zahl2 + "");
