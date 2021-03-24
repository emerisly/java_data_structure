package MyQueue;

import java.util.LinkedList;

public class MyQueue<Type> {
	
	LinkedList<Type> list;
	
	public MyQueue() {
		list=new LinkedList<Type>();
	}
	
	public void enqueue(Type obj) {
		list.add(obj);
	}
	public Type dequeue() {
		if(list.size()>0)
			return list.removeFirst();
		else
			System.out.println("queue is empty");
		return null;
	}
	public boolean isEmpty() {
		return list.size()==0;
	}
	
	
}
