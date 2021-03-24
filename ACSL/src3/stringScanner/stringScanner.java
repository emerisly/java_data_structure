package stringScanner;

import java.util.Scanner;

public class stringScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		double grade=0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Input name");
			name=input.nextLine();
			System.out.println("Input grade");
			grade=input.nextDouble();
			input.nextLine();//do it after nextDouble
			System.out.println(name+" has a grade of "+grade+"\n");
		}

	}

}
