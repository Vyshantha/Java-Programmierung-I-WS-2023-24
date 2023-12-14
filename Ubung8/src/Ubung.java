
public class Ubung {
	
	public static void main (String[] args) {
		
		System.out.println("Aufgabe 1");
		
		String längsteWort = "Rinderkennzeichnungsfleischetikettierungsüberwachungsaufgabenübertragungsgesetz";
		
		int[] positionen = {10 , 20 , 30 , 40 , 50, 60, 70, 80, 90};
		for (int x = 0; x < positionen.length; x++) {
			if (positionen[x] < längsteWort.length()) {
				System.out.println("am Position " + positionen[x] + " charakter ist " + längsteWort.toCharArray()[positionen[x]]);
			} else {
				System.out.println("Die Position " + positionen[x] + " ist länger als das Wort");
			}
		}
		
		System.out.println("");
		System.out.println("Aufgabe 2");
		// Erstellt die Methode `static int search(char[] array, String toFind)`
		// Hinweis : hier wird nur die erste Instanz der Zeichenkette gefunden
		search(längsteWort.toCharArray(), "über");
		System.out.println("");
		
		System.out.println("Aufgabe 3");
		
		// Javadoc : java.lang.String
		/*
		 * char charAt (int index)
		 * 
		 * int compareTo (String anotherString)
		 * 
		 * int indexOf (String anotherString)
		 * 
		 * boolean startsWith (String suffix)
		 * 
		 * boolean endsWith (String suffix)
		 * 
		 * String substring (int beginIndex, int endIndex)
		 * 
		 */
		
		// Finde die Charakter am Position 10 , 20 , 30 , 40 , 50, 60, 70, 80, 90 ohne Absturz der Programm
		for (int x = 0; x < positionen.length; x++) {
			if (positionen[x] < längsteWort.length()) {
				System.out.println("am Position " + positionen[x] + " charakter ist " + längsteWort.charAt(positionen[x]));
			} else {
				System.out.println("Die Position " + positionen[x] +" ist länger als das Wort");
			}
		}
		
		System.out.println("");
		// Mit welchem Prefix endet das Wort
		System.out.println("Prefix " + längsteWort.startsWith("über"));
		System.out.println("");
		
		System.out.println("");
		// Mit welchem Suffix endet das Wort
		System.out.println("Suffix " + längsteWort.endsWith("gesetz"));
		System.out.println("");
		
		// Zeig wie den Index Methode benutzt man mit eine Zeichenkette
		// Hinweis : hier wird nur die erste Instanz der Zeichenkette gefunden
		System.out.println("Index " + längsteWort.indexOf("über"));
		System.out.println("Hinweise position > -1 bedeutet, die Teil der Zeichenkette besteht in die Zeichenkette");
		
		System.out.println("verkürze Wort : " + längsteWort.substring(längsteWort.indexOf("über"), längsteWort.indexOf("über") + "über".length()));
		
		
		// Vergleich teil des Wortes mit das Wort 'gesetz'
		System.out.println("Teil der Zeichenkette '" + längsteWort.substring(73, 79) + "' vergleich : " + längsteWort.substring(73, 79).compareTo("gesetz"));
		System.out.println("Hinweise : 0 = true und ansonst = false ");
	}
	
	static int search(char[] stringArray, String toFind) {
		char[] zuSuchen = toFind.toCharArray();
		for (int y = 0; y < zuSuchen.length ; y++) {
			for(int x = 0; x < stringArray.length ; x++) {
				if (stringArray[x] == zuSuchen[y]) {
					System.out.println(x + " x " + stringArray[x] + " y " +  zuSuchen[y]);
					if (y < zuSuchen.length - 1) {
						y = y + 1;
					} else {
						if (y == zuSuchen.length - 1) {
							System.out.println("Das Suchwort ist am Position " + (x - 3) + " gefunden.");
							break;
						}
					}
				}
			}
		}
		return -1;
	}
	
}