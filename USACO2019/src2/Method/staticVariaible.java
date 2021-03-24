package Method;

public class staticVariaible {
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(n=0;n<5;n++) {
//			System.out.println(n);
//		}
		change(1);
		System.out.println(n);

	}
	public static void change(int x) {
		x++;
		n++;
		n++;
	}

}
