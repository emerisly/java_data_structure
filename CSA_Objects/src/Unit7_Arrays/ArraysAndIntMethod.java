package Unit7_Arrays;

import java.util.Arrays;

public class ArraysAndIntMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,8,7,6};
		int val=5;
		mod(arr,val);
		System.out.println(Arrays.toString(arr)+"\t"+val);
	}

	public static void mod(int[] arr, int val) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		val=arr[arr.length-1];
		System.out.println(val);
	}

}
