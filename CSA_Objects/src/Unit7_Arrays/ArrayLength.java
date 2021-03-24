package Unit7_Arrays;

import java.util.Arrays;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr= {4,5,6,7,8};
		int[] otherArr= {9,10,11};
		myArr=otherArr;
		otherArr=myArr;
		System.out.println(Arrays.toString(myArr));

	}

}
