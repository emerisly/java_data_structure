package MyStack;

import java.util.Arrays;

public class StackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrString= {"Namath","Sauer","Maynard","Atkinson","Dockecy","Snell","Boozer","Parelli","Rigging","Barkum"};
		Integer[] arr= {80,75,42,99,77,86,92,100,65,87};
		
		reverseArray(arr);
		reverseArray(arrString);
		
		print(arr);
		print(arrString);
		System.out.println();
		
		sort(arr);
		sort(arrString);
		
		print(arr);
		print(arrString);
		System.out.println();
		
		stackReverse(arr);
		stackReverse(arrString);
		
		
	}
	
	/*
	public static void push_pop(Comparable[] arr, MyStack<Integer> stack) {
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=stack.pop();
		}
	}
	*/
	
	public static void print(Comparable arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void sort(Comparable arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min].compareTo(arr[j])>0)
					min=j;
			}
			Comparable temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	public static void stackReverse(Comparable[] arr) {
		MyStack<Comparable> stack=new MyStack<Comparable>();
		for(int i=0;i<arr.length;i++)
			stack.push(arr[i]);
		while(!stack.isEmpty())
			System.out.print(stack.pop()+" ");
		System.out.println();
	}
	public static void reverseArray(Comparable[] arr) {
		Comparable[] arrCopy=new Comparable[arr.length];
		for(int i=0;i<arr.length;i++) {
			arrCopy[i]=arr[arr.length-i-1];
		}
		arr=arrCopy;
	}


}
