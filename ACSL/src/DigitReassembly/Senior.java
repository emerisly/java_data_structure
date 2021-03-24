package DigitReassembly;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Senior {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		BufferedReader br=new BufferedReader(new FileReader("input1.txt"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		for(int k=1;k<=5;k++) {
		StringTokenizer line=new StringTokenizer(br.readLine());
		String number=line.nextToken();
		int howMany=Integer.parseInt(line.nextToken());
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
		System.out.println(k+". "+total);
		pw.println(k+". "+total);
	}
		br.close();
		pw.close();
	}
}