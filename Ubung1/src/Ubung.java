
public class Ubung {

	/*
	 * AGENDA 
	 *
	 * 1. Umsetzen die Operationen
	 * 
	 * 2. Vergleich zwischen Variablen
	 * 
	 * 3. Benutze bestehenden Methoden : toUpperCase() | valueOf()
	 * 
	 * 4. Stellen Funktionen auf anderen Datei/File ein
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Aufruf im main method");
		
		PrintOnConsole ausdrucken = new PrintOnConsole();
		ausdrucken.ausdrücken();
		
		Comparison vegleich = new Comparison();
		
		vegleich.vergleichZwischenZahlen(1, 2);
		vegleich.grosseralsZwischenZahlen(2, 2);
		vegleich.kleineralsZwischenZahlen(3, 2);
		
		MathUtil operationen = new MathUtil();
		
		String h = "10";
		
		operationen.addieren(Integer.valueOf(h), 10);
		operationen.addieren(10, 2);
		operationen.substrahieren(1, 5);
		operationen.dividieren(10, 2);
		operationen.multiplizieren(10, 0);
		operationen.hochZwei(10);
		operationen.hochDrei(10);
	}

}

