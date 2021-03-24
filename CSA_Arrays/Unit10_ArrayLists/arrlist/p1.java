package arrlist;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][]arr= {{70,80,90,0},{75,85,95,0},{90,100,85,0},{60,90,80,0}};
			for(int r=0;r<arr.length;r++) {
				int sum=0;
				for(int c=0;c<arr[r].length;c++) {
					System.out.print(arr[r][c]+" ");
					sum+=arr[r][c];
				}//end inner loop
				System.out.println();
				System.out.println("avg: "+sum/arr[r].length);
			

		}//end outer loop
	}//end main

}//end class
