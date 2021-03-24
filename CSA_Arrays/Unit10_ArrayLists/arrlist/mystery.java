package arrlist;

import java.util.ArrayList;

public class mystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(60);
		list.add(50);
		list.add(40);
		mystery1(list);
	}

	public static void mystery1(ArrayList<Integer> list) 
	{ 
	  for (int i = list.size() - 1; i > 0; i--) 
	  { 
	    if (list.get(i) < list.get(i - 1)) 
	    { 
	      int element = list.get(i); 
	      list.remove(i); 
	      list.add(0, element); 
	    } 
	  } 
	  System.out.println(list); 
	} 

}
