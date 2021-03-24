package Tryout;
import java.util.Scanner;

public class MissingNumber2 {

	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
		long howMany=console.nextLong();
		long sum=(1+howMany)*howMany/2;
//BigInteger sum=BigInteger.valueOf((1+howMany)*howMany/2);
//System.out.println(sum);
		long arr[]=new long[(int)howMany-1];
		
//		BigInteger[] arr=new BigInteger[howMany-1];
		
		for(int i=0;i<howMany-1;i++)
			arr[i]=console.nextLong();

		
		for(int i=0;i<howMany-1;i++) 
			sum-=arr[i]; 
		
		System.out.println(sum);
		console.close();
	}

}
