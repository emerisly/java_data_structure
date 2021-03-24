package Unit5_ProgramLogicAndIndefiniteLoops;
import java.util.*;

public class FirstWordMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		String str=console.nextLine();
		System.out.println(firstWord(str));
		console.close();
	}
	
	public static String firstWord(String s) {
		int countfirst=0;
		int countlast=0;
		outerloop1:
			for(int i=0;i<s.length();i++) {
				countfirst++;
				if(Character.isLetter(s.charAt(i)))
						break outerloop1;
			}
		System.out.println(countfirst);
		outerloop2:
			for(int i=0;i<s.length();i++) {
				countlast++;
				if(Character.isLetter(s.charAt(i))&&i+1<s.length()&&s.charAt(i+1)==' ')
					break outerloop2;
			}
		System.out.println(countlast);
		String str=s.substring(countfirst-1,countlast);
		return str;
	}
}
