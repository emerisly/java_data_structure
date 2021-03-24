package arrlist;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words=new ArrayList<String>(
				Arrays.asList("four","score","and","seven","years","ago"));
		System.out.println("words="+words);
		for(int i=0;i<words.size();i+=2) {
			words.add(i,"~");
		}
		System.out.println("words="+words);
		for(int i=0;i<words.size();i++) {
			words.remove(i);
		}
		System.out.println("words="+words);

	}

}
