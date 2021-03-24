/*
 * Emerald Liu
 */

package AssignmentsChapter5;
import java.util.*;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("Please enter two lines of numbers");
		String number1=console.nextLine();
		String number2=console.nextLine();
		
		int length1=number1.length();
		int length2=number2.length();
		String prefix="";
		
		for(int i=0;i<Math.min(length1, length2);i++) {
			if(number1.charAt(i)==number2.charAt(i))
					prefix=prefix+number1.charAt(i);
			else
				break;
		}
		int prefixLength=prefix.length();
		int numbersDiscarded=length1+length2-prefixLength*2;
		
		System.out.println("Prefix="+prefix+"\nNumber discarded="+numbersDiscarded);
		
		console.close();
	}

}
