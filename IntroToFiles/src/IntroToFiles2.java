import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class IntroToFiles2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream output=new PrintStream (new File("grades.txt"));
		for(int i=0;i<10;i++)
		output.print((int)(Math.random()*41)+60+" ");
		
		Scanner input=new Scanner(new File("grades.txt"));
		int sum=0;
		int number;
		while(input.hasNext()) {
			String text=input.next();
			number=Integer.parseInt(text);
			System.out.println(number);
			sum=sum+number;
		}
		System.out.println((double)sum/10);
		input.close();
	}

}
