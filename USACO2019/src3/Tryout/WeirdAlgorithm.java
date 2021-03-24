package Tryout;
import java.util.*;

public class WeirdAlgorithm {
	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
		long num=console.nextInt();
		
		while(num>1) {
			System.out.print(num+" ");
			if(num%2==0)
				num=num/2;
			else
				num=num*3+1;
		}
		System.out.println("1");
		
		console.close();
	}

}
