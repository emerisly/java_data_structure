package Unit7_Arrays;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1= {'a','b','c','d'};
		char[] arr2= {'e','f','g','h'};
		//it works!!
		char[][] arr3= {arr1,arr2};
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
