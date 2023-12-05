
/*
 * 
   Aufgabe 1 : Erstell ein Integer array der größe 100 ist und fülle jeden Wert von 100 (Anfang) bis 1 (Ende) auf
   
   Aufgabe 2 : Schreib Programme, die der Multiplizieren Tabelle für 5 mit 3 Schleifen-formen anzeigt
   
   Aufgabe 3 : Schreib ein Methode, wo alle Elemente in eine Integer Array wird addiert oder multipliziert abhängig von die Eingabe
   Hinweis : wenn ihr mit Switch-Case möglichkeiten versucht 
		`Name_der_Methode (Integer_Array , "String");`
   Hinweis : wenn ihr mit If-Else möglichekeiten versucht
		`Name_der_Methode (Integer_Array , 'Char');`
   
   Aufgabe 4 : Schreib ein Programm, wo diese Konsole Output generiert wird :
  
  	|--------------------------------|
	|** Java macht lebens leichter **|
	|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|
	|________________________________|
	
   Hinweis : benutze mit 2 `Schleifen`
   
   Aufgabe 5 : Beispiel von Fibonacciserien : wie drückt man diese Nummerserien 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 : 'while' schleife
   
   Hinweis : Drück die erste Element in die serien ausserhalb die Schleife
   
 */

public class Ubung {

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
		
		System.out.println("");
		
		// Aufgabe 2 : Schreib Programme, die der Multiplizieren Tabelle für 5 mit 3 Schleifen-formen anzeigt
		// 1 X 5 = 5;
		// 2 X 5 = 10;
		// 3 X 5 = 15;
		// 4 X 5 = 20;
		// 5 X 5 = 25;
		// 6 X 5 = 30;
		// 7 X 5 = 35;
		// 8 X 5 = 40;
		// 9 X 5 = 45;
		// 10 X 5 = 50;
		
		System.out.println("Multiplizieren tabelle für 5 - while schleife");
		int a = 1;
		while (a <= 10) {
			System.out.println(a + " X 5 = " + (a * 5));
			a++;
		}
		System.out.println("");
		System.out.println("Multiplizieren tabelle für 5 - for schleife");
		for (int b = 1; b <= 10 ; b++) {
			System.out.println(b + " X 5 = " + (b * 5));
		}
		System.out.println("");
		System.out.println("Multiplizieren tabelle für 5 - do-while schleife");
		int c = 1;
		do {
			System.out.println(c + " X 5 = " + (c * 5));
			c++;
		} while (c <= 10);
		
		/*
		 * Aufgabe 3 : Schreib ein Methode, 
		 * wo alle Elemente in eine Integer Array wird addiert oder multipliziert
		 */
		// Hinweis : wenn ihr mit Switch-Case möglichkeiten versucht 
		// Name_der_Methode (Integer_Array , "String");
		// Hinweis : wenn ihr mit If-Else möglichekeiten versucht
		// Name_der_Methode (Integer_Array , 'Char');
		System.out.println("");
		
		int[] array1 = {1, 10, 100, 1000};
		anArrayOperierenSwitchCase(array1, "+");
		anArrayOperierenIfElse(array1, '+');
		
		System.out.println("");
		
		int[] array2 = {9, 99, 999};
		anArrayOperierenSwitchCase(array2, "*");
		anArrayOperierenIfElse(array2, '*');
		
		System.out.println("");
		
		/* 
		 * Aufgabe 4 : Schreib ein Programm, wo diese Konsole Output generiert wird :
  
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
		
		/*
		 * Aufgabe 5 : Beispiel von Fibonacciserien : wie drückt man diese Nummerserien 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 : 'while' schleife
		 * 
		 * Hinweis : Drück die erste Element in die serien ausserhalb die Schleife
		 * */
		
		// x = 0 
		// y = 1
		// x = 0 + y = 1 = z = 1
		// x = 1 + y = 1 = z = 2
		// x = 1 + y = 2 = z = 3
		// x = 2 + y = 3 = z = 5
		// 3 + 5 = 8
		int x = 0;
		int y = 1;
		int z = 0;
		System.out.println("Fibonnaciserien " + z);
		while (z < 50) {
			x = y;	
			y = z;
			z = x + y; 
			if (z == 55) {
				break;
			}
			System.out.println("Fibonnaciserien " + z);
		}
	}
	
	static void anArrayOperierenSwitchCase(int[] arrayToOperate, String operation) {
		System.out.println("Methode - anArrayOperierenSwitchCase");
		switch (operation) {
			case "+":
				int ergebnis = 0;
				System.out.println("Operation - addieren");
				for(int i = 0; i < arrayToOperate.length; i++) {
					ergebnis = ergebnis + arrayToOperate[i]; // { 1, 10, 100, 1000 }
				}
				System.out.println("Ergebnis ist " + ergebnis);
				break;
			case "*":
				ergebnis = 1;
				System.out.println("Operation - multipizieren");
				for(int i = 0; i < arrayToOperate.length; i++) {
					ergebnis = ergebnis * arrayToOperate[i]; // {9, 99, 999}
				}
				System.out.println("Ergebnis ist " + ergebnis);
				break;
			default:
				System.out.println("Methode - kein richtigen Wert");
				break;
		}
	}
	
	static void anArrayOperierenIfElse(int[] arrayToOperate, char operation) {
		System.out.println("Methode - anArrayOperierenIfElse");
		if (operation == '+') {
			int ergebnis = 0;
			System.out.println("Operation - addieren");
			for(int i = 0; i < arrayToOperate.length; i++) {
				ergebnis = ergebnis + arrayToOperate[i];
			}
			System.out.println("Ergebnis ist " + ergebnis);
		} else if (operation == '*') {
			int ergebnis = 1;
			System.out.println("Operation - multipizieren");
			for(int i = 0; i < arrayToOperate.length; i++) {
				ergebnis = ergebnis * arrayToOperate[i];
			}
			System.out.println("Ergebnis ist " + ergebnis);
		} else {
			System.out.println("Methode - kein richtigen Wert");
		}
	}
}