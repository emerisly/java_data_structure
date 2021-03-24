package arrays;

public class testGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[][]{
			{80,70,40,100,0},
			{90,65,86,77,0},
			{82,40,100,99,0},
			{0,0,0,0,0}
		};
		String[] nameArr= {"Jim","Bill","Sam"};
		for(int r=0;r<arr.length-1;r++) {
			System.out.print(nameArr[r]+": ");
			for(int c=0;c<arr[r].length-1;c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int r=0;r<arr.length-1;r++) {
			System.out.print(nameArr[r]+": ");
			for(int c=0;c<arr[r].length-1;c++) {
				arr[r][c]+=5;
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int[] r:arr) {
			for(int n:r) {
				System.out.print(n+" ");
			}
		}
		

	}

}
