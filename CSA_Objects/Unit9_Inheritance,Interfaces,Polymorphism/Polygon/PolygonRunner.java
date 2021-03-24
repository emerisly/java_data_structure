package Polygon;

public class PolygonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon a=new Polygon(5);
		System.out.println("1. "+a);
		Polygon b=new Quadrilateral();
		System.out.println("2. "+b);
		Parallelogram c=new Parallelogram(5,8);
		System.out.println("3. "+c);
		Rectangle d=new Rectangle(1,2);
		System.out.println("4. "+d);
		Rhombus e=new Rhombus(2);
		System.out.println("5. "+e);
		Square f=new Square(3);
		System.out.println("6. "+f);
	}

}
