package Math;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 369;
		int lastDigit = 365%10;
		System.out.println(lastDigit);
		
		int tenthDigit=n/10;
		//in java, division is floor division
		System.out.println(tenthDigit);
		
		
		//= is assign
		//== is checking if equal
		if(n==365)
			System.out.println(n);
		
		
		
		System.out.println(2*3+5*4.1);
		System.out.println(4.0*5-3*4);
		System.out.println(5/2.0);
		
		System.out.println(44/11/2.3);
		System.out.println(49/11/2.3);
		System.out.println(49/2.3/11);
		
		int num=28738502;
		String str=""+num;
		System.out.println(str.charAt(1));
		
		System.out.println("name"+6+7);
		System.out.println(6+7+"name");
		
		System.out.println(4+3.0+"a"+7+9);
		
		double number=10;
		int integer=(int)10.50;
		
		
		int x= (int) 15.2;
		//高精度变成低精度 需要加括号
		
		int a=0;
		//System.out.println(a);
		
		if(a!=1) {
			//
		}
		//System.out.println(printt());
		//int xxx=10;
	}
	
	public static char printt() {
		String x="abcde";
		System.out.println("OOOOOOO");
		
		return x.charAt(1);
		//x 的 charAt method
		//对 x 做 charAt method
	}

}
