package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integer=new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5));
		for(int i:integer) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=0;i<integer.size();i++) {
			System.out.print(integer.get(i));
		}
		System.out.println();
		Iterator iter=integer.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
		System.out.println();
		System.out.println(integer);
	}

}
