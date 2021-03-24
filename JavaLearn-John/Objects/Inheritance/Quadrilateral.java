package Inheritance;

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

	@Override
	public String haha() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
