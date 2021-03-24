package Unit7_Arrays;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = {1.0, 4.5, 6.7, 8.1};
		double[] triple = Arrays.copyOf(numbers, 3 * numbers.length);
		double[] half = Arrays.copyOfRange(numbers, 0, 2);

		System.out.println(Arrays.toString(numbers));

	}

}
