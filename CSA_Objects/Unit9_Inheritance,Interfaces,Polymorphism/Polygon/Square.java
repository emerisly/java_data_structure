package Polygon;

public class Square extends Rectangle implements rightAnglable{
	public Square(int s) {
		super(s,s);
	}
	public Square() {
		super(1,1);
	}
	public String getAngle() {
		return "90 degrees.";
	}
	public String toString() {
		return super.toString()+" (sides are all the same).\n\tA SQUARE!";
	}
}
