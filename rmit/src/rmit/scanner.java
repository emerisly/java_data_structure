package rmit;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What's your age");
		int age = myScanner.nextInt();
		System.out.println("OK! Your age is "+ age);
		System.out.println("What's your favorite color");
		String color = myScanner.next();
		System.out.println("OK! Your favorite color is "+color);
		
		//nextInt() -> get one int
		//nextDouble() -> get one double
		//next() -> get one token
		//nextLine() -> get the whole line
		
		if(age>=18) {
			System.out.println(color+" Go vote");
		}

	}

}
