import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I have not!yet begun'Tofight'";
		StringTokenizer tokenizer = new StringTokenizer(s,"!,',,");
		while(tokenizer.hasMoreElements()) {
			String token=tokenizer.nextToken();
			System.out.println(token);
		}

	}

}
