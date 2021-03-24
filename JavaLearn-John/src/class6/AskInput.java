package class6;

import java.util.Scanner;

public class AskInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int i=input.nextInt();
		//int i=6;
		//(!(i>=1&&i<=10))
		while(i<1||i>10) {
			System.out.println("Enter another number:");
			i=input.nextInt();
		}

	}

}
