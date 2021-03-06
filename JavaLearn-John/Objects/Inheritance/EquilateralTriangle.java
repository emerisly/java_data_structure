package Inheritance;

abstract public class EquilateralTriangle extends Triangle implements regularPolygon {
	 public EquilateralTriangle (int n)
	 {
	  super(3);
	 }
	 public int getAngleSum() {
	  return 180;
	 }
	 
	 public double getInterorAngleMeasure()
	 {
	  return 60.0;
	 }
	 public String getSidesLength(double sideLength1, double sideLength2, double sideLength3)
	 {
	  if (sideLength1!=sideLength2||sideLength2!=sideLength3||sideLength1!=sideLength3)
	  {
	   return "This is not an equilateral triangle";
	  }
	  return "This is an equilateral triangle";
	 }
	 public abstract String Bingo();

	 public String toString() {
	  return "This equilateral triangle has "+3+"sides with an angle sum of "+getAngleSum()
	    + "with each angle being "+getInterorAngleMeasure()+" and with three equal sides.";
	     
	 }
	}