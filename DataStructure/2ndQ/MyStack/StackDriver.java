package MyStack;

import java.util.EmptyStackException;

public class StackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {80,70,100,50,90};
		
		MyStack<Integer> stack=new MyStack<Integer>();
		
		for(int i=0;i<arr.length;i++)
			stack.push(arr[i]);
		
		while(!stack.isEmpty()){
			int i=0;
			System.out.println(arr[i]=(int)stack.pop());
			i++;
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		try {
			stack.pop();
		}
		catch(EmptyStackException e) {
			System.out.println("The stack is empty");
		}
		
		
	}

}
