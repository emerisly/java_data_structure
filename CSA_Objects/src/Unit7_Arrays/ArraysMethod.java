package Unit7_Arrays;

import java.util.Arrays;

public class ArraysMethod {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		mystery(arr);
		System.out.println(Arrays.toString(arr));
		
	}

//	public static void mystery(int[] otherArray) {
//		otherArray= {2,3,4};
//  }
		
//	public static int[] mystery(int[] otherArray) {
//		otherArray= {2,3,4};
//		return otherArray;
//	}
	public static int[] mystery(int[] otherArray) {
		for(int i=0;i<otherArray.length;i++) {
			otherArray[i]=i;
		}
		return otherArray;
	}
}
