package arrayOutput;

import java.util.ArrayList;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sarray= {"Namath","Sauer","Bouzer","Snell","Maynard","Lammons","Atkinson","Dockery"};
		ArrayList <String> list2=new ArrayList<String>();
		for(int i=0;i<sarray.length;i++) 
			list2.add(sarray[i]);
		for(String s:list2)
			System.out.println(s);
		for(int i=0;i<list2.size();i++)
			System.out.println(list2.get(i));
		System.out.println(list2.remove(0)+" "+list2.size());
		System.out.println(list2.remove(2)+" "+list2.size());
		System.out.println(list2.remove(4)+" "+list2.size());
//		System.out.println(list2.remove(6)+" "+list2.size());
//		System.out.println(list2.remove(8)+" "+list2.size());
		list2.add(0,"Bradshaw");
		list2.add(2,"Hannraty");
		list2.add(4,"Samson");
		System.out.println(list2.set(3, "Baker"));
		System.out.println(list2.set(5, "Swann"));
		for(int i=0;i<list2.size();i++)
			System.out.println(i+" "+list2.get(i));
		System.out.println(list2.add("MrGill"));
		System.out.println(list2.add("Baker"));
		
	}

}
