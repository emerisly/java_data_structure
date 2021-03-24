import java.util.*;

public class Program_Random {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		int number=r.nextInt(19)+2;
		System.out.println("the random number is: "+number);
		int sum=0;
		int count=0;
		while (count<=number) {
			sum=sum+count;
			count++;
		}
		System.out.println("The sum of first "+number+" number is "+sum);
	}

}
