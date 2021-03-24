package Inheritance;

abstract public class Polygon {
	private int numberOfSides;
	
	public Polygon(int n) {
		numberOfSides=n;
	}
	
	public int getAngleSum() {
		return (numberOfSides-2)*180;
	}
	
	public abstract String haha();

	public String toString() {
		return "This polygon has "+numberOfSides+" sides with Angle Sum of: "+getAngleSum();
	}

}
