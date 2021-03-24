package class4;

public class Methods {

	public static void main(String[] args) {
		writeSpaces(10*10);
		System.out.println();
		String s1="oh rip";
		String s2=s1;
		String s3="oh rip";
		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s3));
		
	}
	//end main
	
	public static void writeSpaces(int n) {
		for(int i=0;i<n;i++) System.out.print("_");
	}
	//end writeSpaces
	
	
	

}
