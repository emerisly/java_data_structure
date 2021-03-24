package Tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(console.readLine());
		if(num>3) {
			for(int counterEven=2;counterEven<=num;counterEven+=2)
				System.out.print(counterEven+" ");
			for(int counterOdd=1;counterOdd<=num;counterOdd+=2)
				System.out.print(counterOdd+" ");
					}
		else {
			if(num==1)
				System.out.println("1");
			else
				System.out.println("NO SOLUTION");
		}
	}

}
