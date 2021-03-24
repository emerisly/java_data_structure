package Tryout;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class NumberSpiral {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		OutputStream out=new BufferedOutputStream(System.out);
		
		long howMany=Integer.parseInt(console.readLine());
		for(long i=0;i<howMany;i++) {
			long num[]=new long[2];
			StringTokenizer str=new StringTokenizer(console.readLine());
			num[0]=Integer.parseInt(str.nextToken());//row
			num[1]=Integer.parseInt(str.nextToken());//column
			
//			out.write((num[0]+" "+num[1]+"\n").getBytes());
//			out.flush();
			long ans=0;
			
			if(num[1]>num[0]) {
				if(num[1]%2==1) {
					ans=(long)Math.pow(num[1], 2);
					ans=ans-num[0]+1;
				}
				else {
					ans=(long)Math.pow((num[1]-1), 2);
					ans=ans+num[0];
				}	
			}
			else {
				if(num[0]%2==0) {
					ans=(long)Math.pow(num[0],2);
					ans=ans-num[1]+1;
				}
				else {
					ans=(long)Math.pow((num[0]-1), 2);
					ans=ans+num[1];
				}	
			}
			
			out.write((ans+"\n").getBytes());
			out.flush();
		}//end total for loop
		

	}

}
