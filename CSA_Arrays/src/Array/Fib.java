package Array;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFib(30));

	}
	
	
	public static long getFib(int num) {
		if(num<=2) {
			return 1;
		}
		else {
			return getFib(num-1)+getFib(num-2);
		}
	}
}
