import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Walk {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("walk.in"));
	    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("walk.out")));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int N,K;
	    N=Integer.parseInt(st.nextToken());
	    K=Integer.parseInt(st.nextToken());
	    pw.print(2019201997-K*84-N*48);
	}
}
