package Unit7_Arrays;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,2,3,4,5};
		System.out.println("numbers: "+numbers+" "+Arrays.toString(numbers));
		testMethod(numbers);
		System.out.println("numbers: "+numbers+" "+Arrays.toString(numbers));

	}

	public static void testMethod(int[] numbers) {
		// TODO Auto-generated method stub
		int[] newNumbers= {6,7,8,9,10};
		numbers=newNumbers;
		System.out.println("nN: "+newNumbers+" "+Arrays.toString(newNumbers));
		System.out.println("n: "+numbers+" "+Arrays.toString(numbers));
	}

}
