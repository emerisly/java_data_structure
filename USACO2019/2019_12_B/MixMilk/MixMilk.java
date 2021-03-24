package MixMilk;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MixMilk {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		BufferedReader br=new BufferedReader(new FileReader("mixmilk.in"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
		int[] Have=new int[3];
		int[] Can=new int[3];
		for(int i=0;i<3;i++) {
			StringTokenizer line=new StringTokenizer(br.readLine());
			Can[i]=Integer.parseInt(line.nextToken());
			Have[i]=Integer.parseInt(line.nextToken());
		}
		for(int i=0;i<100;i++) {
			int a=i%3;//which milk
			int b=(i+1)%3;//next milk
			//if fit
			if(Have[a]+Have[b]<=Can[b]) {
				Have[b]=Have[a]+Have[b];
				Have[a]=0;
			}
			//if does not fit
			else {
				Have[a]=Have[a]-(Can[b]-Have[b]);
				Have[b]=Can[b];
			}
		}
		for(int i=0;i<3;i++) {
			pw.println(Have[i]);
		}
		br.close();
		pw.close();
	}

}
