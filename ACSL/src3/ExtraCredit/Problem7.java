package ExtraCredit;

import java.io.*;
import java.util.*;

public class Problem7 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("problem7.txt"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("problem7out.txt")));
		for(int k=0;k<7;k++) {
			StringTokenizer line=new StringTokenizer(br.readLine());
			int number=Integer.parseInt(line.nextToken());
			if(number<=100&&number>=93)
				System.out.println(number+" A");
			else if(number>=90)
				System.out.println(number+" A-");
			else if(number>=87)
				System.out.println(number+" B+");
			else if(number>=80)
				System.out.println(number+" B");
			else if(number>=77)
				System.out.println(number+" C+");
			else if(number>=70)
				System.out.println(number+" C");
			else if(number>=67)
				System.out.println(number+" D+");
			else if(number>=60)
				System.out.println(number+" D");
			else if(number>=0)
				System.out.println(number+" F");
			else
				System.out.println("Invalid input");
		}
		br.close();
		pw.close();
	}

}
