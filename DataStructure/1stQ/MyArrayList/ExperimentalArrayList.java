package MyArrayList;

import java.util.ArrayList;

public class ExperimentalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(0,50);
		list.add(list.size(),100);
		list.add(3,111);
		list.add(list.size(),null);
		System.out.println(list.indexOf(null));
		System.out.println(list);
		//list.add(-2,90); java.lang.IndexOutOfBoundsException
		//list.add(100,120);
		
		
	}

}
