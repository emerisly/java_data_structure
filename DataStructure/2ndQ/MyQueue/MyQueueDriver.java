package MyQueue;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;

public class MyQueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue<Integer> queue=new MyQueue<Integer>();
		
		Integer[] arr= {80,75,26,42,88,90,75,90,100,82};
		for(int i=0;i<arr.length;i++) {
			queue.enqueue(arr[i]);
		}
		int index=0;
		while(!queue.isEmpty()) {
			arr[index]=5+queue.dequeue();
			index++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
