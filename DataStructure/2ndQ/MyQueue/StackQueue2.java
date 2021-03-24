package MyQueue;

import java.util.Scanner;
import java.util.StringTokenizer;

import MyStack.MyStack;

public class StackQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		reverse(st);
	}
	
	public static void reverse(StringTokenizer st) {
		MyStack<String> stack=new MyStack<String>();
		while(st.hasMoreTokens()) {
			String words=st.nextToken();
			for(int i=0;i<words.length();i++)
				stack.push(""+words.charAt(i));
			while(!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
			System.out.print(" ");
		}
	}
}
