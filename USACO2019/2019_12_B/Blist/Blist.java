package Blist;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Blist {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		BufferedReader br=new BufferedReader(new FileReader("blist.in"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
		int num=Integer.parseInt(br.readLine());
		System.out.println(num);
		int[] tS=new int[1000];
		int[] tE=new int[1000];
		int[] B=new int[1000];
		int[] totalB=new int[1000];
		for(int i=0;i<num;i++) {
			StringTokenizer line=new StringTokenizer(br.readLine());
			tS[i]=Integer.parseInt(line.nextToken());
			tE[i]=Integer.parseInt(line.nextToken());
			B[i]=Integer.parseInt(line.nextToken());
			for(int k=tS[i];k<tE[i];k++) {
				totalB[k]+=B[i];
			}
		}
		int max=0;
		for(int i=0;i<1000;i++) {
			max=Math.max(max, totalB[i]);
		}
		pw.println(max);
		
		br.close();
		pw.close();
	}

}
