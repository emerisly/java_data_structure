import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PrintArrays {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
//		Scanner input=new Scanner(new File("grades.txt"));
		
		int[] a=new int[10];
		
//		String num;
//		int number;
		
		for(int i=0;i<10;i++)
			a[i]=(int)(Math.random()*100)+1;
		
//		while(input.hasNext()){
//			for(int i=0;i<10;i++) {
//				num=input.next();
//				number=Integer.parseInt(num);
//				a[i]=number;
//			}
//		}
		
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+" ");
		
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
		
		System.out.println();
		
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		
		System.out.println("Avg: "+(double)sum/a.length);
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) 
			min=Math.min(min, a[i]);
		
		for(int i=0;i<a.length;i++)
			max=Math.max(max, a[i]);
		
		System.out.println("Max: "+max+"\nMin: "+min);
	}

}
