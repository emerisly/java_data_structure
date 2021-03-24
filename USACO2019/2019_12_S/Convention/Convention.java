package Convention;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Convention {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("convention.in"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("convention.out")));
		StringTokenizer line=new StringTokenizer(br.readLine());
		int cow=Integer.parseInt(line.nextToken());
		int bus=Integer.parseInt(line.nextToken());
		int hold=Integer.parseInt(line.nextToken());
//		System.out.println(cow+" "+bus+" "+hold);
		int[] arr=new int[cow];
		StringTokenizer arrToken=new StringTokenizer(br.readLine());
		for(int i=0;i<cow;i++) {
			arr[i]=Integer.parseInt(arrToken.nextToken());
		}
		Arrays.sort(arr);
//	    System.out.println(Arrays.toString(arr));
		int[] time=new int[bus];
		int count=0;
		for(int i=0;i<bus-hold+1;i++) {
			time[i]=arr[count+hold-1]-arr[count];
			count+=hold;
		}
		int last=hold*(bus-1);
		time[bus-1]=arr[cow-1]-arr[last];
//		System.out.println(Arrays.toString(time));
		Arrays.sort(time);
		System.out.println(time[bus-1]);
		pw.println(time[bus-1]);
		br.close();
		pw.close();
	}

}
