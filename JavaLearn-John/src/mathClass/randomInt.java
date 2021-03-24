package mathClass;

import java.util.Random;

public class randomInt {
	public static void main(String[] args) {
		Random rand=new Random();
		for(int j=0;j<20;j++) {
		for(int i=0;i<10;i++) {
		int e=rand.nextInt(10)*4;
		System.out.print(e+" ");
		}
		System.out.println();
	}
		
	}

}
