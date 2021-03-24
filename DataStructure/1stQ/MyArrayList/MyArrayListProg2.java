package MyArrayList;

import java.util.Arrays;

public class MyArrayListProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=80;
		int[] array= {10,20,30,40,50,60,70};
		int[] tempArray=new int[array.length+1];
		
		
		System.out.println("Memory Point 1 is both arrays are pointing to different addresses");
		System.out.println("Address of array -> "+array);
		System.out.println("Address of tempArray -> "+tempArray);
		System.out.println("Memory Point 1 is both arrays are pointing to the same addressses and hence aliases");
		System.out.println("The original array was wiped out becasue fo garbage collection since nothign else point to it");


		tempArray=array;
		tempArray[array.length-1]=num;
		System.out.println(Arrays.toString(tempArray));
		System.out.println("Memory Point 1 is both arrays are pointing to different addresses and tempArray si pointing to null");
		array=tempArray;
		tempArray=null;
		System.out.println("Address of array -> "+array);
		System.out.println("Address of tempArray -> "+tempArray);
		
	}

}



/*

Memory Point 1 is both arrays are pointing to different addresses
Address of array -> [I@7852e922
Address of tempArray -> [I@4e25154f
Memory Point 1 is both arrays are pointing to the same addressses and hence aliases
The original array was wiped out becasue fo garbage collection since nothign else point to it
[10, 20, 30, 40, 50, 60, 80]
Memory Point 1 is both arrays are pointing to different addresses and tempArray si pointing to null
Address of array -> [I@7852e922
Address of tempArray -> null

*/