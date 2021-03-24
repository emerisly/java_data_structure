package Unit7_Arrays;

import java.util.Arrays;

public class ArraysCopyOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5};
		int[] newArr=Arrays.copyOfRange(arr, 1, 4);
		//the last index is exclusive
		for(int n:newArr) {
			System.out.print(n+" ");
		}
	}

}
