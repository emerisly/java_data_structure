package Polygon;

public class Polygon {

	private int numberOfSides;
	
	public Polygon(int n) {
		this.numberOfSides=n;
		}
	public int getAngleSum() {
		return (this.numberOfSides-2)*180;
	}
	public String toString() {
		return "A polygon with "+this.numberOfSides+" of sides"
				+ " has an angle sum of "+this.getAngleSum()+".";
	}
}

