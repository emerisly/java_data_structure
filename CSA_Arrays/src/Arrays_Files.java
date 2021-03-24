/*
 * Author: Emerald Liu
 * scan from a file and put the numbers in arrays
 * output: avg , min & max
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arrays_Files {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		
		//scan the file and create array
		Scanner input=new Scanner(new File("ArraysFiles.txt"));
		int[] a=new int[10];
		int count=0;
		while(input.hasNext()) {
			String str=input.next();
			a[count]=Integer.parseInt(str);
			count++;
		}
		
		//print array
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		//find avg
		int sum=0;
		for(int i=0;i<a.length;i++) 
			sum=sum+a[i];
		
		//find max, min
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			min=Math.min(min, a[i]);
			max=Math.max(max, a[i]);
		}
			
		//print avg, mix, max
		System.out.println("\nAvg: "+(double)sum/a.length+"\nMax: "+max+"\nMin: "+min);
		
		input.close();

	
	}

}
