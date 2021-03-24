package acsl;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		String b = "fdsa";
		b.contains("fdsa");
		int ans=0;
		for(int i=0;i<4;i++) {
			ans+=a;
			a=sc.nextInt();
		}
		System.out.println(ans);
	}

}
