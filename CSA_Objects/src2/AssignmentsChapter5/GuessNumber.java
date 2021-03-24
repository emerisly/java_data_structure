/*
 * Emerald Liu
 */

package AssignmentsChapter5;
import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secretNumber=(int)(Math.random()*99)+1;
		boolean cont=true;
		int tries=0;
		do {
			tries++;
			System.out.println("Please enter an integer from 1-100");
			Scanner console=new Scanner(System.in);
			int num=console.nextInt();
			if(num<1||num>100) {
				throw new IllegalArgumentException("bad guess");
			}
			if(num==secretNumber) {
				System.out.println("You got it in "+tries+" tries");
				cont=false;
				console.close();
			}
			else if(num<secretNumber) 
				System.out.println("Your guess is too low");
			else
				System.out.println("Your guess is too high");
		}while(cont);
		//end do while
		
	}//end main

}//end class
