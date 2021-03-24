package ExtraCredit;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int door_area=20;
		int window_area=15;
		System.out.println("Enter length, height, wideth, and number of windows and doors");
		Scanner console=new Scanner(System.in);
		double length=console.nextDouble();
		double height=console.nextDouble();
		double width=console.nextDouble();
		int number_of_doors=console.nextInt();
		int number_of_windows=console.nextInt();
		long paint_area=Math.round(2*height*(length+width)-number_of_doors*door_area-number_of_windows*window_area);
		System.out.println(paint_area);
		console.close();
	}

}
