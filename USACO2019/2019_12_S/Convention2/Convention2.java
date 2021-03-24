package Convention2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Convention2 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		BufferedReader br=new BufferedReader(new FileReader("convention2.in"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("convention2.out")));
		int num=Integer.parseInt(br.readLine());
//		System.out.println(cow);
		int[] cowArr=new int[num];
		int[] timeArr=new int[num];
		for(int i=0;i<num;i++) {
			StringTokenizer line=new StringTokenizer(br.readLine());
			cowArr[i]=Integer.parseInt(line.nextToken());
			timeArr[i]=Integer.parseInt(line.nextToken());
		}
		
		br.close();
		pw.close();
	}

}
