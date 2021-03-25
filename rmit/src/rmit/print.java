package rmit;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//println -> print and new line
		System.out.println(1);
		System.out.println("Hello World");
		
		//print -> print
		System.out.print("print");
		System.out.print("print");
		
		int x = name();
		System.out.println("x="+x+"and this is how you print");
		
		name();

	}
	
	public static int name() {
		System.out.println("test");
		return 0;
	}

}
