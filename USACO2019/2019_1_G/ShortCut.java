import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ShortCut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("mountains.in"));
	    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("mountains.out")));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int fields=Integer.parseInt(st.nextToken());
	    int routes=Integer.parseInt(st.nextToken());
	    int K=Integer.parseInt(st.nextToken());
	    int[] cows=new int[fields];
	    st=new StringTokenizer(br.readLine());
	    for(int i=0;i<fields;i++) {
	    	cows[i]=Integer.parseInt(st.nextToken());
	    }
	    int[][] graph=new int[fields][fields];
	    for(int i=0;i<routes;i++) {
	    	st=new StringTokenizer(br.readLine());
	    	int a=Integer.parseInt(st.nextToken());
	    	int b=Integer.parseInt(st.nextToken());
	    	int c=Integer.parseInt(st.nextToken());
	    	graph[a-1][b-1]=c;
	    	graph[b-1][a-1]=c;
	    }

	}

}
