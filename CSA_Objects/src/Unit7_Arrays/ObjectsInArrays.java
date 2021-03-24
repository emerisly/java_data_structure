package Unit7_Arrays;

import java.util.Arrays;

public class ObjectsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] java=new int[7];
		int[] c;
		c=java;
		for(int i=0;i<java.length;i++) {
			java[i]=i;
		}
		c[0]=250;
		System.out.println(Arrays.toString(java));
		System.out.println(Arrays.toString(c));
	}

}
