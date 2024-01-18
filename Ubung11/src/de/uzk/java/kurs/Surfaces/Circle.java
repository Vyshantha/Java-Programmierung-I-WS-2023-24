package de.uzk.java.kurs.Surfaces;

public class Circle implements Polygon {
	  private double radius;

	  public Circle(double radius) {
		  this.radius = radius;
	  }

	  void setSize(double radius) {
	      this.radius = radius;
	  }

	  public void getArea() {
	    double area = Math.PI * radius * radius;
	    System.out.println("Area of the circle is " + area);
	  }

	  // overrides the getSides()
	  public double[] getSides() {
	    System.out.println("sharing radius of Circle.");
	    double allSides[] = {'∞'};
	    return allSides;
	  }
	  
	  // overrides the getSize()
	  public double getSize() {
	    System.out.println("sharing ∞ sides of Circle with radius - " + radius);
	    return radius;
	  }
}