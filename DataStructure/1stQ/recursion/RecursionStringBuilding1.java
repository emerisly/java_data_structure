package recursion;

import java.util.Scanner;

public class RecursionStringBuilding1 {
	public static int sum(int n) {
		//pre:n>=1
		if(n<=1)
			return 1;
		else
			return n+sum(n-1);
	}

	public static String stackwords() {
		System.out.println("put input");
		Scanner console=new Scanner(System.in);
		String str=console.next();
		if(str.equals("."))
			return "";
		else
			return stackwords()+" "+str;
	}
	
	public static void main(String[] args) {
		System.out.println(stackwords());
		//System.out.println(sum(3));
	}
	
}
