package ObjectLearning;

public class PolygonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polygon shape0 = new Polygon();
		System.out.println(shape0);
		
		Polygon shape1 = new Polygon(5);
		System.out.println(shape1);
		//System.out.println("Angle sum: "+shape1.getAngleSum());
		
		Quadrilateral shape2 = new Quadrilateral();
		System.out.println("shape two"+shape2);
		
		Parallelogram shape3 = new Parallelogram(5,5);
		System.out.println("********"+shape3);
		
		Rectangle shape4 = new Rectangle(3,9);
		System.out.println(shape4);
		
	}

}
