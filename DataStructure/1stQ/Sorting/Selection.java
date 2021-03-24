package Sorting;

import java.util.Arrays;

public class Selection {
	public static void sort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			int min=i;
			for(int j=i+1;j<array.length;j++)
				if(array[min]<array[j])
					min=j;
			int temp=array[min];
			array[min]=array[i];
			array[i]=temp;
		}
	}
	public static void main(String[] args) {
		int [] array= {1,2,3,6,5,4};
		sort(array);
		System.out.println(Arrays.toString(array));
	}
}
