import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class perimeter {
	static int[] size= {0,0};
	static int[] peri= {0,0};
	static int n;
	static boolean[][] checked;
	static String[][] machine;
	
	public static void main(String[] arg) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("perimeter.in"));
	    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("perimeter.out")));
	    String str=br.readLine();
	    n=Integer.parseInt(str);
	    machine=new String[n][n];
	    for(int i=0;i<n;i++) {
	    	str=br.readLine();
	    	machine[i]=str.split("");
	    }
	    checked=new boolean[n][n];
	    findIce();
	    pw.print(size[0]+" "+peri[0]);
	    
	    br.close();
	    pw.close();
	}//main
	
	
	//In the 2D array,
	//Find Location of Ice + Count Size From that Location + Keep Bigger Size
	//Continue counting Space not checked
	public static void findIce() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(checked[i][j]==false&&checked[i][j]==false&&machine[i][j].equals("#")) {
					countSize(i,j);
					chooseBigger();
				}
			}
		}
	}
	
	//Size of Ice Cream
	public static void countSize(int row,int col) {
		if(row>=0&&row<n&&col>=0&&col<n) {
			if(machine[row][col].equals(".")) {
				peri[1]++;
			}
			if(checked[row][col]==false&&machine[row][col].equals("#")) {
				if(row==0||row==n-1)
					peri[1]++;
				if(col==0||col==n-1)
					peri[1]++;
				checked[row][col]=true;
				size[1]++;
				countSize(row,col+1);
				countSize(row,col-1);
				countSize(row+1,col);
				countSize(row-1,col);
			}
		}
	}
	
	public static void chooseBigger() {
		if(size[1]>size[0]) {
			size[0]=size[1];
			peri[0]=peri[1];
			size[1]=0;
			peri[1]=0;
		}
		if(size[1]==size[0]) {
			if(peri[1]<peri[0]) {
				peri[0]=peri[1];
			}
			size[1]=0;
			peri[1]=0;
		}
		if(size[1]<size[0]) {
			size[1]=0;
			peri[1]=0;
		}
	}
	
}