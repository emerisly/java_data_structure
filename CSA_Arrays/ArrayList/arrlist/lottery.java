package arrlist;

import java.util.ArrayList;

public class lottery {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> listi=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		for(int i=0;i<10;i++) {
			list.add(""+i);
			listi.add(""+i);
		}
		for(int i=10;i<30;i++) {
			list.add(""+i);
			listi.add(""+i);
		}
		for(int i=0;i<7;i++) {
			int ran=(int)(Math.random()*list.size());
			list2.add(""+list.get(ran));
			list.remove(ran);
		}
		
		for(int i=0;i<list2.size()-1;i++) {
			for(int j=0;j<list2.size()-i-1;j++) {
				if(Integer.parseInt(list2.get(j))>Integer.parseInt(list2.get(j+1))) {
					list2.set(j, list2.set(j+1,list2.get(j)));
					//String temp=list2.get(j);
					//list2.set(j, list2.get(j+1));
					//list2.set(j+1, temp);
				}
			}
		}

		System.out.println("Initial pool: "+listi);
		System.out.print("Picked: { ");
		for(int i=0;i<7;i++) {
			if(list2.get(i).length()==1) {
				list2.set(i, "0"+i);
			}
			System.out.print(list2.get(i)+" ");
		}
		System.out.println("}");
		
		System.out.println("Remaining: "+list);
	}

}
