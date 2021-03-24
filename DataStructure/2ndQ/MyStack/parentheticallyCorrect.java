package MyStack;

import java.util.Scanner;

public class parentheticallyCorrect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=input.nextLine();

		MyStack<String> stack=new MyStack<String>();
		while(!str.isEmpty()) {
			boolean pflag=true;

			char c=str.charAt(0);
			int i;
			for(i=0;i<str.length();i++) {
				c=str.charAt(i);
				if(back(c)) {
					if(stack.peek()==null) {
						stack.push(""+c);
						System.out.println("Error at Position "+i+": Found a "+stack.peek()+" missing a "+getPair(stack));
						pflag=false;
						break;
					}
					if(match(stack,c)) {
						stack.pop();
					}
					else {
						System.out.println("Error at Position "+i+": Found "+c+" expected "+getPair(stack));
						pflag=false;
						break;
					}
				}
				else if(inStack(c)) {
					stack.push(""+c);
				}
			}
			
			

			if(pflag&&stack.isEmpty())
				System.out.println("OK");
			
			if(pflag&&!stack.isEmpty())
				System.out.println("Error at Position "+i+": Found a space expecting a "+getPair(stack));
			
			while(stack.peek()!=null) {
				stack.pop();
			}
			
			System.out.println("Enter a String:");
			
			str=input.nextLine();
		}
		input.close();
		System.out.println("Program Ended");
	}
	
	public static boolean back(char c) {
		if(c==')'||c==']'||c=='}'||c=='>') {
			return true;
		}
		return false;
	}
	public static boolean match(MyStack<String> stack,char c) {
		if(stack.peek()==null) return false;
		if(stack.peek().equals("(")&&c==')') return true;
		if(stack.peek().equals("[")&&c==']') return true;
		if(stack.peek().equals("{")&&c=='}') return true;
		if(stack.peek().equals("<")&&c=='>') return true;
		return false;
	}
	public static String getPair(MyStack<String> stack) {
		String s=stack.pop();
		char c=s.charAt(0);
		if(c=='(') return ")";
		else if(c=='[') return "]";
		else if(c=='{') return "}";
		else if(c=='<') return ">";
		else if(c==')') return "(";
		else if(c==']') return "[";
		else if(c=='}') return "{";
		else if(c=='>') return "<";
		return "WA";
	}
	public static String getSkipPair(MyStack<String> stack,String s) {
		String str=stack.peek();
		char c=str.charAt(0);
		while(!back(c)) {
			stack.pop();
			str=stack.peek();
			c=str.charAt(0);
		}
		return ""+c;
	}
	public static boolean inStack(char c) {
		if(c=='('||c=='['||c=='{'||c=='<')
			return true;
		return false;
	}

}



/*

(ab)(c[dx]x)
(8+4)/[7-{2*3}5]
((<<x>)>)
(6-2)/(8+7))
(8+2/3
public static void main(String[args)



 */


















/*
char c=str.charAt(0);
int i;
for(i=0;i<str.length();i++) {
	c=str.charAt(i);
	//System.out.println(i+" "+c);
	//if(!Character.isAlphabetic(c)&&!Character.isDigit(c)) {

	//System.out.println("VS "+stack.peek()+" "+c);
	
	//if(stack.peek()!=null&&stack.peek().equals("(")) System.out.println("peek is (");
	
	if(stack.peek()!=null) {
	if(stack.peek().equals("(")&&(c=='>'||c==']'||c=='}')) {
		System.out.println("Error at Position "+i+": Found "+c+" expected )");
		break;
	}
	else if(stack.peek().equals("[")&&(c=='>'||c==')'||c=='}')) {
		System.out.println("Error at Position "+i+": Found "+c+" expected ]");
		break;
	}
	else if(stack.peek().equals("{")&&(c=='>'||c==']'||c==')')) {
		System.out.println("Error at Position "+i+": Found "+c+" expected }");
		break;
	}
	else if(stack.peek().equals("<")&&(c==')'||c==']'||c=='}')) {
		System.out.println("Error at Position "+i+": Found "+c+" expected >");
		break;
	}
	}

	//System.out.println("**** stack peek: "+stack.peek());
	
	if(c==')'&&stack.peek().equals("("))	{
		stack.pop();
		//System.out.println("( pushed");
	}
	else if(c==']'&&stack.peek().equals("]"))  stack.pop();
	else if(c=='}'&&stack.peek().equals("}"))  stack.pop();
	else if(c=='>'&&stack.peek().equals(">"))	stack.pop();
	else {
		stack.push(""+c);
		//System.out.println("Pushed"+c);
		//System.out.println("size"+stack.size());
	}
		
		
	//}
}
//System.out.println(stack.peek());
//System.out.println(c);
if(stack.peek()=="("&&c!=')') System.out.println("Error at Position "+i+": Found "+c+" expected )");
else if(stack.peek()=="["&&c!=']') System.out.println("Error at Position "+i+": Found "+c+" expected ]");
else if(stack.peek()=="{"&&c!='}') System.out.println("Error at Position "+i+": Found "+c+" expected }");
else if(stack.peek()=="<"&&c!='>') System.out.println("Error at Position "+i+": Found "+c+" expected >");

//System.out.println(stack.size());
 * 
 * 
 */
