package ObjectLearning;

public class Polygon {
	private int numberOfSides;
	
	//real constructor
	public Polygon(int n) {
		numberOfSides=n;
	}
	
	//default constructor
	//has an empty parameter and set n to 0.
	public Polygon() {
		this(0);
	}
	

	
	public int getAngleSum() {
		return (numberOfSides-2)*180;
	}
	
	public String toString() {
		return "This polygon has "+numberOfSides+" sides with Angle Sum of: "+getAngleSum();
	}

}
