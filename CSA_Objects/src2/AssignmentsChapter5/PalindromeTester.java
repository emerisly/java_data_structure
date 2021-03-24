/*
 * Emerald Liu
 */

package AssignmentsChapter5;
import java.util.*;

public class PalindromeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		String another="y";
		boolean next;
		if(another.toLowerCase().equals("y"))
			next=true;
		else
			next=false;
		
		while(next) {
			System.out.println("Enter a possible palindrome");
			String palindrome=console.nextLine();
			int left=0;
			int right=palindrome.length()-1;
			boolean conti=true;
			while(left<right&&conti) {
				conti=palindrome.charAt(left)==palindrome.charAt(right);
				right--;
				left++;
			}
			if (conti)
				System.out.println("It is a palindrome");
			else
				System.out.println("It is not a palindrome");
			System.out.println("Continue?");
			another=console.nextLine();
			if(another.toLowerCase().equals("y"))
				next=true;
			else
				next=false;
		}

		console.close();
		
	}

}
