package inheritance;

public class ShapeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Type name = new Type();
		//Polygon polygon1 = new Polygon(8);
		//System.out.println(polygon1);
		
		System.out.println();
		Quadrilateral quaderlateral1 = new Quadrilateral();
		System.out.println(quaderlateral1);
		
		System.out.println();
		Parallelogram parallelogram1 = new Parallelogram(5,6);
		System.out.println(parallelogram1);
		myMethod(parallelogram1);
		
		System.out.println();
		Rectangle rectangle1 = new Rectangle(10,5);
		System.out.println(rectangle1);
		System.out.println(rectangle1.getArea());
		myMethod(rectangle1);
		
		System.out.println();
		Rhombus rhombus1 = new Rhombus(4,5);
		System.out.println(rhombus1);
		System.out.println(rhombus1.getClass());
		rhombus1.FRQ();
		rhombus1.MCQ();
		
		System.out.println();
		System.out.println(rhombus1 instanceof Rhombus);
		if(rectangle1 instanceof Rectangle) {
			System.out.println("True");
		}
		//if(rectangle1 instanceof Rhombus) {
			//System.out.println("OK");
		//}
		
		
	}
	
	public static void myMethod(Object o) {
		System.out.println("CLASS IS: "+o.getClass());
	}

}
