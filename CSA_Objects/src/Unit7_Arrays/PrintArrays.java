package Unit7_Arrays;

import java.util.Arrays;

public class PrintArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		System.out.println("arr\t"+arr+" "+Arrays.toString(arr));
//		int[] arr2=arr;
		sbArray(arr);


		
		System.out.println("arr\t"+arr+" "+Arrays.toString(arr));
//		System.out.println("arr2\t"+arr2+" "+Arrays.toString(arr2));
	}

	public static void sbArray(int[] array) {
		System.out.println("array\t"+array+" "+Arrays.toString(array));
		
		for(int i=0;i<array.length;i++) {			
			array[i]=i;
		}

		System.out.println("array\t"+array+" "+Arrays.toString(array));
	}
}
