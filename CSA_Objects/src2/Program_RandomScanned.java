import java.util.*;


public class Program_RandomScanned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How many numbers do you want?");
		Scanner console=new Scanner(System.in);
		int howMany=console.nextInt();
		
		//how many number and the array
		int number;
		int[] numberA= new int[100];
		
		Random r=new Random();
		System.out.println("The numbers are:");
		
		//get array
		for(int i=0;i<howMany;i++) {
			number=r.nextInt(19)+2;
			System.out.println(number);
			numberA[i]=number;
		}
		
		
		int sumNum=r.nextInt(howMany+1);
		int sum=0;
		sumNum=5;
		for (int i=1;i<=sumNum;i++) {
			sum=sum+i;
		}
		
		System.out.println("The sum of first "+sumNum+" numbers is: "+sum);
		
		
		
		console.close();
	}

}
