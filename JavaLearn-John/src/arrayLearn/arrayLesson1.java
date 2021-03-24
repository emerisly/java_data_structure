package arrayLearn;

import java.util.Arrays;

public class arrayLesson1 {
	public static void main(String[] args) {
	
		String str = new String();
		//String -> length()
		//array -> length
		
		//length-1=last index
		int[] score = new int[3];
		//<type> name = new <type>
		score[0]=95;
		score[1]=85;
		score[2]=65;
		
		
		
		System.out.println(score);
		System.out.println(score[0]);
		
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(score));
		
	}

}
