package MyStack;

import java.awt.datatransfer.StringSelection;
import java.util.Stack;
import java.util.StringTokenizer;

public class postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="18 3 2 ^ + 27 3 2 6 + * - /";
		//String str1="8 4 + 6 2 - /";
		System.out.println(calculate(str1));
		
	}
	
	public static int calculate(String str) {
		StringTokenizer st=new StringTokenizer(str);
		Stack<Integer> stack=new Stack<Integer>();
		while(st.hasMoreTokens()) {
			String s=st.nextToken();
			//System.out.println(s);
			char c=s.charAt(0);
			if(Character.isDigit(c)) {
				int n=Integer.parseInt(s);
				stack.push(n);
				//System.out.println("peek"+stack.peek());
			}
			else{
				int ans=stack.pop();
				int a=stack.pop();
				switch(c) {
				case '+':
					ans+=a;
					break;
				case '-':
					ans=a-ans;
					break;
				case '*':
					ans*=a;
					break;
				case '/':
					ans=a/ans;
					break;
				case '^':
					ans=(int)Math.pow(a,ans);
					break;
				default:
					break;
				}
				stack.push(ans);
			}
		}
		return (int)stack.peek();
	}

}
