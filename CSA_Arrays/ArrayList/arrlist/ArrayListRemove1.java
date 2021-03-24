package arrlist;

import java.util.*;

public class ArrayListRemove1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>(
		Arrays.asList("Namath", "Maynard", "Sauer", "Namath","Namath","Namath", "Snell", "Sauer","Maynard")
		);
		for(int i=0;i<names.size();i++) {
			if(names.get(i).equals("Namath")) {
				names.remove(i);
				i--;
				}
		}

		System.out.println(names);

	}
}
