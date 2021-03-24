import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Planting {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("planting.in"));
	    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("planting.out")));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int n=Integer.parseInt(st.nextToken());
	    int[] arr=new int[n+1];
	    for(int i=0;i<n-1;i++){
	    	st=new StringTokenizer(br.readLine());
		    arr[Integer.parseInt(st.nextToken())]++;
		    arr[Integer.parseInt(st.nextToken())]++;
		    }
	    Arrays.sort(arr);
	    pw.print(arr[n]+1);
	    br.close();
	    pw.close();
		}
	}
