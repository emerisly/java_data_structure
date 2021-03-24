package arrays;

public class testGrade2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] arr=new double[][]{
			{80,70,40,100,0},
			{90,65,86,77,0},
			{82,40,100,99,0},
			{0,0,0,0,0}
		};
		String[] nameArr= {"Jim","Bill","Sam","Avg"};
		for(int r=0;r<arr.length;r++) {
			double sum=0;
			for(int c=0;c<arr[r].length-1;c++) {
				sum+=arr[r][c];
			}
			arr[r][arr[r].length-1]=((int)(sum/4*100))/100.0;
		}
		
		int n=0;
		for(int c=0;c<arr[n].length;c++) {
			double sum=0;
			for(int r=0;r<arr.length-1;r++) {
				sum+=arr[r][c];
			}
			arr[arr.length-1][c]=((int)(sum/3*100))/100.0;
		}
		
		for(int r=0;r<arr.length;r++) {
			System.out.print(nameArr[r]+":\t");
			for(int c=0;c<arr[r].length;c++) {
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
	}

}
