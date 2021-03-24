/*
 * Emerald Liu
 */

package AssignmentsChapter5;
import java.text.NumberFormat;
import java.util.*;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("How many numbers are there?");
		//get how many numbers are there
		int num=console.nextInt();
		int count=1;
		int sum=0;
		//add the sum
		while(count<=num) {
			System.out.println("#"+count+" Enter a number");
			int number=console.nextInt();
			sum+=number;
			count++;
		}
		//end while loop
		//calculate average
		int averageInt= (int)((double)sum/(double)num*100);
		double average=(double)averageInt/100;
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		System.out.println(currencyFormat.format(average));
//		System.out.printf("The average is %.2f",average);
//		System.out.println(average(average));
		console.close();
	}

/*	public static String average(double avg) {
		DecimalFormat formatter= new DecimalFormat("###,###,###.##");
		return formatter.format(avg);
	}
*/

}
