package AssignmentsChapter5;
import java.util.Scanner;

public class DistanceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("First Point");
		double x1=console.nextDouble();
		double y1=console.nextDouble();
		System.out.println("Second Point");
		double x2=console.nextDouble();
		double y2=console.nextDouble();
		double distance=computeDistance(x1,x2,y1,y2);
		System.out.printf("distance: %.2f",distance);
	}

	static double computeDistance(double x1, double x2, double y1, double y2) {
		// TODO Auto-generated method stub
		double distance;
		distance=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		return distance;
	}

}
