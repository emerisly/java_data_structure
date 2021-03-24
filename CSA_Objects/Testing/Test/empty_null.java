package Test;

public class empty_null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		String t="";
		if(t.equals(s))
			System.out.println("Cool");
		else
			System.out.println("NotCool");
		int x=t.compareTo("a");
		System.out.println(x);

	}

}
