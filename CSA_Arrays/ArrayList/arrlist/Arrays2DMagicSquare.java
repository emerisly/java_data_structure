package arrlist;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Arrays2DMagicSquare {
	
	static int[][] cube=new int[5][5];


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console=new Scanner(System.in);
		for(int i=0;i<cube.length;i++) {
			StringTokenizer st=new StringTokenizer(console.nextLine());
			for(int j=0;j<cube.length;j++) {
				cube[i][j]=Integer.parseInt(st.nextToken());
			}
		}

		boolean flag1=rowcol();
		boolean flag2=dig();
		
		
		
		if(flag1&&flag2){
			System.out.println("It is a magic cube.");
		}
		else {
			System.out.println("It is not a magic cube.");
		}
		
	}
	private static boolean rowcol() {
		for(int i=0;i<cube.length;i++) {
			
		}
		boolean flag=true;
		for(int i=0;i<3;i++) {
			int row=0;
			int col=0;
			for(int j=0;j<3;j++) {
				row+=cube[i][j];
				col+=cube[j][i];
			}
			if(row!=col) {
				flag=false;
			}
		}
		return flag;
		}
	
	private static boolean dig() {
		int j=2;
		int sum1=0;
		int sum2=0;
		boolean flag=true;
		for(int i=0;i<3;i++) {
			sum1+=cube[i][i];
			sum2+=cube[i][j];
			j--;
		}
		if(sum1!=sum2) {
			flag=false;
		}
		return flag;
	}

}
