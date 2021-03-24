package AssignmentsChapter5;
import java.util.*;

public class Dice {

	public static void main(String[] args) {
		//array to count number of sums
		int []counterDigit=new int[11];//11 kinds of sum we can get, from 2 to 12 (12-2+1=11)
		Scanner console=new Scanner(System.in);
		System.out.println("How many pairs of dice do you want?");
		int howManyPairs=console.nextInt();
		System.out.println("\n");
		
		//roll the dices, add the sum, count the digit
		//print dices
		for(int i=1;i<=howManyPairs;i++) {
			int dice1=(int)(Math.random()*6+1);
			int dice2=(int)(Math.random()*6+1);
			int sum=dice1+dice2;
			counterDigit[sum-2]++;//store 2 to the 0's place, 3 to the 1's place...
			System.out.println("#"+i+"\tFirstN="+dice1+"\tSecondN="+dice2+
					"\tSum of pairs: "+sum);
		}//end for loot	    
		System.out.println("\n\n");

		//print sum
		for(int i=0;i<counterDigit.length;i++) {
			int num=i+2;
			System.out.println("Sum"+num+" = "+counterDigit[i]);
		}//end for loop
		
		System.out.println("\n\n");
		
		//calculate possibility and print
		double []possibility=castToDoubleArray(counterDigit);
		int number=2;
		for (int i=0;i<11;i++) {
			possibility[i]=(double)((int)((possibility[i]/howManyPairs*100)*100))/100;
			System.out.println("Possibility to get a "+number+" is "+possibility[i]+"%");
			number++;
		}//end for loop
		console.close();
	}//end main method

	public static double[] castToDoubleArray (int[] intArray) {
		double []doubleArray=new double[intArray.length];
		for(int i=0;i<intArray.length;i++) {
			doubleArray[i]=(int)intArray[i];
		}//end for loop
		return doubleArray;
	}//end castIntArray method

}//end main class
