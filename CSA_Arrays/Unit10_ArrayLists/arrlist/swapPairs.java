package arrlist;

import java.util.ArrayList;
import java.util.Arrays;

public class swapPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> pair=new ArrayList<>(
				Arrays.asList("a","b","c","d","e")
				);
		System.out.println(pair);
		swap(pair);
		System.out.println(pair);
		

	}
	public static ArrayList<String> swap(ArrayList<String> list){
		String str="";
		Boolean flag=false;
		if(list.size()%2!=0) {
			str=list.get(list.size()-1);
			list.remove(list.size()-1);
			flag=true;
			}
//		System.out.println("list"+list);
		String temp;
		for(int i=1;i<list.size();i+=2) {
			temp=list.get(i);
			list.remove(i);
			list.add(i-1,temp);
		}
		if(flag) {
			list.add(str);
		}
		return list;
	}

}
