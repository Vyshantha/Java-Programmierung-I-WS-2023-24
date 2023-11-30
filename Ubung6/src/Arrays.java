
/*
 * 
   Aufgabe 1 : Erstell ein Integer array der größe 100 ist und 
   	fülle jeden Wert von 100 (Anfang) bis 1 (Ende) auf
   
   Aufgabe 2 : Erstell ein Integer array der größe 10 ist und 
   	fülle jeden Wert zufällig mit 0 und 1 auf
   
   Hinweis : 
   	`Math.random()` gibt einen zufälligen `double` Wert zurück
   	`Math.round()` kann einen `float` oder `double` runden gibt jedoch einen `long` zurück
   
   Aufgabe 3 : Schreib ein Methode, die eine Zeichenkette einnimmt und 
   	umgekehrter Reihe des Zeichenkette in der Konsole ausgibt
   	
   Hinweis : nutze die `Zeichenkette.toCharArray()` Aufruf
   
   Aufgabe 4 : Schreib ein Methode, wo alle Elemente in eine Integer Array wird addiert oder multipliziert abhängig von die Eingabe
   
   Aufgabe 5 : Schreib ein Programm, wo diese Konsole Output generiert wird :
  
  	|--------------------------------|
	|** Java macht lebens leichter **|
	|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|
	|________________________________|
	
   Hinweis : benutze mit 2 `Schleifen`
   
 */

public class Arrays {

	public static void main(String[] args) {
		
		/* Aufgabe 1 : 
		 * Erstell ein Integer array der größe 100 ist und 
		 * fülle jeden Wert von 100 (Anfang) bis 1 (Ende) auf 
		 */
		
		int[] values = new int[100];
		int k = 0;
		while (k < values.length) {
			values[k] = values.length - k;
			System.out.println("Am Position " + k + " wert ist - " + values[k++]);
			//k = k + 1;
		}
		
		/*
		 * Aufgabe 2 : Erstell ein Integer array der größe 10 ist und fülle jeden Wert zufällig mit 0 und 1 auf
   
		   Hinweis : 
		   	`Math.random()` gibt einen zufälligen `double` Wert zurück
		   	`Math.round()` kann einen `float` oder `double` runden gibt jedoch einen `long` zurück
		 */	
		
		System.out.println("");
		int [] zufälligWert = new int[10];
		int x = 0;
		while(x < zufälligWert.length) {
			zufälligWert[x++] = (int) Math.round(Math.random());
			System.out.println("zufällig Wert - " + zufälligWert[x-1]);
		}
		
		/* 
		 * Aufgabe 3 : Schreib ein Methode, die eine Zeichenkette einnimmt und 
		 * umgekehrter Reihe des Zeichenkette in der Konsole ausgibt
		 */
		System.out.println("");
		
		reverseString("Java macht spaß!");
		
		System.out.println("");
		
		/*
		 * Aufgabe 4 : Schreib ein Methode, 
		 * wo alle Elemente in eine Integer Array wird addiert oder multipliziert
		 */
		System.out.println("");
		
		int[] array1 = {1, 10, 100, 1000};
		anArrayOperieren(array1, "+");
		
		System.out.println("");
		
		int[] array2 = {9, 99, 999};
		anArrayOperieren(array2, "*");
		
		System.out.println("");
		
		/* 
		 * Aufgabe 5 : Schreib ein Programm, wo diese Konsole Output generiert wird :
  
		  	|--------------------------------|
			|** Java macht lebens leichter **|
			|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|
			|________________________________|
	
   			Hinweis : benutze mit 2 Schleifen
   		 */
		
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0; j < 33 ; j++) {
				if (i == 0) {
					if (j == 0) {
						System.out.print("|");
					} else if (j == 32) {
						System.out.print("|");
						break;
					}
					System.out.print("-");
				} else if (i == 1) {
					System.out.println("");
					System.out.println("|** Java macht lebens leichter **|");
					break;
				} else if (i == 2) {
					break;
				} else if (i == 3) {
					if (j == 0) {
						System.out.print("|");
					} else if (j == 32) {
						System.out.print("|");
						System.out.println("");
						break;
					}
					System.out.print("@");
				} else if (i == 4) {
					if (j == 0) {
						System.out.print("|");
					} else if (j == 32) {
						System.out.print("|");
						System.out.println("");
						break;
					}
					System.out.print("_");
				}
			}
		}
		System.out.println("");
	}
	

	static void reverseString(String value) {
		char[] normal = value.toCharArray();
		System.out.print("normal - ");
		for (int y = 0; y < normal.length ; y++) {
			System.out.print(normal[y]);
		}
		System.out.println("");
		
		char [] umgekehrt = value.toCharArray();
		System.out.print("umgekehrt - ");
		for (int z = umgekehrt.length - 1; z >= 0 ; z--) {
			System.out.print(umgekehrt[z]);
		}
	}
	
	static void anArrayOperieren(int[] arrayToOperate, String operation) {
		switch (operation) {
			case "+":
				int ergebnis = 0;
				System.out.println("Operation - addieren");
				for(int i = 0; i < arrayToOperate.length; i++) {
					ergebnis = ergebnis + arrayToOperate[i];
				}
				System.out.println("Ergebnis ist " + ergebnis);
				break;
			case "*":
				ergebnis = 1;
				System.out.println("Operation - multipizieren");
				for(int i = 0; i < arrayToOperate.length; i++) {
					ergebnis = ergebnis * arrayToOperate[i];
				}
				System.out.println("Ergebnis ist " + ergebnis);
				break;
		}
	}
}
