package Tryout;
import java.util.Scanner;

public class Permutations3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		int num=console.nextInt();
		if(num>3) {
			for(int e=2;e<=num;e+=2)
				System.out.print(e+" ");
			for(int o=1;o<=num;o+=2)
				System.out.print(o+" ");
					}
		else {
			if(num==1)
				System.out.println("1");
			else
				System.out.println("NO SOLUTION");
		}
		console.close();
	}

}
