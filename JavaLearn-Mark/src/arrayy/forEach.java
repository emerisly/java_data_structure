package arrayy;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] array = {1,2,3,4,5};
	
	for(int number : array) {
		System.out.print(number+" ");
	}
	
	System.out.println();
	
	for(int i=0;i<array.length;i++) {
		int number = array[i];
		System.out.print(number+" ");
	}
	
	System.out.println();
	System.out.println();
	
	
	
	int[][] twoDarray = {{1,2,3,4},{1,2,3,4}};
	
	for(int i=0;i<twoDarray.length;i++) {
		for(int j=0;j<twoDarray[0].length;j++) {
			int number = twoDarray[i][j];
			System.out.print(number+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int[] row : twoDarray) {
		for(int number : row) {
			System.out.print(number+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	

}
}
