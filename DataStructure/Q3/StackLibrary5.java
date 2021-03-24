import java.util.*;

public class StackLibrary5 {
	
	
	public static void main(String[] args)
    {
		
		
		System.out.println(evaluateBinaryExpression("18","+","12"));
		String str1="18 3 2 ^ + 27 3 2 6 + * - /";
		System.out.println(evaluatePostFixExpression(str1));
		
		
        String inFix = "";
        int answer = 0;
        
        System.out.println("\n*** The first part is just evaluating the post fix worth 10 points ***");
        String postFix = " 8 4 + 10 6 - /";
        answer = evaluatePostFixExpression(postFix);
        System.out.println("The postfix expression is ");
        System.out.println(postFix);
        System.out.println("The answer is " + answer + " it is worth 10 points");
        
        
        System.out.println("\n*** This part is worth 4 points for a total of 14");
        inFix = "( 32 + 16 / 4 * 2 )";
        postFix = infixToPostfix(inFix);
        System.out.println(inFix);
        System.out.println(postFix);
        answer = evaluatePostFixExpression(postFix);
        System.out.println("The answer is " + answer);
        
        System.out.println("\n*** This part is worth 2 points for a total of 16");
        inFix = "8 + 4 * 2 ^ 3 - 9";
        postFix = infixToPostfix(inFix);
        System.out.println(inFix);
        System.out.println(postFix);
        answer = evaluatePostFixExpression(postFix);
        System.out.println("The answer is " + answer);
        
        System.out.println("\n*** This part is worth 4 points for a total of 20");
        inFix = "( 8 + 4 * 2 ^ 3 - 5 ) / ( 3 - 2 * 5 + 3 ^ 2 + 4 )";
        postFix = infixToPostfix(inFix);
        System.out.println(inFix);
        System.out.println(postFix);
        answer = evaluatePostFixExpression(postFix);
        System.out.println("The answer is " + answer);
        
        System.out.println("End main");
        
    }
	
	public static int getPriority(String token) {
		char c=token.charAt(0);
		switch (c) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
	}
	public static boolean isLeftParenthesis(String token) {
		if(token=="(")
			return true;
		return false;
	}
	public static boolean isRightParenthesis(String token) {
		if(token==")")
			return true;
		return false;
	}
	public static boolean isOperator(String token) {
		if(token=="+"||token=="-"||token=="*"||token=="^"||token=="/")
			return true;
		return false;
	}
	
	
	public static String infixToPostfix(String inFix) {
        String postFix = "";
        StringTokenizer tokenizer = new StringTokenizer(inFix);
        Stack<String> stack = new Stack<String>();
        String tokenInFix = "";
        String tokenStack = "";
        while(tokenizer.hasMoreTokens()){
            tokenInFix = tokenizer.nextToken();
            if(isOperator(tokenInFix)){
                if(stack.isEmpty()||isLeftParenthesis(tokenInFix)){
                    stack.push(tokenInFix);
                }
                else{
                    while(!stack.isEmpty()&& isOperator(stack.peek()) && getPriority(stack.peek())>= getPriority(tokenInFix)){
                        tokenStack = stack.pop();
                        postFix += tokenStack + " ";
                    }
                    stack.push(tokenInFix);
                }
            }
            else if(isLeftParenthesis(tokenInFix)){
                stack.push(tokenInFix);
            }
            else if(isRightParenthesis(tokenInFix)){
                while(!isLeftParenthesis(stack.peek())){
                   postFix += stack.pop() + " ";        
                }
                stack.pop();
            }
            else{
                postFix += tokenInFix + " ";
            }
        }
       
        while(!stack.isEmpty()){
            postFix += stack.pop() + " ";
        }
               
        return postFix;
    }
	
		
	public static int evaluatePostFixExpression(String PF) {
		StringTokenizer st=new StringTokenizer(PF);
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
	public static String evaluateBinaryExpression(String op1, String oper, String op2) {
		int ans=0;
		int numOp1=Integer.parseInt(op1);
		int numOp2=Integer.parseInt(op2);
		char c=oper.charAt(0);
		switch(c) {
		case '+':
			ans=numOp1+numOp2;
			break;
		case '-':
			ans=numOp1-numOp2;
			break;
		case '*':
			ans=numOp1*numOp2;
			break;
		case '/':
			ans=numOp1/numOp2;
			break;
		case '^':
			ans=(int)Math.pow(numOp1,numOp2);
			break;
		default:
			break;
		}
		return ""+ans;
	}
	
}
