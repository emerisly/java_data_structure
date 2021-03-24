package class9;

public class Exerice3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lastDigit(-947);

	}
	
	public static void lastDigit(int num) {
		String numStr = "" + num; //have to convert to String
		int index = numStr.length()-1;
		//.charAt() and .length() works only with String
		char ch = numStr.charAt(index);
		int ans = Integer.parseInt(ch+"");
		int ans2 = Character.getNumericValue(ch);
		System.out.println(ans2);
		System.out.println(ans);
	}

}
