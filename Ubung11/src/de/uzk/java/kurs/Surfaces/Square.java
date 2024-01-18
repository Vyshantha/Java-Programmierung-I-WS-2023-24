package de.uzk.java.kurs.Surfaces;

public class Square implements Line, Polygon {
	  private double length;

	  public Square(double length) {
		  this.length = length;
	  }

	  public void setSize(double length) {
	      this.length = length;
	  }
	  
	  // overrides the getSize()
	  public double getSize() {
	    System.out.println("sharing 4 sides of Square - " + length);
		return length;
	  }

	  public void getArea() {
	    double area = length * length;
	    System.out.println("Area of the square is " + area);
	  }

	  // overrides the getSides()
	  public double[] getSides() {
	    System.out.println("sharing 4 sides of Square.");
	    double allSides[] = {this.length, this.length, this.length, this.length};
	    return allSides;
	  }
	  
}
