package arrlist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemove2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>(
				Arrays.asList("Namath", "Maynard", "Sauer", "Namath","Namath","Namath", "Snell", "Sauer","Maynard")
				);
		for(int i=1;i<names.size();i++) {
			if(names.get(i).equals(names.get(i-1))) {
				names.remove(i);
				i--;
			}
		}
		System.out.println(names);

	}

}
