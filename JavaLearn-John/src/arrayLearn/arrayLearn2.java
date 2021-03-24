package arrayLearn;

import java.util.Arrays;

public class arrayLearn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = new int[5];
		for(int i=0;i<list.length;i++){
		  list[i]=i*2+1;
		}
		
		for(int i=0;i<list.length;i++){
			  list[i]++;
			}

		System.out.println(Arrays.toString(list));

		
		int[] evens = new int[11];
		for(int i=0;i<evens.length;i++){
		evens[i]=4+i*2;
		}
		System.out.println(Arrays.toString(evens));
		
		int[] temp = {30,20,25,28,29,30,18,24};
		int sum = 0;
		for(int n:temp) {
			sum+=n;
		}
		double avg = (double)sum/temp.length;
		int cnt = 0;
		for(int n:temp) {
			if(n>avg) cnt++;
		}
		System.out.println(cnt+" days above avg");
		double percent = (double)cnt/temp.length*100;
		System.out.println(percent+" % above avg");
		System.out.println(Arrays.toString(temp));

	}

}
