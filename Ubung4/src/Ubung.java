
/*
 * Aufgabe 1: Schrieb eine Funktion/Method die uns liefert ob ein Nummer oder Zeichnenketten Nummern ein ganz Zahl ist
 * 
 * 
 * Aufgabe 2: Schrieb eine Funktion/Method die uns liefert ein fließkommaZahl zwischen 0 und 1 für Eingabe
 * 
 * 
 * Aufgabe 3: wenn man 2 Zeichnen Namens des Tages eingibt (z.B. Sonntag als So), dann liefert uns zurück was ich heute machen muss
 */

public class Ubung {

	public static void main(String[] args) {
		
		// Aufgabe 1: Schrieb eine Funktion/Method die uns liefert ob ein Nummer oder Zeichnenketten Nummern ein ganz Zahl ist
		boolean wert1 = ganzZahlOderNicht (10);
		boolean wert2 = ganzZahlOderNicht (10.5f);
		boolean wert3 = ganzZahlOderNicht (10.00000000000000000000093f);
		boolean wert4 = ganzZahlOderNicht (0.1f);
		boolean wert5 = ganzZahlOderNicht (Float.valueOf("8.5f"));
		boolean wert6 = ganzZahlOderNicht (Integer.valueOf("8"));
		boolean wert7 = ganzZahlOderNicht (-10.9f);
		
		// Aufgabe 2: Schrieb eine Funktion/Method die uns liefert ein fließkommaZahl zwischen 0 und 1 für Eingabe
		
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(80));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(8));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(1990));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(-712));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(100));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(90.8f));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(0.76f));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(-0.51f));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(-0.0f));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(0.0f));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(0));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(1));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(-1));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(-1.0f));
		System.out.println("Wo liegt den Nummer : " + nummerZwischen0und1(1.0f));
		
		// Aufgabe 3: wenn man 2 Zeichnen Namens des Tages eingibt (z.B. Sonntag als So), dann liefert uns zurück was ich heute machen muss
		
		benutzerEingabe("Mi");
		benutzerEingabe("Di");
		benutzerEingabe("Sa");
	}
	
	static boolean ganzZahlOderNicht (float Nummer) {
		if (Nummer % 1 == 0) { 
			// Method 1 zu vergleichen : Nummer % 1 == 0
			/*
			 	Method ganzZahlOderNicht : Nummer 10.0 ist eine ganz Zahl
				Method ganzZahlOderNicht : Nummer 10.5 ist nicht eine ganz Zahl
				Method ganzZahlOderNicht : Nummer 10.0 ist eine ganz Zahl
				Method ganzZahlOderNicht : Nummer 0.1 ist nicht eine ganz Zahl
				Method ganzZahlOderNicht : Nummer 8.0 ist eine ganz Zahl
				Method ganzZahlOderNicht : Nummer -10.9 ist nicht eine ganz Zahl
			*/
			System.out.println("Method ganzZahlOderNicht : Nummer " + Nummer + " ist eine ganz Zahl");
			
			// Method 2 zu vergleichen : Nummer == (int) Nummer
			
			// Method 3 zu vergleichen : (int)(Math.ceil(Nummer)) == (int)(Math.floor(Nummer));
			
			return true;
		} else {
			System.out.println("Method ganzZahlOderNicht : Nummer " + Nummer + " ist nicht eine ganz Zahl");
			return false;
		}
	}
	
	static float nummerZwischen0und1 (float Nummer) {
		float zahl = (Nummer < 0) ? Nummer * (-1) : Nummer;
		float ergebnis = zahl / 100;
		if (ergebnis > 1) {
			return nummerZwischen0und1 (ergebnis);
		} else {
			return ergebnis;
		}
//		float value = (ergebnis > 1) ? nummerZwischen0und1 (ergebnis) : ( (ergebnis > 0.01 && ergebnis < 0.1) ? ergebnis : ergebnis ); 
//		return value;
	}
	
	static void benutzerEingabe (String input) {
		System.out.println("Benutzer Eingabe im userInput Method : " + input);
		switch (input.toLowerCase()) {
		case "mo":
			System.out.println("heute ist Montag!!! Nein, ich muss noch arbeiten oder lernen");
			System.out.println("Erinnerung morgen gibt es ein Java Übung Kurs");
			
			break;
		case "di":
			System.out.println("Gut Dienstag schon..");
			System.out.println("Erinnerung morgen muss die Hausaufgabe abgegeben werden");
			break;
		case "mi":
			System.out.println("Mitte der Woche !");
			System.out.println("Erinnerung heute zum Java Kurs Seminar");
			break;
		case "do":
			System.out.println("Donnerstag, das bedeutet morgen ist Freitag");
			System.out.println("Erinnerung heute gitb noch ein Java Übung Kurs");
			break;
		case "fr":
			System.out.println("Freitag schon!! das hat gut gelohnt");
			break;
		default:
			System.out.println("Zeit zum spASSSS!");
			break;
		}
	}

}
