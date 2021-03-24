package Bronze;

import java.io.*;
import java.util.*;
//import java.io.InputStreamReader;

public class B201701_BlockedBillboard {
	static public void main(String args[]) throws IOException {
		
		//get position of all points
//		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br=new BufferedReader(new FileReader("billboard.in"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		StringTokenizer board1=new StringTokenizer(br.readLine());
		StringTokenizer board2=new StringTokenizer(br.readLine());
		StringTokenizer truck=new StringTokenizer(br.readLine());
		int x[]=new int[5];
		int y[]=new int[5];
		int z[]=new int[5];
		for(int i=1;i<5;i++) {
			x[i]=Integer.parseInt(board1.nextToken());
			y[i]=Integer.parseInt(board2.nextToken());
			z[i]=Integer.parseInt(truck.nextToken());
		}
		
		//calculate totalArea of the boards
		int totalArea=(x[3]-x[1])*(x[4]-x[2])+(y[3]-y[1])*(y[4]-y[2]);
		
		//position of the blocked area
		int a[]=new int[5];
		int b[]=new int[5];
		
		//a[]
		if(z[1]<x[3]&&z[3]>x[1]) {
			a[1]=Math.max(x[1], z[1]);
			a[3]=Math.min(x[3], z[3]);
		}else {
			a[1]=0;
			a[3]=0;
		}
		if(z[2]<x[4]&&z[4]>x[2]) {
			a[2]=Math.max(x[2], z[2]);
			a[4]=Math.min(x[4], z[4]);
		}else {
			a[2]=0;
			a[4]=0;
		}
		
		//b[]
		if(z[3]>y[1]&&z[1]<y[3]) {
			b[1]=Math.min(y[3], z[3]);
			b[3]=Math.max(y[1], z[1]);
		}else {
			b[1]=0;
			b[3]=0;
		}
		
		if(z[2]<y[4]&&z[4]>y[2]) {
			b[2]=Math.max(y[2], z[2]);
			b[4]=Math.min(y[4], z[4]);
		}else {
			b[2]=0;
			b[4]=0;
		}

		
		int block1=(a[3]-a[1])*(a[4]-a[2]);
		int block2=(b[3]-b[1])*(b[2]-b[4]);
		int blockT=block1+block2;

//		System.out.println("block1: "+printArr(a));
//		System.out.println("block2: "+printArr(b));
//		System.out.println("block2: "+b[3]+" "+b[2]+" "+b[1]+" "+b[4]);
		
		int visible=totalArea-blockT;
		
//		System.out.println("totalArea:"+totalArea+" \n"+"blockArea1:"+block1+" BlockArea2:"+block2);
		pw.println(visible);
		pw.close();
		br.close();
	}
	
/*	public static String printArr(int arr[]) {
		String str="";
		for(int i=1;i<arr.length;i++) {
			str=str+arr[i]+" ";
		}
		return str;
		}
*/
}
