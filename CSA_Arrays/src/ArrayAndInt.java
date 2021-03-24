import java.util.Arrays;

public class ArrayAndInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int[] numArr= {0,1,2,3};
		increasedBy5(num);
		increasedBy5(numArr);
		System.out.println(num);
		System.out.println(Arrays.toString(numArr));
	}
	public static void increasedBy5(int num) {
		num+=5;
		System.out.println(num);
	}
	public static void increasedBy5(int[] num) {
		for(int i=0;i<num.length;i++) {
			num[i]+=5;
		}
		System.out.println(Arrays.toString(num));
	}

}
