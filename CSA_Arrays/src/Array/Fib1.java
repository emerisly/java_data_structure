package Array;

public class Fib1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=40;
		
		
		System.out.println(getFib(1,num,0,1));

	}
	
	public static long getFib(int no, int num, int num1,int num2) {
		int num3=num1+num2;
		if(no<num-1) {
			return getFib(no+1,num,num2,num3);
		}
		return num3;
	}

}
