
public class Nummerserien {

	public static void main(String[] args) {
		// Aufgabe 1 : Schrieb eine Programme, die alles gerade und ungerade Zahlen von 0 bis 99 (beide einschließlich) als Separat Serien drückt : 'for' schleife
//		System.out.println("Gerade/Even Zahlen serien");
//		for(int i = 0 ; i <= 99; i++) {
//			if (i % 2 == 0 && i != 10) {
//				System.out.print(i + ", ");
//			} else if(i % 2 == 0 && i == 10) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println("");
//		System.out.println("");
//		System.out.println("Ungerade/Odd Zahlen serien");
//		for(int i = 0 ; i <= 99; i++) {
//			if (i % 2 == 1)
//				System.out.print(i + ", ");
//		}
		
		// Aufgabe 2 : Schrieb eine Programme, alles positiv ganz Zahlen von -1 bis 50 drückt : 'do-while' schleife
		
//		System.out.println("");
//		System.out.println("");
//		System.out.println("Alles ganz Zahl");
//		int j = -1;
//		do {
//			if (j >= 0) {
//				System.out.print(j + ", ");
//			}
//			j++;
//		} while(j >= 0 && j < 50);
		
		// Aufgabe 3 : Beispiel von Fibonacciserien : wie drückt man diese Nummerserien 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 : 'while' schleife
		
		// x = 0 
		// y = 1
		// x = 0 + y = 1 = z = 1
		// x = 1 + y = 1 = z = 2
		// x = 1 + y = 2 = z = 3
		// x = 2 + y = 3 = z = 5
		// 3 + 5 = 8
//		int x = 0;
//		int y = 1;
//		int z = 0;
//		System.out.println("Fibonnaciserien " + z);
//		while (z < 50) {
//			x = y;	
//			y = z;
//			z = x + y; 
//			if (z == 55) {
//				break;
//			}
//			System.out.println("Fibonnaciserien " + z);
//		}
		
		// Aufgabe 5 : Multiplizieren tabelle für 5
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
			System.out.println(a + " X 5 = " + multiplizieren(a, 5));
			a++;
		}
		
		System.out.println("Multiplizieren tabelle für 5 - for schleife");
		for (int b = 1; b <= 10 ; b++) {
			System.out.println(b + " X 5 = " + (b * 5));
		}
		
		System.out.println("Multiplizieren tabelle für 5 - do-while schleife");
		int c = 1;
		do {
			System.out.println(c + " X 5 = " + (c * 5));
			c++;
		} while (c <= 10);
	}

	static int addieren ( int Zahl1, int Zahl2 ) {
		int x = Zahl1;
		int y = Zahl2;
		
		int ergebnis = x + y;
		
		return ergebnis;
	}
	
	static int multiplizieren ( int Zahl1, int Zahl2 ) {
		int x = Zahl1;
		int y = Zahl2;
		
		int ergebnis = x * y;
		
		return ergebnis;
	}
}
