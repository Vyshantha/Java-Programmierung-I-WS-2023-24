
import java.util.Scanner;

public class Ubung {

	public static void main(String[] args) {
		
		// Aufgabe 4 : Beispiel von Scanner Methode für Eingabe des Benutzers
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Meine Eingabe " + sc.nextLine());
			int anzahlderTag = Integer.parseInt(sc.nextLine());
			if (anzahlderTag >= 1 && anzahlderTag <= 7) {
				benutzerEingabe(anzahlderTag);
			} else if (anzahlderTag >=8) {
				System.out.println("Bitte die Eingabe erneuert geben nur zwischen 1 und 7");
			} else {
				System.out.println("Unbestimmte Zahl");
				break;
			}
		}
	
	}
	
	static void benutzerEingabe (int input) {
		System.out.println("Benutzer Eingabe im userInput Method : " + input);
		switch (input) {
		case 1:
			System.out.println("heute ist Montag!!! Nein, ich muss noch arbeiten oder lernen");
			System.out.println("Erinnerung morgen gibt es ein Java Übung Kurs");
			break;
		case 2:
			System.out.println("Gut Dienstag schon..");
			System.out.println("Erinnerung morgen muss die Hausaufgabe abgegeben werden");
			break;
		case 3:
			System.out.println("Mitte der Woche !");
			System.out.println("Erinnerung heute zum Java Kurs Seminar");
			break;
		case 4:
			System.out.println("Donnerstag, das bedeutet morgen ist Freitag");
			System.out.println("Erinnerung heute gitb noch ein Java Übung Kurs");
			break;
		case 5:
			System.out.println("Freitag schon!! das hat gut gelohnt");
		default:
			System.out.println("Zeit zum spASSSS!");
		}
	}
}