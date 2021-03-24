package Unit7_Arrays;

import java.util.Arrays;

public class SwapsPairArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {0,1,2,3,4,5,6,7};
		int[] arr2= {0,1,2,3,4,5,6};
		
		for(int i=0;i<arr1.length-1;i+=2) {
			int temp=arr1[i];
			arr1[i]=arr1[i+1];
			arr1[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr1));
		
		for(int i=0;i<arr2.length-1;i+=2) {
			int temp=arr2[i];
			arr2[i]=arr2[i+1];
			arr2[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
