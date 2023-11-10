import java.util.Scanner;

public class Anwendung {

	public static void main(String[] args) {
		// Aufgabe 3: wenn man 2 Zeichnen Namens des Tages eingibt (z.B. Sonntag als So), dann liefert uns zurück was ich heute machen muss   
		
		Scanner sc = new Scanner(System.in);
//		int i = 0;
		
//		while(true) {
			benutzerEingabe(sc.nextLine());
//			 i = i + 1;
//		}

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
		default:
			System.out.println("Zeit zum spASSSS!");
		}
	}
}
