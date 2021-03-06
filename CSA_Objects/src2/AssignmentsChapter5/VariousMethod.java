package AssignmentsChapter5;

import java.util.*;

public class VariousMethod {

	public static int parseInt (String numString) {
		//Pre: A String that contains a only digits has been sent as a parameter
		//Post: The method will return an int
		int lengthS=numString.length();
		int sum=0;
		int power=lengthS-1;
		for(int i=0;i<lengthS;i++) {
			//System.out.println(numString.charAt(i)-48);
			//System.out.println(((int)numString.charAt(i)-48)*(int)Math.pow(10, power));
			sum=sum+((int)numString.charAt(i)-48)*(int)Math.pow(10, power);
			//System.out.println(power);
			power--;
		}
		
		return sum;	
	}
	public static int reverseThreeDigitNumber (int number) {
		//pre: An int that contains only three digits
		//post: An int that reverse the digits
		String numberS=Integer.toString(number);
		String reversedNumberS="";
		for(int i=2;i>=0;i--) 
			reversedNumberS=reversedNumberS+numberS.charAt(i);
		int reNumber=Integer.parseInt(reversedNumberS);
		return reNumber;
	}
	public static String reverseString (String s) {
		//pre: A String
		//post: A String that is reversed
		int sLength=s.length();
		String reversedString="";
		for(int i=sLength-1;i>=0;i--)
			reversedString=reversedString+s.charAt(i);
		return reversedString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parseInt
		Scanner console=new Scanner(System.in);
		System.out.println("Enter numbers");
		String numberS=console.nextLine();
		int number=parseInt(numberS);
		System.out.println("The number is " +number*10+"\n");
		
		//reverseThereDigit
		System.out.println("Please enter three digits nubmer");
		int threeDigitNumber=console.nextInt();
		int reversedNumber=reverseThreeDigitNumber(threeDigitNumber);
		System.out.println("The reversed number is "+reversedNumber+"\n");
		
		//reverseString
		System.out.println("Please enter a String");
		String exString=console.next();
		String reversedString=reverseString(exString);
		System.out.println("The reversed String is "+reversedString);
		
		console.close();
	}

}
