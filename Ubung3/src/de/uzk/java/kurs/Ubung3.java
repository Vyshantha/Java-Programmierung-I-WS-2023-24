package de.uzk.java.kurs;

public class Ubung3 {

	/*
	 * AGENDA 
	 *
	 * 1. Wiederholung der paar wichtigen Themen
	 * 2. Rückgabewert Übung
	 * 3. Nummernserien Beispiele, die im Console Fenster gedruckt werden soll
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Aufruf im main method");
		
		PrintOnConsole drucker = new PrintOnConsole();
		drucker.drücken();
		
		MathUtil operationen = new MathUtil();
		
		operationen.addieren(10, 10);
		operationen.addieren(10, 2);
		operationen.substrahieren(1, 5);
		operationen.dividieren(10, 2);
		operationen.multiplizieren(10, 0);
		operationen.hochZwei(10);
		operationen.hochDrei(10);
		
	}

}

//drucker.drücken("gut");

//System.out.println("");
//System.out.println("");
//drucker.drücken("Beispiel 1 : 0 , 2 , 4 , 6 , 8 , 10 , 12 , 14 , 16, 18");
//
//int x;
//x = 0;
//drucker.serienEven(x % 2 == 0, x);
//x = 1;
//drucker.serienEven(x % 2 == 0, x);
//x = 2;
//drucker.serienEven(x % 2 == 0, x);
//x = 3;
//drucker.serienEven(x % 2 == 0, x);
//x = 4;
//drucker.serienEven(x % 2 == 0, x);
//x = 5;
//drucker.serienEven(x % 2 == 0, x);
//x = 6;
//drucker.serienEven(x % 2 == 0, x);
//x = 7;
//drucker.serienEven(x % 2 == 0, x);
//x = 8;
//drucker.serienEven(x % 2 == 0, x);
//x = 9;
//drucker.serienEven(x % 2 == 0, x);
//x = 10;
//drucker.serienEven(x % 2 == 0, x);
//
//System.out.println("");
//System.out.println("");
//drucker.drücken("Beispiel 2 : 1 , 3 , 5 , 7 , 9 , 11 , 13 , 15 , 17, 19");
//
//x = 0;
//drucker.serienEven(x % 2 == 1, x);
//x = 1;
//drucker.serienEven(x % 2 == 1, x);
//x = 2;
//drucker.serienEven(x % 2 == 1, x);
//x = 3;
//drucker.serienEven(x % 2 == 1, x);
//x = 4;
//drucker.serienEven(x % 2 == 1, x);
//x = 5;
//drucker.serienEven(x % 2 == 1, x);
//x = 6;
//drucker.serienEven(x % 2 == 1, x);
//x = 7;
//drucker.serienEven(x % 2 == 1, x);
//x = 8;
//drucker.serienEven(x % 2 == 1, x);
//x = 9;
//drucker.serienEven(x % 2 == 1, x);
//x = 10;
//drucker.serienEven(x % 2 == 1, x);
//
//System.out.println("");
//System.out.println("");
//drucker.drücken("Beispiel 3 : 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21, 34");
//x = 0;
//int y = 1;
//drucker.serienFibonacci(y);
//
//int z = operationen.addieren(x, y);
//drucker.serienFibonacci(z);
//
//x = y;
//y = z;
//z = operationen.addieren(x, y);
//drucker.serienFibonacci(z);
//
//x = y;	
//y = z;
//z = operationen.addieren(x, y);
//drucker.serienFibonacci(z);
//
//x = y;	
//y = z;						
//z = operationen.addieren(x, y);
//drucker.serienFibonacci(z);
//
//x = y;
//y = z;
//z = operationen.addieren(x, y);
//drucker.serienFibonacci(z);
//
//x = y;	
//y = z;
//z = operationen.addieren(x, y);
//drucker.serienFibonacci(z);
//
//x = y;	
//y = z;
//z = operationen.addieren(x, y);
//drucker.serienFibonacci(z);
//
//x = y;
//y = z;
//z = operationen.addieren(x, y);
//drucker.serienFibonacci(z);
