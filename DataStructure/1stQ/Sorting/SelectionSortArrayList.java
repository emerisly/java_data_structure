package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<>(
		Arrays.asList("a","c","d","b","e")
		);
		for(int i=0;i<list.size()-1;i++) {
			int min=i;
			int j;
			for(j=i+1;j<list.size()-1;j++) {
				if(list.get(i).compareTo(list.get(j))>0) {
					min=j;
				}
			}
			list.set(i,list.set(min,list.get(i)));
		}
		System.out.println(Arrays.toString(list.toArray()));
	}
}
