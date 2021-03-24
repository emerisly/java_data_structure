package DigitReassembly;

import java.util.Scanner;

public class Intermediate {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		String number=console.next();
		int howMany=console.nextInt();
		console.close();
		int turns=number.length()/howMany;
		String left=number.substring(turns*howMany);
		int zeros=howMany-(number.length()-howMany*turns);
		for(int i=0;i<zeros;i++) {
			left+="0";
		}
		int charAt=0;
		int sum=0;
		for(int i=0;i<turns;i++) {
			sum+=Integer.parseInt(number.substring(charAt, charAt+howMany));
			charAt+=howMany;
		}
		int total=sum+Integer.parseInt(left);
		System.out.println(total);
	}

}
