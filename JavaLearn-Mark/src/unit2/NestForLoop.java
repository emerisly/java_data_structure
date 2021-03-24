package unit2;

public class NestForLoop {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		
		/*
		 * row 0 - 20!			20-row*4 = 20
		 * row 1 - 2\ 16! 2/	20-row*4 = 20-4=16
		 * row 2 - 4\ 12 4/		20-row*4 = 12
		 */
		for(int row=0;row<6;row++) {
			for(int j=0;j<row*2;j++) {
				System.out.print("\\");
			}
			
			for(int i=0;i<22-row*4;i++) {
				System.out.print("!");
			}
			for(int k=0;k<row*2;k++) {
				System.out.print("/");
			}
			System.out.println();
		}
		
		a();
		a('*');

	}
	//end of main method
	
	//Student.age
	
	public static void a() {
		System.out.println("!!!!!!");
	}
	
	public static void a(char c) {
		System.out.println(c);
	}

}
