package arrlist;

import java.util.ArrayList;
import java.util.Arrays;

public class arrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> List=new ArrayList<>(
		Arrays.asList(6,1,8)
		);
		int len=List.size();
		for(int i=0;i<len;i++) {
			List.add(i+1,new Integer(i));
			Object x=List.set(i, new Integer(i+2));
		}
		System.out.println(List);

	}

}
