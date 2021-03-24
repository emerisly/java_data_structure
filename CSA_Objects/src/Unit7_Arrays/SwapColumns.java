package Unit7_Arrays;

import java.util.Arrays;

public class SwapColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array={
				{0,1,2,4},
				{4,5,6,4},
				{8,9,0,4},
				{4,4,4,4}
		};
//		int row=array.length;
//		int col=array[0].length;
//		System.out.println(row+" "+col);
		swapColumns(array);
		System.out.println(Arrays.deepToString(array));
	}
	
	public static void swapColumns(int[][] a) {
		for(int col=0;col<a[0].length-1;col+=2) {
			int[][] temp=new int[a.length][1];
			//don't forget it's the length when initialize array
			for(int row=0;row<a.length;row++) {
				temp[row][0]=a[row][col];
				a[row][col]=a[row][col+1];
				a[row][col+1]=temp[row][0];
			}
		}
	}

}
