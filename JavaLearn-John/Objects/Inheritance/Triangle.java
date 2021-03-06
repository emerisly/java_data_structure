package Inheritance;

abstract public class Triangle extends Polygon {

	 public Triangle (int n)
	 {
	  super(3);
	 }
	 public int getAngleSum() {
	  return 180;
	 }
	 
	 public abstract String Bingo();

	 public String toString() {
	  return "This polygon has "+3+"sides with an angle sum of "+getAngleSum();
	 }
	}