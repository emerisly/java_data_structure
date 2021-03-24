package arrays;

import java.util.Arrays;

public class TwoD_Array {
	public static void main(String[] args) {
		int[][] arr=new int[12][12];
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[0].length;c++) {
				arr[r][c]=(r+1)*(c+1);
			}
		}
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[0].length;c++) {
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(Arrays.deepToString(arr));
		System.out.println("\n***********ragged array**************");
		int[][]arr2= {{70,80,90},{30,70,50,90},{70,100},{10,20,30,40,50,60}};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
