package de.uzk.java.kurs.Surfaces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 
 1.   Erstell die Klassen Circle und Square mit eigene Konstruktor und die entsprechende Methoden void setSize(double length), public void getArea(), public double[] getSides() und public double getSize() umgesetzt.
 2.  Umbau die existierende Klassen, damit die beiden Klassen Circle und Square denen Interface bzw. Line und Polygon umsetzen werden.
 3.  Erstell die Methoden, wo die Ausnahmebehandlung möglichkeiten z.B. try-catch und throws werden umgesetzt. Nimm die Beispiel öffne eine Datei.
 *
 */
class Ubung {
	  public static void main(String[] args) {

	    // create an object of Square
	    Square s = new Square(1);
	    s.getArea();
	    double[] sides = s.getSides();
	    double length = s.getSize();

	    // create an object of Circle
	    Circle c = new Circle(1);
	    c.getArea();
	    double[] side = c.getSides();
	    double radius = c.getSize();
	    
	    
	    
	    
	    
	    openMyFileWithTryCatch();
	    try {
			openMyFileWithExceptionThrows();
		} catch (FileNotFoundException e) {
			System.out.println("Exception throwing");
			e.printStackTrace();
		}
	  }
	  
	  private static void openMyFileWithExceptionThrows() throws FileNotFoundException {
		  FileInputStream fis = new FileInputStream("test.txt");
	  }

	  private static void openMyFileWithTryCatch () {
		    try {
				FileInputStream fis = new FileInputStream("test.txt");
			} catch (FileNotFoundException e) {
				System.out.println("try-catch handling");
				e.printStackTrace();
			}
	  }
}