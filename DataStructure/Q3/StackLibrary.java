
import java.util.*;
import java.io.*;

public class StackLibrary {
    public static int evaluatePostFixExpression(String IF)
    {
        String PF = infixToPostfix(IF);
        System.out.println(PF);
        int ans = 0;
        Stack<String> stack = new Stack<String>();
        StringTokenizer tokenizer = new StringTokenizer(PF);
        String token;
        
        while(tokenizer.hasMoreTokens())
        {
            token = tokenizer.nextToken();
            if(stack.isEmpty())
            {
                stack.push(token);
            }
            if(isOperator(token))
            {
                String a = stack.pop();
                String b= stack.pop();
                stack.push(evaluateBinaryExpression(b,token,a));  
            }
            else
            {
                stack.push(token);
            }
        }
        ans = Integer.parseInt(stack.pop());
        
        return ans;
    }
    public static String evaluateBinaryExpression(String op1, String oper, String op2)
    {
        int ans = 0; 
        int numOp1 = Integer.parseInt(op1);
        int numOp2 = Integer.parseInt(op2);
        if(oper.equals("/"))
        {
           ans = numOp1/numOp2;
        }
        else if(oper.equals("*"))
        {
           ans = numOp1*numOp2;
        }
        else if(oper.equals("+"))
        {
           ans = numOp1+numOp2;
        }
        else if(oper.equals("-"))
        {
           ans = numOp1-numOp2;
        }
        else if(oper.equals("^"))
        {
            ans = 1;
           for(int i = 0; i< numOp2;i++)
           {
               ans = ans*numOp1;
           }
        }
        return ans +"";
    }
    public static int getPriority(String token)
    {
        if(token.equals("+")|| token.equals("-"))
        {
            return 1;
        }
        else if(token.equals("*")|| token.equals("/"))
        {
            return 2;
        }
        else if(token.equals("^"))
        {
            return 3;
        }
        return 0;
    }
    public static boolean isLeftParenthesis(String token)
    {
        if(token.equals("("))
        {
            return true;
        }
        return false;
    }
    public static boolean isRightParenthesis(String token)
    {
        if(token.equals(")"))
        {
            return true;
        }
        return false;
    }
    public static boolean isOperator(String token)
    {
        if(token.equals("*")||token.equals("/")||token.equals("-")||token.equals("+")||token.equals("^"))
        {
            return true;
        }
        return false;
    }
    public static String infixToPostfix(String inFix)
    {
        String postFix="";
        StringTokenizer tokenizer = new StringTokenizer(inFix);//tokenizer of the infix expression
        Stack <String> stack = new Stack<String>();
        String tokenInFix = ""; //used for the token from the infix
        String tokenStack = ""; //used for the string or token taken for the stack
        
        while (tokenizer.hasMoreTokens())
        {
            tokenInFix = tokenizer.nextToken();
            if(isLeftParenthesis(tokenInFix))
            {
                stack.push(tokenInFix);
            }
            else if(isOperator(tokenInFix))
            {
                if(stack.isEmpty())
                {
                    stack.push(tokenInFix);
                }
                else 
                {
                    if(getPriority(stack.peek()) >= getPriority(tokenInFix))
                    {
                        while(!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(tokenInFix))
                        {
                          postFix = postFix + " " + stack.pop();
                        }
                        
                      stack.push(tokenInFix);
                    }
                    else
                    {
                        stack.push(tokenInFix);
                    }
                }
            }
            else if(isRightParenthesis(tokenInFix))
            {
                while(!isLeftParenthesis(stack.peek()))
                {
                    postFix=postFix + " " +stack.pop();
                }
                stack.pop();
            }
            else
            {
                postFix = postFix + " " + tokenInFix;
            }
        }
        if(!stack.isEmpty())
        {
            while(!stack.isEmpty())
            {
                postFix=postFix+" " +stack.pop();
            }
        }
        return postFix;
    }
    public static void main(String[]args)
    {
        String inFix = "";
        int answer = 0;
        
        System.out.println("\n*** The first "
                + "part is just evaluating the post fix worth 10 points***");
        String postFix = "( 8 + 4 ) / ( 10 - 6 )";
        
        
        System.out.println("The postFix expression is ");
        answer = evaluatePostFixExpression(postFix);
        System.out.println(" The answer is " + answer + " it is worth 10 points");
        
        System.out.println("\n***This part is worth 4 points for a total of 14 ");
        inFix = "( 32 + 16 / 4 * 2 )";
        System.out.println(inFix);
        answer = evaluatePostFixExpression(inFix);
        System.out.println("The answer is " + answer);
        
        System.out.println("\n***This part is worth 2 points for a total of 16 ");
        inFix = "8 + 4 * 2 ^ 3 - 9";
        System.out.println(inFix);
        answer = evaluatePostFixExpression(inFix);
        System.out.println("The answer is " + answer);
        
        System.out.println("\n***This part is worth 4 points for a total of 20 ");
        inFix ="( 8 + 4 * 2 ^ 3 - 5 ) / ( 3 - 2 * 5 + 3 ^ 2 + 4 )";
        System.out.println(inFix);
        answer = evaluatePostFixExpression(inFix);
        System.out.println("The answer is " + answer);
        
        System.out.println("End main");
                
        
        
        
        
        
    }//end main
}//end class