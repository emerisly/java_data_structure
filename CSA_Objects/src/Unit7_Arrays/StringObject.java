package Unit7_Arrays;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x=new String("ab");
		System.out.println(x);
		change(x);
		System.out.println(x);
		
		String str="string";
		System.out.println(str);
		String str2=str;
		System.out.println(str2);
		str2="newstr";
		System.out.println(str2);
		System.out.println(str);
		
	}

	private static void change(String x) {
		// TODO Auto-generated method stub
		x="cd";
		System.out.println(x);
	}

}
