package Tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(console.readLine());
		if(num>3) {
			for(int e=2;e<=num;e+=2)
				System.out.print(e+" ");
			for(int o=1;o<=num;o=2)
				System.out.print(o+" ");
					}
		else {
			if(num==1)
				System.out.println("1");
			else
				System.out.println("NO SOLUTION");
		}
		
		
	}

}
