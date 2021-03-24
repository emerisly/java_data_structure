package Tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader console1=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(console1.readLine());
		
		int left=num%4;
		
		if(num>3) {
			if(left==0) {
				for(int e=4;e<=num;e+=4)
					System.out.print((e-2)+" "+e+" "+(e-3)+" "+(e-1)+" ");
			}
			else{
				System.out.print(num+" ");
				if(left==3)
					System.out.print((num-2)+" ");
				for(int e=4;e<=num;e+=4)
					System.out.print((e-2)+" "+e+" "+(e-3)+" "+(e-1)+" ");
				if(left>1)
					System.out.print(num-1);
			}

		}
			else if(num==1)
				System.out.println("1");
			else
				System.out.println("NO SOLUTION");
		}
	}


