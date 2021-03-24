//3.30s
package Tryout;
import java.util.Scanner;
public class MissingNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		int number=console.nextInt();
		int array[]=new int[number-1];
			for(int i=0;i<number-1;i++)
				array[i]=console.nextInt();

		byte test[]=new byte[number];
		for (int i=0;i<number-1;i++) {
			test[array[i]-1]=1;
		}
		
		for (int i=0;i<number;i++) {
			if(test[i]==0)
				System.out.println(i+1);
		}
		console.close();
	}

}
