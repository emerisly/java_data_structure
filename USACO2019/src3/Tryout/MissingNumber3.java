package Tryout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MissingNumber3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		long howMany=Integer.parseInt(st.nextToken());
		long sum=(1+howMany)*howMany/2;
		StringTokenizer st2=new StringTokenizer(br.readLine());
		long arr[]=new long[(int)howMany-1];
		for(int i=0;i<howMany-1;i++)
			arr[i]=Integer.parseInt(st2.nextToken());
		for(int i=0;i<howMany-1;i++) 
			sum-=arr[i]; 
		System.out.println(sum);
	}

}
