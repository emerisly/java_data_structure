package Diff;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Diff {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("diffi.txt"));
	    for(int num=1;num<=5;num++) {
	    String str1=br.readLine();
	    StringTokenizer st1=new StringTokenizer(str1);
	    String str2=br.readLine();
	    StringTokenizer st2=new StringTokenizer(str2);
	    String empty=br.readLine();
	    
	    //System.out.println(str1);
	    //System.out.println(str2);
	    
	    ArrayList<String> list1=new ArrayList<String>();
	    int i=0;
	    while(st1.hasMoreTokens()) {
	    	list1.add(i, st1.nextToken());
	    	i++;
	    }
	    ArrayList<String> list2=new ArrayList<String>();
	    int j=0;
	    while(st2.hasMoreTokens()) {
	    	list2.add(j, st2.nextToken());
	    	j++;
	    }
	    

	    //System.out.println(list1);
	    //System.out.println(list2);
	    
	    
	    String ans1=firstAlgo(list1,str2);  
	    String ans2=firstAlgo(list2,str1);
	    
	    String finAns=secondAlgo(ans1,ans2);
		
	    
	    if(finAns.length()!=0) {
	    	System.out.println(num+". "+finAns);
	    }
	    else {
	    	System.out.println(num+". NONE");
	    }
	    
	    
	    

	}
	}
	
	public static String firstAlgo(ArrayList<String> list,String str) {
		String ans="";
		for(int i=0;i<list.size();i++) {
			if(str.contains(list.get(i))) {
				ans=ans+list.get(i)+" ";
			}
		}
		
		return ans;
	}
	
	public static String secondAlgo(String str1, String str2) {
		String ans="";
		int index1=0;
		while(index1<str1.length()-1&&str2.length()>0) {
			if(str2.contains(""+str1.charAt(index1))&&str1.charAt(index1)!=' ') {
				int substr=str2.indexOf(str1.charAt(index1));
				//System.out.println(str1.charAt(index1));
				str2=str2.substring(substr+1);
				//System.out.println(str2);
				ans+=str1.charAt(index1);
			}
			index1++;
		}
		
		
		return ans;
	}

}
