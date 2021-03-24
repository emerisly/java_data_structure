package ObjectLearning;

public class Quadrilateral extends Polygon{
	
	//fields
	//constructor
	
	public Quadrilateral() {
		super(4);
	}
	
	
	//methods
	
	//toString
	public String toString() {
		return "This is a Quadrilateral. It has 4 sides with an angle sum of "+getAngleSum();
	}
	
}
