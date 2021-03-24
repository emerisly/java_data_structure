package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = new String[1];
		System.out.println(Arrays.toString(array));
		//array.toString -> wrong!!
		
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list);
		list.add("OH1");
		list.add("OH2");
		list.add("OH3");
		list.add("OH4");
		list.remove(2);
		System.out.println(list);
		list.remove(list.size()-1);
		//Arrays.toString(array);
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(new Integer(4));
		System.out.println(list1);
		
		List<String> listString = new ArrayList<>();
		
		int num1 = 1;
		Integer num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		
		String str = "12345";
		int num3 = Integer.parseInt(str);
		System.out.println(num3);
		
		
		ArrayList<String> List4 = new ArrayList<>();
	    List4.add("abc");
	    System.out.println(List4);

	}

}
