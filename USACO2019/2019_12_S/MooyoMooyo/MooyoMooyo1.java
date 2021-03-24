package MooyoMooyo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MooyoMooyo1 {
 
	public static void main(String[] args) throws FileNotFoundException, IOException{
		BufferedReader br=new BufferedReader(new FileReader("mooyomooyoi.txt"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("mooyomooyo.txt")));
		StringTokenizer line=new StringTokenizer(br.readLine());
		int num=Integer.parseInt(line.nextToken());
		int K=Integer.parseInt(line.nextToken());
		int[][] arr=new int[num][10];
		for(int i=0;i<num;i++) {
			String[] row=br.readLine().split("");
			for(int j=0;j<10;j++) {
				arr[i][j]=Integer.parseInt(row[j]);
			}
		}
//		System.out.println(Arrays.deepToString(arr));
	}

}
