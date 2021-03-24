package objectLearn;

import java.util.Arrays;

public class StringLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = new String("ab");
		change(x);
		System.out.println(x);
		int[] myArray = {1, 3, 5, 7, 9};
		mystery(myArray);
		System.out.print(Arrays.toString(myArray));
		System.out.println();
		String[] array1= {"1"};
		String[] array2= {"1"};
		System.out.println(Arrays.equals(array1,array2));
		//equals -> compare actual data
		//== -> compare reference


	}

	public static void mystery(int[] otherArray)
	{
	  //otherArray = {2, 4, 6, 8, 10};
	} 

	public static void change(String s) {
		s="cd";
	}
}
