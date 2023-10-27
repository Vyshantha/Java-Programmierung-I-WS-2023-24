package de.uzk.java.kurs;
/*
 * AGENDA 
 *
 * 1. `Importieren` dieses `git-repository` in eurer Entwicklungsumgebung - [GitHub Projekte in Eclipse importieren](https://drive.google.com/file/d/1IpwHADmwViEGQ7Pf4BgybUYpz7WBoMe5/view)
 * 2. `Exportieren` das Projekt, damit es in einer anderen Entwicklungsumgebung geöffnet werden kann
 * 3. `Short-Cuts` im `Eclipse`, wie die müssen verwendt werden
 * 4. Verschieben Nutzung von `Kommentaren`
 * 5. `Methoden` mit mehreren `Argumente` und mit `Rückgabewert` üben
 * 6. Zeig Datentypen Beispiele und wie kann man die `Fehler | Warnung` aufheben während Nutzungen den komplexen `Ausdrücken`
 * 7. Zeig anderen Formen der `Default Package` wie könnte man das nutzen
 * 8. Zeig vergleich zwischen `Eclipse` und `Terminal | Command-line` tool für Auführung der Java Programme 
 * 
 */

public class Ubung2 {public static void main(String[] args) {
	
	System.out.println("Aufruf im main method");
	
	// Short-Cuts
	// STRG + N 			| CMD + N 			: Erstellungswizard
	// STRG + S 			| CMD + S 			: eine unspeichert Datei speichern
	// STRG + SHIFT + S | CMD + SHIFT + S 	: mehreren unspeicherten Datei speichern
	// STRG + W 			| CMD + W 			: eine offen Fenster/Editor schließen
	// STRG + SHIFT + W | CMD + SHIFT + W 	: alle offen Fenster/Editor schließen
	// STRG + P 			| CMD + P 			: Datei Ausdrücken
	// STRG + I 			| CMD + I 			: nachdem Datei/File geklickt ist, dann Eigenschaften wird geöffnet
	
	
	// 'Wort' -> STRG + LEERTASTE : Vorschläge
	// Βeispiel :
	// sysout + STRG + LEERTASTE (alle Betriebsystem Tastaturen)

	PrintOnConsole ausdrucken = new PrintOnConsole();
		ausdrucken.ausdrücken();

	Comparison vegleich = new Comparison();

	vegleich.vergleichZwischenZahlen(1, 2);
	
	// Indentation / Vertiefung : STRG + I | CMD + I für eine Zeil
		vegleich.grosseralsZwischenZahlen(2, 2);
		
	// Indentation / Vertiefung : Code Blocke / mehrere Zeile Auswahl und STRG + I | CMD + I
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

	// Zeile Löschen : STRG + D | CMD + D
	operationen.hochDrei(10);
	
	// Undo
	// STRG + Z | CMD + Z
	
	// Redo
	// STRG + SHIFT + Z | CMD + SHIFT + Z
	
	// Suche und Ersetzen
	// STRG + F | CMD + F
	
	// komplette Datei Auto-formattieren
	// STRG + SHIFT + F | CMD + SHIFT + F
	
	// Java Datei laufen lassen | Anwendung Auführung
	// STRG + F11 | CMD + Fn + F11
	
	// Eine Block Kommentar
	/*
	 * Das ist ein Kommentar
	 */

	//STRG + CMD + / | STRG + CMD + \ = Block Kommentar hinfügt | löschen
	/*
	 * { test comment }
	 * 
	 */

	//Εben das ist auch ein Kommentar
	//STRG + 7 | CMD + 7 = Zeile Kommentar

	/*
	 * Use-Cases / Benutzbarkeit
	 * 
	 * 1. Dokumentation für Methoden wo Info über Parameters / Argumente ist zum Verfügung,
	 * 	   dazu Darstellung über warum diese Methode ist überhaupt zu Nutzung
	 * 		- Manuelle geschrieben
	 * 		- Kunstliche Intelligenz generiert
	 * 
	 * 2. Information für eure Peers Entwickler:innen wofür immer noch Notwendig Sachen 
	 *     müssen umgesetzt werden
	 *      - TODO, FIXME, CHECKME, DOCME, TESTME, PENDING
	 * 
	 * 3. Infos über Anforderungen / Defekte damit die Zusammenfassung von den Methoden ist gut erklärt
	 * 
	 * 4. Überblick zu kennen, zu Unterrichten, usw.
	 * 
	 */
	
	/* Fehler/Warnungen aufheben und komplexen Ausdrücken */
	// System.out.println('Hallo Welt');
	// string x = "Hallo";
	// i = 5;
	// x = i + 5
	// int j = (50 - 10) / i;
	// boolean b == 1;
	// boolean b = 2 + 5 == 7;
	// System.out.println(b); 
	// System.out.println(false + true);
	// System.out.println(false + 2);
	
	
	// Was muss hier geändert werden damit 'wert' "true" ist?
	// boolean wert = (22 % 6)/2 == 0;
	// System.out.println(wert);
	// String a = "1" + 5;
	// int j = Integer.valueOf(a) + 5;
	// System.out.println("j hat wert : " + j + ", a hat wert " + a);
	
	/*
	  byte var1 = 12; 
	  System.out.println(var1); 
	  short var2 = 21;
	  System.out.println(var2); 
	  float var3 = 20.6; 
	  System.out.println(var3); 
	  double var4 = 20.6f; 
	  System.out.println(var4); 
	  long var5 = 20.6L;
	  System.out.println(var5);
	 */
	 
	/* οben stehenden Methoden mit Rückgabewert */
	// int x = operationen.hochDrei(10) / operationen.dividieren(10, 2) + operationen.addieren(10, 2) - operationen.addieren(Integer.valueOf(h), 10);

	/*
	 * Code Laufen Method 1 : von Eclipse
	 * 	Play button (ensure "src" > right-click > Build Path >  Use as Source Folder
	 * 
	 * Code Laufen Method 2 : von Command-Line or Terminal
	 * 	java -version // Command-Line or Terminal
	 *  javac <FILENAME.java> // JDK : PATH für eure Umgebung schon gesetzt ist
	 *  java FILENAMECLASSFILE // JRE
	 */
		
	}}

