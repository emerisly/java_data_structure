package ArrayListLearn;

import java.util.*;


public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		ArrayList<String> list1 = new ArrayList<>();
		//Primitive type: int, double, char, boolean
		list1.add("A");
		list1.add("B");
		list1.add("C");
		//list1.remove(1);
		//list1.remove(2);
		System.out.println(list1);
		list1.set(0,"a");
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(i+". "+list1.get(i));
		}
		
		boolean flag = list1.contains("a");
		System.out.println(flag);
		
		ArrayList<String> list2 = new ArrayList<>();
		System.out.println(list2);

	}

}
