package Tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader console1=new BufferedReader(new InputStreamReader(System.in));
		int num=console1.read();
		BufferedReader console2=new BufferedReader(new InputStreamReader(System.in));
		String str=console2.readLine();
//		StringTokenizer str1=new StringTokenizer(console2.readLine());
//		int leng=str1.countTokens();
//		int arr[]=new int[num];
//		String parts[]=str.split(" ", 2);//String to two parts
		int sum=0;
//		int first[]=new int[1];//initial first[]
//		first[0]=Integer.parseInt(parts[0]);//first number
		
//		System.out.println(printArray(first));
		
//		int[] part=new int[leng-1];//initial other
//		for(int i=0;i<leng;i++) {
//			part[i]=Integer.parseInt(str1.nextToken());
//		}
//		for(int i=1;i<num;i++) {
//			int differ=0;
//			arr[i]=part[i];
//			if(arr[i-1]>arr[i])
//				differ=arr[i-1]-arr[i];
//			arr[i]+=differ;
//			sum+=differ;
//		}
//		System.out.println(sum);
	}

	 public static String printArray(int arr[]) {
		 String arrString="";
		 for(int i=0;i<arr.length;i++) 
			 arrString=arrString+arr[i]+" ";
		 return arrString;
	 }
}
