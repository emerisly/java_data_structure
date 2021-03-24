package LinearSearch;


public class LinearSearch {
	public static void main(String[] args) {
		int[] a={89,56,76,34,87,23,87,34,76,87};
		int sum=0;
		double avg=0;
		
		for(int i=0;i<1000;i++) {
			int random=(int)(Math.random()*101);
			int index=Search(a,random);
			if(index==-1) 
			{	index=a.length;
				sum=sum+a.length;
			}
			else {
				sum+=index+1;
			}	
		}//end for
		avg=sum/1000.0;
		System.out.println(avg);
		
	}//ends main
	
	public static int Search(int[] array, int searchValue) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==searchValue)
				return i;
		}
		return -1;
	}//ends method
}//ends class
