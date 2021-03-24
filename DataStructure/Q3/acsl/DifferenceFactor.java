package acsl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DifferenceFactor {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader br=new BufferedReader(new FileReader("contest22.txt"));
		for(int a=0;a<5;a++) {
			StringTokenizer s1=new StringTokenizer(br.readLine());
			StringTokenizer s2=new StringTokenizer(br.readLine());
			String str1="";
			String str2="";
			while(s1.hasMoreTokens()) {
				str1+=s1.nextToken();
			}
			while(s2.hasMoreTokens()) {
				str2+=s2.nextToken();
			}
			//s1=new StringTokenizer(br.readLine());
			str1=deal(str1);
			str2=deal(str2);
			System.out.println(lcs(str1,str2));
			
		}
		//System.out.println(lcs("THEBIGBLACKBEARBITABIGBLACKBUG","THEBIGBLACKBUGBLED BLACKBLOOD"));
        //System.out.println(lcs("COMPLEMENTARYANGLEMEASURESSUMTO90DEGREES","THEMEASURESOFSUPPLEMENTARYANGLESADDTO180DEGREES"));
		//System.out.println(lcs("ATALEOFTWOCITIESWASPUBLISHEDBYDICKENSIN1859","IN1839,CHARLESDICKENSPUBLISHEDNICHOLASNICKLEBY"));
	}
   
	public static String deal(String s) {
		String str=s.toUpperCase();
		//System.out.println("strrr"+str);
		str=str.replace(".", "");
		//System.out.println(str);
		return str;
	}
    public static int lcs(String a, String b){
        //System.out.println(a+" "+b);
        if(a.length()== 0||b.length()==0)
            return 0;
        int[][] dp=new int[a.length()+1][b.length()+1];
        int res=0;
        int index1=-1;
        int index2=-1;
        for(int i=1; i<=a.length();i++){
            for(int j=1;j<=b.length();j++){
                if(a.charAt(i-1)==b.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                if(dp[i][j]==res&&res!=0){
                    if(a.substring(i-res,i).compareTo(a.substring(index1,index1+res))<0){
                        index1=i-res;
                        index2=j-res;
                    }
                }
                if(dp[i][j]>res){
                    res=dp[i][j];
                    index1=i-res;
                    index2=j-res;
                }
            }
        }
        if(res==0)
            return 0;
        return res+lcs(a.substring(0,index1),b.substring(0,index2))+
        		lcs(a.substring(index1+res,a.length()),b.substring(index2+res,b.length()));
    }


}
