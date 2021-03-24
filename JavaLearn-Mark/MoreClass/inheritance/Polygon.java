package inheritance;

abstract public class Polygon{
	private int numberOfSides;
	
	/*
	public Polygon(int n) {
		numberOfSides=n;
	}
	*/
	
	public void setSides(int n) {
		numberOfSides=n;
	}
	
	public abstract int getArea();
	
	public int getAngleSum() {
		return (numberOfSides-2)*180;
	}
	
	public String toString() {
		return "This is a polygon with "+numberOfSides+" sides"+", and an angle of "+getAngleSum();
	}

}
