package Convention_FinalTry;

import java.io.*;
import java.util.*;

/*
 * set time for leaving buses
 * check if have more buses
 * hold-- if do
 * find min of max
 */

class Convention {
	static int BusNum=0;
	  static int[] arr;
	  static int cows;
	  static int bus;
	  static int hold;
	  static int timeW;
	  public static boolean check(int c){
	    if(c<cows){
	    int i=hold;
	    //last cow - center cow
	    while(((c+hold-1<cows)?arr[c+i-1]:arr[cows-1])-arr[c]>timeW){
	      i--;
	    }
	    BusNum++;
	    if(BusNum>bus){
	      return true;
	    }
	    return check(c+i);
	  }
	    return false;
	  }

	  public static int binarysearch(int a, int b){
	    timeW=(int)Math.floor((a+b)/2);

	    if(check(0)){
	      if(a==b){
	        return a;
	      }
	      else{
	        BusNum=0;
	        return binarysearch(timeW+1,b);
	      }
	    }
	    
	    else{
	      if(a==b){
	        return a;
	      }
	      else{
	        BusNum=0;
	        return binarysearch(a,timeW);
	      }
	    }
	  }
	  public static void main (String [] args) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader("convention.in"));
	    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("convention.out")));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    cows=Integer.parseInt(st.nextToken());
	    bus=Integer.parseInt(st.nextToken());
	    hold=Integer.parseInt(st.nextToken());
	    arr= new int[cows];
	    st = new StringTokenizer(br.readLine());
	    for(int i=0;i<cows;i++){
	      arr[i]=Integer.parseInt(st.nextToken());;
	    }
	    Arrays.sort(arr);


	    ArrayList<Integer> times=new ArrayList<Integer>();
	    for(int i=hold-1;i<cows;i++){
	      times.add(arr[i]-arr[i-hold+1]);
	    }

	    Integer max=times.get(0);
	    for(int j=1;j<times.size();j++){
	      if(times.get(j)>max){
	        max=times.get(j);
	      }
	    }
	    pw.print(binarysearch(0,max));
	    pw.close();

	  }
	}
