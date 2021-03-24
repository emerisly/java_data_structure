package method;

import java.util.Scanner;

public class sumNumbers {
		public static void main(String[] args) {
			Scanner console=new Scanner(System.in);
			int num=console.nextInt();
			System.out.println(sum(num));
		}
			
			//Pre: n must be positive
			//Post: return the sum of the first n sum
		public static long sum(int n) {
			//false
			if(n==1) {
				return n;
			}
			//recursive
			else
				return n+sum(n-1);
	}
}
		
		
		
