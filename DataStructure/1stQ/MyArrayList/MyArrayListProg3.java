package MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyArrayListProg3 {

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static int remove(int index, int[] array) {
		int num=array[index];
		array[index]=0;
		for(int i=index;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		array[array.length-1]=0;
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int[] array1= {10,20,30,40,50};
		int pos=3;
		int num;
		printArray(array1);
		num=remove(pos,array1);
		printArray(array1);
		System.out.println("The element that was removed was "+num+" at index "+pos+" The precodition is that the position must be >= 0 and < array.length");

		try {
		int[] array2= {10,20,30,40,50};
		Scanner input=new Scanner(System.in);
		System.out.println("What index do you want to remove at ???");
		pos=input.nextInt();
		System.out.println("Array Before removal");
		printArray(array2);
		System.out.println("The umber that was removed was");
		System.out.println(remove(pos,array2));
		System.out.println("Array after removal");
		printArray(array2);
		}
		catch(Exception e) {
			System.out.println("oh no");
		}
		
		
	}

}


/*

[10, 20, 30, 40, 50]
[10, 20, 30, 50, 0]
The element that was removed was 40 at index 3 The precodition is that the position must be >= 0 and < array.length
What index do you want to remove at ???
4
Array Before removal
[10, 20, 30, 40, 50]
The umber that was removed was
50
Array after removal
[10, 20, 30, 40, 0]

*/