package Tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class Repetitions {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer str=new StringTokenizer(console.readLine());
		
		String str=console.readLine();
		int max=0;
		int maxtest=0;
		int countall=0;

		while(countall<str.length()) {

			int count=0;
			
			char letter=str.charAt(countall);
			
			for(int i=countall;i<str.length();i++) {
				if(letter==str.charAt(i)) 
					count++;
				else
					break;
			}
			
			maxtest=count;
			max=Math.max(maxtest,max);
			countall+=count;
			
		}
		
		System.out.println(max);
		
		
		
	}

}
