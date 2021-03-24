/*
 * Emerald Liu
 */

package AssignmentsChapter5;
import java.text.NumberFormat;
import java.util.*;

public class AverageDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console=new Scanner(System.in);
		int number;
		int count=0;
		int sum=0;
		System.out.println("Enter grade between 0 and 100");
		number=console.nextInt();
		do {
			sum=sum+number;
			count++;
			System.out.println("Enter grade between 0 and 100");
			number=console.nextInt();
		}
		while(number>=0);
		
		int averageInt= (int)((double)sum/(double)count*100);
		double average=(double)averageInt/100;
//		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
//		System.out.println(currencyFormat.format(average));
		System.out.printf("The average is %.2f",average);
	}

}
