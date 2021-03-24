package MyStack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<Type> {
	
	private ArrayList<Type> list;

	public boolean isEmpty() {
		return list.size() == 0;
	}
	public MyStack() {
		list = new ArrayList<Type>();
	}

	public Type pop() {
		if(list.isEmpty())
			throw new EmptyStackException();
		Type temp = list.remove(list.size()-1);
		return temp;
	}

	public void push(Type obj) {
		list.add(obj);
	}

	public Type peek() {
		if(list.isEmpty())
			return null;
		//throw new EmptyStackException();
		Type temp = list.get(list.size()-1);
		return temp;
	}

	public int size() {
		return list.size();
	}
}
