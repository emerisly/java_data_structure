package stretch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class stretch {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("stretchi.txt"));
	    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("stretcho.txt")));
		StringTokenizer str=new StringTokenizer(br.readLine());
		int row=Integer.parseInt(str.nextToken());
		int col=Integer.parseInt(str.nextToken());
		int start=Integer.parseInt(str.nextToken());
		int num=Integer.parseInt(str.nextToken());
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(str.nextToken());
		}
		char[] check= {'A','B','C','D','E','A','B','C','D','E','A','B','C','D','E',
				'A','B','C','D','E','A','B','C','D','E','A','B','C','D','E',
				'A','B','C','D','E','A','B','C','D','E'};
		
		System.out.println(row+" "+col+" "+start+" "+num);
		//A-[r0][c3]
		//B-[r3][c1]
		//C-[r2][c2]
		//D-[r3][c2]
		//E-[r2][c3]
		
		String[] ans= {""};

		System.out.println("ans "+ans[0]);
		
		int a=checkPlace(start,check[0],col,row,arr,ans);
		System.out.println(a);
		int b=checkPlace(a+1,check[1],col,row,arr,ans);
		System.out.println(b);
		

	}
	
	
	//get answer
	public static void answer(String[] ans,int start, char[] check,int col,int row,int[] arr,int i) {
		int end=start;
			
			
		}
		

	//check if is inside the border and does not meet the block
	//return end
	public static int checkPlace(int start,char ch,int col,int row,int[] arr,String[] ans) {
		System.out.println("check"+ch);
		boolean flag=true;
		int end=checkBorder(start,ch,col,row,arr,ans);
		//check blocked
		for(int i=0;i<arr.length;i++) {
			if(end==arr[i]) {
				flag=false;
				break;
			}
		}
		if(!flag)
			end=-1;
		System.out.println("checkPlace "+end);
		return end;
	}
	
	//start=end+1
	//check if fit inside the border
	public static int checkBorder(int start,char ch,int col,int row,int[] arr,String[] ans) {
		int end=start;
		boolean flag=true;
		while(flag) {
		if(ch=='A') {
			if(start%col>col-2)
				flag=false;
			end+=2;
			System.out.println("ohA");
			break;
		}
		else if(ch=='B') {
			if(start<=2*col&&start>(row-2)*col)
				flag=false;
			end+=2*col;
			System.out.println("ohB");
			break;
		}
		else if(ch=='C') {
			if(start<col-1||(start<=1*col||start>(row-1)*col))
				flag=false;
			end+=2+2*col;
			System.out.println("ohC");
			break;
		}
		else if(ch=='D') {
			if(start<col-1||(start<=2*col||start>(row-2)*col))
				flag=false;
			end+=3+2*col;
			System.out.println("ohD");
			break;
		}
		else if(ch=='E') {
			if(start<col-2||(start<=1*col||start>(row-1)*col))
				flag=false;
			end+=2+3*col;
			System.out.println("ohE");
			break;
		}
		
	}
		if(!flag) {
			end=-1;
		}
		System.out.println("checkBorder "+end);
		return end;

}
}
