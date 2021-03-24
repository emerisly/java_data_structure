package LinkedlistProject;

public class LinkedList1<Type> {
	private ListNode<Type> first;
	private int size=0;
	ListNode<Type> curTemp;
	ListNode<Type> tempFirst;
	
	public void reverseList() {
		if(first!=null) 
			reverseListHelper(first);
		else
			System.out.println("List Empty");
		first=tempFirst;
	}
	private void reverseListHelper(ListNode<Type> cur) {
		if(cur.getNext()!=null) {
			reverseListHelper(cur.getNext());			
		}
		if(cur.getNext()==null) {
			tempFirst=cur;
			curTemp=cur;
		}
		else {
			curTemp.setNext(cur);
			curTemp=cur;
			if(cur==first) {
				cur.setNext(null);
			}
		}
	}
	
	
	public void printRecursiveForward() {
		checkNull();
		if(first!=null)
			printRecursiveHelperForward(first);
		else
			System.out.println("List is Empty");
	}
	private void printRecursiveHelperForward(ListNode <Type> current) {
		if(current!=null) {
			System.out.println(current.getValue());
			printRecursiveHelperForward(current.getNext());
		}
	}
	
	public void printRecursiveBackward() {
		checkNull();
		if(first!=null)
			printRecursiveHelperBackward(first);
		else
			System.out.println("List is Empty");
	}
	private void printRecursiveHelperBackward(ListNode <Type> current) {
		if(current!=null) {
			printRecursiveHelperBackward(current.getNext());
			System.out.println(current.getValue());
		}
	}
	
	public void checkNull() {
		ListNode<Type> current=first;
		for(int i=0;i<size-2;i++) {
			if(current.getNext().getValue()==null) {
				current.setNext(current.getNext().getNext());
				//size--;
			}
			current=current.getNext();
		}
	}
	
	public boolean add(Type obj) {
		ListNode<Type> newNode=new ListNode<Type>(obj,null);
		ListNode<Type> current;
		if(first==null)
			first=newNode;
		else {
			current=first;
			while(current.getNext()!=null)
				current=current.getNext();
			current.setNext(newNode);
		}
		size++;
		return true;
	}
	
	public void add(int index,Type obj) {
		ListNode<Type> newNode=new ListNode<Type>(obj,null);
		if(index<0||index>size)
			throw new IndexOutOfBoundsException("Index out of bound");
		if(index==0)
			addFirst(obj);
		else {
			int i=0;
			ListNode<Type> current=first;
			ListNode<Type> previous=first;
			while(i<index) {
				previous=current;
				current=current.getNext();
				i++;
			}
			previous.setNext(newNode);
			newNode.setNext(current);
			size++;
		}
	}
	
	public void addFirst(Type obj) {
		ListNode<Type> newNode=new ListNode<Type>(obj,null);
		if(first==null)
			first=newNode;
		else {
			newNode.setNext(first);
			first=newNode;
		}
		size++;
	}

	public void set(int index,Type obj) {
		if(index<0||index>=size) {
			throw new IndexOutOfBoundsException("IndexOutOfBounds");
		}
		ListNode<Type> newNode=new ListNode<Type>(obj,null);
		ListNode<Type> current=first;
		ListNode<Type> next=first;
		int i=0;
		while(i<index) {
			current=current.getNext();
			next=current.getNext();
			i++;
		}
		//previous.setNext(current);
		current=newNode;
		current.setNext(next);
	}
	
	public void print() {
		ListNode<Type> current=first;
		if(current==null)
			System.out.println("list is empty");
		else {
			while(current!=null) {
				System.out.println(current.getValue());
				current=current.getNext();
			}
		}
	}
	public String toString() {
		ListNode<Type>current=first;
		String result="";
		if(current==null)
			System.out.println("list is empty");
		else {
			while(current!=null) {
				result+=current.getValue()+" ";
				current=current.getNext();
			}
		}
		return result;
	}
	public String remove(int index) {
		ListNode<Type> current=first,pre=first;
		String str="";
		if(size>2) {
			for(int i=0;i<index-2;i++) {
				current=current.getNext();
				pre=pre.getNext();
			}
			current=current.getNext();
			str=""+current.getValue();
			pre.setNext(current.getNext());
		}
		else if(size==2) {
			current=current.getNext();
			str=""+current.getValue();
			pre.setNext(null);
		}
		else{
			str=""+first.getValue();
			first.setValue(null);
		}
		size--;
		return str;
	}
	
	public int size() {
		return size;
	}
	public String get(int index){
		ListNode<Type> current=first;
		for(int i=0;i<index;i++) {
			current=current.getNext();
		}
		String str=""+current.getValue();
		return str;
	}
}
