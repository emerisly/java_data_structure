package MyArrayList;

import java.util.Arrays;

public class MyArrayListProg1 {

	public static void printArray(int[]array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void add(int position,int number,int[]myArray) {
		int i;
		position++;
		for(i=myArray.length-1;i>position-1;i--) {
			myArray[i]=myArray[i-1];
		}
		myArray[i]=number;
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1= {10,30,40,50,0};
		int[] array2= {10,20,30,40,0};
		int[] array3= {10,30,40,50,0};
		int[] array4= {10,20,30,40,0};
		int num,pos;
		num=20;
		pos=1;
		
		/*
		for(int i=array1.length-1;i>=0;i--) {
			if(array1[i]!=0&&array1[i]<num) {
				array1[i+1]=array1[i];
				array1[i+1]=num;
				break;
			}
			else {
				array1[i]=array1[i-1];
			}
		}
		*/
		add(pos,num,array1);
		
		printArray(array1);

		num=50;
		pos=4;
		add(pos,num,array2);
		printArray(array2);
		
		num=20;
		pos=1;
		add(pos,num,array3);
		printArray(array3);
		
		num=50;
		pos=4;
		add(pos,num,array4);
		printArray(array4);
		
	}

}


/*

[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]

 */
