package _TrashCan;

public class testSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd";
		String str2 = str.substring(4);
		System.out.println(str2);
		if(str2=="") System.out.println("OHHO");
		if(str2==null) System.out.println("null");
		String str3 = str.substring(0,0);
		System.out.println(str3);
		if(str3=="") System.out.println("str3 empty");
		System.out.println("what is happening?");
		
		if(str2.isEmpty()) System.out.println("It's empty");
		if(str2.equals("")) System.out.println("It's empty");
		
	}

}
