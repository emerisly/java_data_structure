package Convention_SecondTry;

import java.io.*;
import java.util.*;

class Convention {
	static int NB=0;
	  static int[] arr;
	  static int cows;
	  static int bus;
	  static int cap;
	  static int waittime;
	  public static boolean check(int cur){
	    if(cur<cows){
	    int i=cap;
	    while(((cur+cap-1<cows)?arr[cur+i-1]:arr[cows-1])-arr[cur]>waittime){
	      i--;
	    }
	    NB++;
	    if(NB>bus){
	      return true;
	    }
	    return check(cur+i);
	  }
	    return false;
	  }

	  public static int binarysearch(int a, int b){
	    waittime=(int)Math.floor((a+b)/2);

	    if(check(0)){
	      if(a==b){
	        return a;
	      }
	      else{
	        NB=0;
	        return binarysearch(waittime+1,b);
	      }
	    }
	    else{
	      if(a==b){
	        return a;
	      }
	      else{
	        NB=0;
	        return binarysearch(a,waittime);
	      }
	    }
	  }
	  public static void main (String [] args) throws IOException {
	    // Use BufferedReader rather than RandomAccessFile; it's much faster
	    BufferedReader br = new BufferedReader(new FileReader("convention.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("convention.out")));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    cows=Integer.parseInt(st.nextToken());
	    bus=Integer.parseInt(st.nextToken());
	    cap=Integer.parseInt(st.nextToken());
	    arr= new int[cows];
	    st = new StringTokenizer(br.readLine());
	    for(int i=0;i<cows;i++){
	      arr[i]=Integer.parseInt(st.nextToken());;
	    }
	    Arrays.sort(arr);

	  //  System.out.println(" ");

	    ArrayList<Integer> times=new ArrayList<Integer>();
	    int i;
	    for( i=cap-1;i<cows;i++){
	      times.add(arr[i]-arr[i-cap+1]);
	    }

	    Integer max=times.get(0);
	    for(int j=1;j<times.size();j++){
	      if(times.get(j)>max){
	        max=times.get(j);
	      }
	    }
	    out.print(binarysearch(0,max));
	    out.close();

	  }
	}
