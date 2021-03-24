package Test;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,20,30,40,50};
		int narr[]=new int[arr.length];
		int cnt=0;
		for(int i=arr.length-1;i>=0;i--) {
			narr[cnt]=arr[i];
			cnt++;
		}
		for(int i=0;i<narr.length;i++)
			System.out.print(narr[i]+" ");
	}

}
