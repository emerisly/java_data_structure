package Tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(console.readLine());
//		int num=console.read();
//		have no idea why console.read is not working
//		System.out.println(num);
		if(num==2|num==3)
			System.out.println("NO SOLUTION");
		else if(num==1)
			System.out.println("1");
		else {
			int arr[]=new int[num];
			for(int i=0;i<num;i++) 
				arr[i]=i+1;
//			for(int i=0;i<num;i++)
//				System.out.println(arr[i]);
			for(int counterEven=1;counterEven<num;counterEven+=2)
				System.out.print(arr[counterEven]+" ");
			for(int counterOdd=0;counterOdd<num;counterOdd+=2)
				System.out.print(arr[counterOdd]+" ");
//			if(num%2==1)
//				str=str+arr[num-1];
//			else
//				str=str+arr[num-2];
		}
	}

}
