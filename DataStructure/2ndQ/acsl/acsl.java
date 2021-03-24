/*
Name: Emerald Liu
Division: Senior 5
Program: Contest 1
Program Description: Number Transformation
School: Ranney School
State: NJ
Grade: 12 or 11 or 10
Year 2019-2020
*/

package acsl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class acsl {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader br=new BufferedReader(new FileReader("contest1.txt"));
		for(int a=0;a<5;a++) {
		StringTokenizer s=new StringTokenizer(br.readLine());
        String str=s.nextToken();
        long n=Long.parseLong(str);
        int[] num=new int[str.length()];
        for(int i=0;i<num.length;i++)
            num[i]=Integer.parseInt(""+str.charAt(i));
        int l=num.length-Integer.parseInt(s.nextToken());
        for(int i=0;i<num.length;i++){
            if(i<l)
                num[i]+=num[l];
            else if(i>l)
                num[i]=Math.abs(num[i]-num[l]);
        }
        num[l]=cal(n);
        for(int i=0;i<num.length;i++)
            System.out.print(num[i]);
        System.out.println();
		}
        br.close();
    }
    public static int cal(long num){
        int cnt=0;
        int a=(int)Math.sqrt(num);
        for(int i=2;i<a;i++){
            if(num%i==0) cnt++;
            while(num%i==0) num/=i;
        }
        return cnt;
    }
}