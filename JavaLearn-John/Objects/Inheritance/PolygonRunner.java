package Inheritance;

public class PolygonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Polygon shape1 = new Polygon(5);
		//System.out.println(shape1);
		//System.out.println("Angle sum: "+shape1.getAngleSum());
		
		Quadrilateral shape2 = new Quadrilateral();
		System.out.println(shape2);
		
		Parallelogram shape3 = new Parallelogram(5,5);
		System.out.println(shape3);
		
		Rectangle shape4 = new Rectangle(3,9);
		System.out.println(shape4);
		
		Rhombus shape5 = new Rhombus(5,10);
		System.out.println(shape5);
		
		System.out.println(print(shape4));
		
		
		
		if(shape2 instanceof Polygon) {
			System.out.println("OK1");
		}
		if(shape5 instanceof Polygon) {
			System.out.println("OK2");
		}
		if(shape2 instanceof Quadrilateral) {
			System.out.println("OK3");
		}
		if(shape2 instanceof Rhombus) {
			System.out.println("OK4");
		}
		else {
			System.out.println("NOT OK 4");
		}
	}
	
	public static String print(Object o) {
		return o.toString();
	}
	
	

}
