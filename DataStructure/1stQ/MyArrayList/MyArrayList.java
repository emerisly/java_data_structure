package MyArrayList;

public class MyArrayList <E> {

		// TODO Auto-generated method stub

		private E[] theData;
		private int size=0;
		private int capacity=0;
		@SuppressWarnings("unchecked")
		public MyArrayList(int initCapacity) {
			theData=(E[])new Object[initCapacity];
			capacity=initCapacity;
		}
		public boolean isEmpty() {
			return size==0;
		}
		public E set(int index,E obj) {
			E temp=theData[index];
			theData[index]=obj;
			return temp;
		}
		public boolean add(E e) {
			//O(1) without reallocating and O(n) with reallocating
			if(e==null) 
				throw new NullPointerException("element should not be null");
			if(size==capacity)
				reallocate();
			theData[size]=e;
			size++;
			return true;
		}
		public void add(int i,E obj) {
			if(i>size||i<0)
				throw new IndexOutOfBoundsException("Index out of bound");
			if(size==capacity)
				reallocate();
			for(int index=size;index>i;index--) {
				theData[index]=theData[index-1];
			}
			theData[i]=obj;
			size++;
		}
		public int indexOf(E obj) {
			for(int i=0;i<size;i++) {
				if(theData[i].equals(obj))
					return i;
			}
			return -1;
		}		
		public boolean remove(E obj) {
			int index=indexOf(obj);
			if(index==-1)
				return false;
			return true;
		}
		
		public E remove(int index) {
			if(index<0||index>=size)
				throw new IndexOutOfBoundsException("index has to be >= 0 and < size");
			E temp=theData[index];
			int i;
			for(i=index;i<size-1;i++) {
				theData[i]=theData[i+1];
			}
			theData[i]=null;
			size--;
			return temp;
			
			/*
			@SuppressWarnings("unchecked")
			E[] tempArrayList=(E[])new Object[capacity];
			
			for(int i=0;i<size;i++) {
				if(i<index)
					tempArrayList[i]=theData[i];
				if(i>index)
					tempArrayList[i-1]=theData[i];
			}
			theData=tempArrayList;
			size--;

			theData=tempArrayList;
			return temp;
			*/
			
			/*
			System.out.print("hey  ");			
			for(int index=0;index<i;index++) {
				tempArrayList[index]=theData[index];
			}
			for(int j=0;j<i;j++) {
				System.out.print(tempArrayList[j]+" ");
			}
			for(int index=i+1;index<size;index++)
				tempArrayList[index]=theData[index-1];
			*/
		}
		
		
		public void reallocate() {
			System.out.println("reallocating");
			capacity+=10;
			@SuppressWarnings("unchecked")
			E[] tempArrayList=(E[])new Object[capacity];
			for(int i=0;i<size();i++)
				tempArrayList[i]=theData[i];
			theData=tempArrayList;
		}
		
		public E get(int index) {
			if(index<0||index>=size)
				throw new ArrayIndexOutOfBoundsException("Index is "+index+" it musts >=0 and <size");
			return theData[index];
		}
		public int size() {
			return size;
		}
		
	}


