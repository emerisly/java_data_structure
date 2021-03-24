package inheritance;

public class Quadrilateral extends Polygon implements MathTest, PhysicsTest{

	public Quadrilateral() {
		setSides(4);
	}
	
	public String toString() {
		return "This is a quadrilateral with 4 sides. It's angle sum is "+getAngleSum();
		//shape1.getAngleSum(); Polygon.getAngleSum(shape1);
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void shortAnswer() {
		// TODO Auto-generated method stub
		System.out.println("Finish your math short Answer");
	}

	@Override
	public void FRQ() {
		// TODO Auto-generated method stub
		System.out.println("Do your math FRQ question");
	}

	@Override
	public void MCQ() {
		// TODO Auto-generated method stub
		System.out.println("Do your physics MCQ question");
		
	}
	
}
