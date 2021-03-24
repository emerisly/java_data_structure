import java.util.*;
import java.io.*;

public class IntroToFiles {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream output=new PrintStream (new File("Greetings.txt"));
		output.println("Hi There");
		output.println("It is October 16 2018");
		output.println("Have a great day");
		output.println("And a great night");
		
		Scanner input=new Scanner(new File("Greetings.txt"));
		while(input.hasNext()) {
			String text=input.next();
			System.out.println(text);
		}
		
		PrintStream output2=new PrintStream(new File("Grades.txt"));
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				output2.print(i*j+" ");
			}
			output2.println();
		}
		
		Scanner input2=new Scanner(new File("Grades.txt"));
		while(input2.hasNext()){
			String text=input2.next();
			System.out.print(text+" ");
		}
		
		Scanner input3=new Scanner(new File("Grades.txt"));
		while(input3.hasNext()){
			System.out.println("New Line");
			String text=input3.nextLine();
			System.out.println(text);
			StringTokenizer tokenizer=new StringTokenizer(text);
			while(tokenizer.hasMoreTokens()) {
				String token=tokenizer.nextToken();
				System.out.println(token);
			}
		}
		input.close();
		input2.close();
		input3.close();
	}

}
