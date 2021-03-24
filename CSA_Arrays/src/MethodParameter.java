import java.util.Arrays;

public class MethodParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,69,65,35,98,34,52,76,90};
		int c=10;
		int d=15;
		increaseArrayBy5(a);
		increaseBy5(c,d);
		System.out.println(Arrays.toString(a));
		System.out.println(c+" "+d);
		System.out.println("Arrays are stored in the heap,"
				+ " and for the increaseArrayBy5 method, \n"
				+ "it created a new refences variable that "
				+ "have access to the real value of the array. \n"
				+ "So when you run the increaseArrayBy5 method, "
				+ "it change the real value in the heap. \nSo the"
				+ "real value was changed even when the return "
				+ "type is void.\nHowever, when run the increaseBy5 "
				+ "method, it initials new two ints that is called a and b. \n"
				+ "Without a return, the value won't be store back "
				+ "to \"c\" and \"d\".\nSo the array changed but ints didn't.");
		
	}
	
	public static void increaseArrayBy5 (int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i]+=5;
		}
	}
	
	public static void increaseBy5(int a,int b) {
		a+=5;
		b+=5;
	}

}
