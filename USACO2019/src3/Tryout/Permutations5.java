package Tryout;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Permutations5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader console1=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(console1.readLine());
		
		OutputStream out=new BufferedOutputStream(System.out);
		
		int left=num%4;

		
		if(num>3) {
			if(left==0) {
				for(int e=4;e<=num;e+=4) {
					out.write(((e-2)+" "+e+" "+(e-3)+" "+(e-1)+" ").getBytes());
					out.flush();
				}
			}
			else{
				out.write((num+" ").getBytes());
				if(left==3) {
					out.write(((num-2)+" ").getBytes());
					out.flush();
				}
				for(int e=4;e<=num;e+=4) {
					out.write(((e-2)+" "+e+" "+(e-3)+" "+(e-1)+" ").getBytes());
					out.flush();
				}
				if(left>1) {
					out.write((num-1+" ").getBytes());
					out.flush();
					}
			}

		}
			else if(num==1) {
				out.write(("1").getBytes());
				out.flush();
			}
			else {
				out.write(("NO SOLUTION").getBytes());
				out.flush();
				
			}
		}
	}


