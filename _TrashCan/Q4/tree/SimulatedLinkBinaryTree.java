package tree;

public class SimulatedLinkBinaryTree {

	Node arr[];
	int size;
	
	public class Node {
		String data;
		int parent;
		int left;
		int right;
		
		//root
		public Node(String d) {
			arr[0].data=d;
			size++;
		}
		
		//adding child
		public Node(String parent,String d) {
			arr[size].data=d;
		    int index=find(parent);
		    if(index==-1)
		    	throw new IllegalArgumentException("Cannot find parent node");
		    if(arr[index].left==0)
		    	arr[index].left=size;
		    else if(arr[index].right==0)
		    	arr[index].right=size;
		    else
		    	throw new IllegalArgumentException("The parent node has two children already");
			size++;
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
