package class11;

import java.util.Arrays;

public class StringCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = new int[3];
		System.out.println(x);
		int[] newArray = new int[3];
		
		int[] s = {1,2,3,4,5};
		System.out.println(Arrays.toString(s));
		
		int[] y = x;
		//copy reference
		
		y[0]=100;
		System.out.println(x[0]);
		
		System.out.println(x+" "+y);
		System.out.println(newArray);
		
		String x1 = new String("ab");
		change(x1);
		System.out.println("x1="+x1);

	}
	public static void change(String str) {
		str="cd";
		System.out.println("str="+str);
	}

}
