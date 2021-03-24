package MyStack;

import java.util.Stack;
import java.util.StringTokenizer;

public class extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="8 4 + 6 2 - /";
		System.out.println(calculate(str1));
	}

	public static int calculate(String expression) {
		StringTokenizer st=new StringTokenizer(expression);
		Stack<Integer> stack=new Stack<Integer>();
		while(st.hasMoreTokens()) {
			String str=st.nextToken();
			char c=str.charAt(0);
			if(Character.isDigit(c)) {
				stack.push(Integer.parseInt(str));
			}
			else {
				int ans=stack.pop();
				int a=stack.pop();
			switch(c) {
			case '+':
				ans+=Integer.parseInt(""+stack.pop());
				break;
			case '-':
				ans=Integer.parseInt(""+stack.pop())-ans;
				break;
			case '*':
				ans*=Integer.parseInt(""+stack.pop());
				break;
			case '/':
				ans=Integer.parseInt(""+stack.pop())/ans;
				break;
			case '^':
				ans=(int)Math.pow(Integer.parseInt(""+stack.pop()),ans);
				break;
			default:
				break;
			}
			stack.push(ans);
		}
	}
		return stack.pop();
}
}
