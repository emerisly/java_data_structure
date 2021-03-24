package MyQueue;

import java.util.LinkedList;
import java.util.Queue;

import MyStack.MyStack;

public class stackQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {80,75,42,99,77,86,92,100,65,87};
		Queue<Integer> queue=new LinkedList<Integer>();
		for(int i=0;i<arr.length;i++) {
			queue.add(arr[i]);
		}
		MyStack<Integer> stack=new MyStack<Integer>();
		while(!queue.isEmpty()) {
			if((queue.peek()%2)!=0)
				stack.push(queue.remove()+10);
			else
				stack.push(queue.remove()+20);
		}
		while(!stack.isEmpty())
			System.out.print(stack.pop()+" ");

	}

}
