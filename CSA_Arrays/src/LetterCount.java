import java.util.Scanner;
public class LetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		String str=console.nextLine();
		int upper[]=new int[26];
		int lower[]=new int[26];
		char letter;
		for(int i=0;i<str.length();i++) {
			letter=str.charAt(i);
			if(letter>=65&&letter<=90)
				upper[letter-65]++;
			if(letter>=97&&letter<=122)
				lower[letter-97]++;
		}
		
		char uppern=65;
		char lowern=97;
		for(int i=0;i<upper.length;i++) {
			System.out.println(uppern+": "+upper[i]+"\t"+lowern+": "+lower[i]);
			uppern++;
			lowern++;
		}
	}

}