package stringLearn;

import java.util.Scanner;

public class lastFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a=3/0;
		
		String str1="";
		String str2;//null
		System.out.println(str1);
		//System.out.println(str2);
		
		Scanner myScanner = new Scanner(System.in);
		String s = myScanner.next();
		int currentIndex = 0;

		if(s.length()>1 && s.charAt(currentIndex) != ' ')
		{
		  System.out.println(s.charAt(1));
		}

		
		
		System.out.println(lastFirst("Emerald Liu"));
		System.out.println(lastFirst("Marla Singer"));
		String s1="";
		
		//System.out.println(s.charAt(0));
	}
	
	public static String lastFirst(String str){
		//char firstName = str.charAt(0);//get first letter of first name
	    //int index = str.indexOf(" ");//find index of last name -1
	    String lastName = str.substring(str.indexOf(" ")+1);//get last name
	    return lastName+", "+str.charAt(0)+".";//return
	}

}
