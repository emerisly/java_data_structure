package Unit7_Arrays;

import java.util.Arrays;

public class TestArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {0,1,2,3};
		System.out.println(Arrays.toString(numbers));
		numbers=testMethod();
		System.out.println(Arrays.toString(numbers));
	}
	public static int[] testMethod() {
		int[] newNumbers= {1,2,3};
		return newNumbers;
	}
}
