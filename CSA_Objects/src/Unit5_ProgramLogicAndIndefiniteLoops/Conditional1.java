package Unit5_ProgramLogicAndIndefiniteLoops;

import java.util.Scanner;

public class Conditional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("Enter day");
		String day=console.next();
		System.out.println("Enter age");
		int age=console.nextInt();
		if(day.equals("Saturday")||day.equals("Sunday")) {
			System.out.println("It is time to relax");
		}
		else {
			if(age<18)
				System.out.println("Time to go to School");
			else
				System.out.println("Time to go to work");
		}
		console.close();
		}

}
