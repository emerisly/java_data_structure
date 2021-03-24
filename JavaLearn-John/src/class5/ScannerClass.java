package class5;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter an int");
		int n = myScanner.nextInt();
		System.out.println("You inputed: "+n);
		
		System.out.println("Please enter a double");
		double nDouble = myScanner.nextDouble();
		System.out.println("You inputed: "+nDouble);
		
		System.out.println("Please enter a string");
		//String takeSpace = myScanner.next();
		String s = myScanner.nextLine();
		System.out.println("You inputed: "+s);

	}

}
