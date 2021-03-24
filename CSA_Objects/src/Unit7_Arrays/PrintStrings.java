package Unit7_Arrays;

public class PrintStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sbjava";
		String str2=str;
		str=changeString(str);
		System.out.println(str);
		System.out.println(str2);
	}
	public static String changeString(String str) {
		str="sb";
		System.out.println(str);
		return str;
	}

}
