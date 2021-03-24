package tree;

public class implementationMethods {
	
	
	//Program #1, #2, #3
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	}

		
	public class Node{ 
	    int data; 
	    Node left, right; 
	  
	    public Node(int item){ 
	        data = item; 
	        left = right = null; 
	    } 
	}
	
	
	Node root; 
	int size(){ 
		return size(root); 
	} 
	 
	int size(Node node){ 
		if(node==null) 
			return 0; 
	    else
	        return(size(node.left)+1+size(node.right)); 
	} 
		
	boolean isEmpthy() {
	  	if(root==null)
	    	return true;
	    return false;
	}
	    
	boolean isLeaf(Node node) {
	    if(node.left==null&&node.right==null)
	    	return true;
	    return false;
	}
	    
	int getDepth() {
		return getDepth(root);
	}
	int getDepth(Node node) {
	    if(root==null)
	    	return 0;
	    else {
	    	int leftDepth=getDepth(node.left);
	    	int rightDepth=getDepth(node.right);
	    	if(leftDepth>rightDepth)
	    		return leftDepth+1;
	    	else
	    		return rightDepth+1;
	    }
	}
}