package Tryout;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class NumberSpiral1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		OutputStream out=new BufferedOutputStream(System.out);
		
		long howMany=Integer.parseInt(console.readLine());
		for(long i=0;i<howMany;i++) {
			StringTokenizer str=new StringTokenizer(console.readLine());
			long x=Integer.parseInt(str.nextToken());//row
			long y=Integer.parseInt(str.nextToken());//column
			
//			out.write(x+" "+y+"\n").getBytes());
//			out.flush();
			long ans=0;
			
			if(y>x) {
				if(y%2==1) {
					ans=(long)y*y;
					ans=ans-x+1;
				}
				else {
					ans=(long)(y-1)*(y-1);
					ans=ans+x;
				}	
			}
			else {
				if(x%2==0) {
					ans=(long)x*x;
					ans=ans-y+1;
				}
				else {
					ans=(long)(x-1)*(x-1);
					ans=ans+y;
				}	
			}
			
			out.write((ans+"\n").getBytes());
			out.flush();
		}//end total for loop
		

	}

}
