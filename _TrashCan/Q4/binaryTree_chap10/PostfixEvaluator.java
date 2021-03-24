import jsjf.*;
import jsjf.exceptions.*;
import java.util.*;
import java.io.*;

/**
 * PostfixEvaluator this modification of our stack example uses a 
 * stack to create an expression tree from a VALID integer postfix expression 
 * and then uses a recursive method from the ExpressionTree class to 
 * evaluate the tree.
 * 
 * @author Lewis and Chase
 * @version 4.0
 */
public class PostfixEvaluator    
{
    private String expression;
    private Stack<ExpressionTree> treeStack;
    
    /**
     * Sets up this evalutor by creating a new stack.
     */
    public PostfixEvaluator()
    {
        treeStack = new Stack<ExpressionTree>();
    }

    /**
     * Retrieves and returns the next operand off of this tree stack.
     *
     * @param treeStack  the tree stack from which the operand will be returned
     * @return the next operand off of this tree stack
     */
    private ExpressionTree getOperand(Stack<ExpressionTree> treeStack)
    {
        ExpressionTree temp;
        temp = treeStack.pop();
        
        return temp;
    }
    
    /**
     * Evaluates the specified postfix expression by building and evaluating
     * an expression tree. 
     *
     * @param expression string representation of a postfix expression
     * @return value of the given expression
     */
    public int evaluate(String expression)
    {
        ExpressionTree operand1, operand2;
        char operator;
        String tempToken;

        Scanner parser = new Scanner(expression);
        
        while (parser.hasNext()) 
        {
            tempToken = parser.next();
            operator = tempToken.charAt(0);
            
            if ((operator == '+') || (operator == '-') || (operator == '*') || 
                 (operator == '/'))
            {
                operand1 = getOperand(treeStack);
                operand2 = getOperand(treeStack);
                treeStack.push(new ExpressionTree 
                                  (new ExpressionTreeOp(1,operator,0), operand2, operand1));
            }
            else
            {
                treeStack.push(new ExpressionTree(new ExpressionTreeOp
                                    (2,' ',Integer.parseInt(tempToken)), null, null));
            }
            
        }
        return (treeStack.peek()).evaluateTree();        
    }
    
    /**
     * Returns the expression tree associated with this postfix evaluator. 
     *
     * @return string representing the expression tree
     */
    public String getTree()
    {
        return (treeStack.peek()).printTree();
    }
}
