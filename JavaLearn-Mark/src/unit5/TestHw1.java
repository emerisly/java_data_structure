package unit5;
import java.util.*;

public class TestHw1 {

		public static void main(String[] args) {
				Scanner console = new Scanner(System.in);
				printPalindrome(console);
				
			}
		public static void printPalindrome(Scanner console) {
			String best=console.next();
			int better= best.length()-1;
			if(best.charAt(better) == best.charAt(0)) {
				System.out.println(best + " is a palindrome!");
				return;
			}
			else {
				System.out.println(best + " is not a palindrome.");
				return;
			}
		}
}
