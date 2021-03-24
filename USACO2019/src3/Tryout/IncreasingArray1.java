package Tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class IncreasingArray1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader console1=new BufferedReader(new InputStreamReader(System.in));
		long num=Integer.parseInt(console1.readLine());
		long array[]=new long[(int) (num)];
		
//		BufferedReader console2=new BufferedReader(new InputStreamReader(System.in));
//		String str=console2.readLine();
		StringTokenizer str=new StringTokenizer(console1.readLine());
		
		
			for(int i=0;i<num;i++)
				array[i]=Integer.parseInt(str.nextToken());
			
//		System.out.println(printArr(array)+"\n");
			
			
			int first=0;
			int second=1;
			long sum=0;
			
			for(first=0;first<array.length-1;first++) {
				long differ=0;
				if(array[first]>array[second]) {
					differ=array[first]-array[second];
					array[second]=array[first];
					sum+=differ;
				}
//				System.out.println(first+" "+second+" "+"   "+array[second]+"    "+differ+" "+sum);
				second++;
			}
			
			System.out.println(sum);
			
			
			
	}

	
/*	 public static String printArr(int arr[]) {
		 String arrString="";
		 for(int i=0;i<arr.length;i++) 
			 arrString=arrString+arr[i]+" ";
		 return arrString;
	 }
*/	 
}
