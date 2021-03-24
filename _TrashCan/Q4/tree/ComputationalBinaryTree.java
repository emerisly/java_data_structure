package tree;

public class ComputationalBinaryTree {
	
	public class arrNode {
		String arr[];
		
		//root
		public arrNode(String data) {
			arr[1]=data;
		}
		
		//adding child
		public arrNode(String parent,String data) {
		    int index=find(parent)+1;
		    if(arr[2*index]==null)
		    	arr[2*index]=data;
		    else
		    	arr[2*index+1]=data;
		}
		
		public int find(String key){
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals(key))
					return i;
			}
			return -1;
		}
	}
	
}
