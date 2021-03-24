package OurPointClass;
import java.util.*;

public class PointRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		
		Point point1=new Point(1,1);
		
		Point point2=new Point();
		point2.setX(3);
		point2.setY(5);
		
		Point point3=new Point();
		
		System.out.println(point1);//(1,1)
		System.out.println(point2);//(3,5)
		System.out.println(point3);//(0,0)
		System.out.println();

		System.out.println("Point1 to (0,0): "+point1.getDIstanceFromOrigin());
		System.out.println("Get Point1 X: "+point1.getX());
		System.out.println("Get Point1 Y: "+point1.getY());
		System.out.println();
		System.out.println("Enter x and y for point1");
		point1.setX(console.nextInt());
		point1.setY(console.nextInt());
		System.out.println(point1);
		System.out.println("Point1 to (0,0): "+point1.getDIstanceFromOrigin());
		
		console.close();

	}

}
