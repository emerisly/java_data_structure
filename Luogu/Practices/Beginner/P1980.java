package Beginner;
import java.util.*;
public class P1980 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner con=new Scanner(System.in);
		int num=con.nextInt();
		char ch=con.next().charAt(0);
		String str="";
		int ans=0;
		for(int i=0;i<=num;i++) {
			str+=i;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) ans++;
		}
		System.out.println(ans);
		
		
	}

}
