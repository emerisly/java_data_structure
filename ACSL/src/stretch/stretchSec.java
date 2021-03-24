package stretch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class stretchSec {

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

	}

}
