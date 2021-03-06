package slidingPuzzle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class slidingPuzzle {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//System.out.println();
		BufferedReader br=new BufferedReader(new FileReader("slidingPuzzleIn.txt"));
		//PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("slidingPuzzleOut.txt")));
		int a,b;
		int num[]=new int[30];
		for(int q=1;q<=10;q++) {
			StringTokenizer line=new StringTokenizer(br.readLine());
			a=Integer.parseInt(line.nextToken());
			b=Integer.parseInt(line.nextToken());
			int[][] arr=new int[a][a];
			int n=0;
			for(int i=0;i<a;i++) {
				for(int j=0;j<a;j++) {
					n++;
					arr[i][j]=n;
					if(n==b&&(b!=a*a)) {
						arr[i][j]=0;
						if(a-j>1) {
							j++;
						}
						else {
							i++;
							j=0;
						}
						arr[i][j]=n;
					}
					if(b==a*a) {
						arr[a-1][a-1]=0;
					}
				}
			}
			
			//printArray(arr);
			
			int tot=0;
			while(line.hasMoreTokens()) {
				num[tot]=Integer.parseInt(line.nextToken());
				tot++;
			}
			
			
			/*******/
			for(int k=0;k<tot;k++) {
				//System.out.println();
				//System.out.println(k+1+":****"+num[k]+"***");
				moveNumber(arr,num[k]);
			}
			
			/******/
			
			
			int ans=findPlace(arr,0);
			System.out.println(q+". "+ans);
			//System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANS  "+ans);
			//System.out.println();System.out.println();System.out.println();System.out.println();
			
			
		}

		br.close();
	}

	public static void printArray(int[][] arr) {

		System.out.println();
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	public static int findPlace(int arr[][], int num) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==num) {
					//System.out.println("findPlace "+num+": "+i+" "+j);
					return i*arr.length+j+1;
				}
			}
		}
		return -1;
	}
	
	public static void moveNumber(int arr[][], int num) {
		int p0=findPlace(arr,0);
		int p1=findPlace(arr,num);
		//int up=0,down=0,right=0,left=0;
		int l0=(p0-1)/arr.length;
		int l1=(p1-1)/arr.length;
		int c0=p0%arr.length-1;
		if(c0==-1) {
			c0=arr.length-1;
		}
		//int c1=p1%arr.length-1;
		if(p0<p1) {
			if(l0==l1) {
				//left=l1-l0;
				//System.out.println("L");
				//System.out.println("move"+dfsLeft(arr,l0,c0,num));
				dfsLeft(arr,l0,c0,num);
			}
			else {
				//System.out.println(l0+" "+l1+"\nU");
				//up=(l1-l0)/arr.length;
				//System.out.println(p0+" "+arr.length);
				//System.out.println(l0+" "+c0);
				//System.out.println("move"+dfsUp(arr,l0,c0,num));
				dfsUp(arr,l0,c0,num);
			}
		}
		else {
			if(l0==l1) {
				//System.out.println("R");
				//right=l0-l1;
				//System.out.println("move"+dfsRight(arr,l0,c0,num));
				dfsRight(arr,l0,c0,num);
			}
			else {
				//System.out.println("D");
				//down=(l0-l1)/arr.length;
				//System.out.println("move"+dfsDown(arr,l0,c0,num));
				dfsDown(arr,l0,c0,num);
			}
		}
		//printArray(arr);
		
		
	}
	
	public static int dfsUp(int arr[][],int r0,int c0,int num) {
		if(arr[r0][c0]==num) {
			arr[r0][c0]=0;
			return 0;
		}
		arr[r0][c0]=arr[r0+1][c0];
		//System.out.println("right now "+r0+" "+c0);
		return 1+dfsUp(arr,r0+1,c0,num);
	}
	
	public static int dfsDown(int arr[][],int r0,int c0,int num) {
		if(arr[r0][c0]==num) {
			arr[r0][c0]=0;
			return 0;
		}
		arr[r0][c0]=arr[r0-1][c0];
		return 1+dfsDown(arr,r0-1,c0,num);
	}
	
	public static int dfsRight(int arr[][],int r0,int c0,int num) {
		if(arr[r0][c0]==num) {
			arr[r0][c0]=0;
			return 0;
		}
		arr[r0][c0]=arr[r0][c0-1];
		return 1+dfsRight(arr,r0,c0-1,num);
	}
	
	public static int dfsLeft(int arr[][],int r0,int c0,int num) {
		if(arr[r0][c0]==num) {
			arr[r0][c0]=0;
			return 0;
		}
		arr[r0][c0]=arr[r0][c0+1];
		return 1+dfsLeft(arr,r0,c0+1,num);
	}
	

}
