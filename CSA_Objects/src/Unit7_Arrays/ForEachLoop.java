package Unit7_Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5};
		int count=0;
		for(int n:arr) {
			if(n<5) {
				count++;
			}
		}
		System.out.println(count);

	}

}
