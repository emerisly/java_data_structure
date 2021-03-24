package Convention2_FinalTry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
 * Emerald Liu
 * check every possible way
 * Seniority!
 * check if any cow waiting
 * max the maximum time
 * 
 */
//use BinarySearch
//BinarySearch ob = new BinarySearch(); 
//int result = ob.binarySearch(arr, 0, n - 1, x);


class ArriveTime implements Comparator<int[]>{
    public int compare(int[] a, int[] b){
        return a[1]-b[1];
    }
}
class Age implements Comparator<int[]>{
    public int compare(int[] a, int[] b){
        return a[0]-b[0];
    }
}

public class Convention2 {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("convention2.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("convention2.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num=Integer.parseInt(st.nextToken());
/*
 * 		cow[] line=new cow[num];
		for(int i=0;i<num;i++) {
			st=new StringTokenizer(br.readLine());
			line[i]=new cow(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),i+1);
		}
		Arrays.sort(line, new Comparator<cow>() {
			public int compare(cow a, cow b) {
				return a.arrive-b.arrive;
			}
		});
 */
		int time=0;
		int o=-1;
		ArrayList<int[]> cowList=new ArrayList<int[]>();
		ArrayList<int[]> waiting=new ArrayList<int[]>();
		int j,k,l;
		boolean flag=false;
		for(j=0;j<num;j++){
			st = new StringTokenizer(br.readLine());
			k= Integer.parseInt(st.nextToken());
			l= Integer.parseInt(st.nextToken());;
			int[] temp={j,k,l};
			cowList.add(temp);
		}
		Collections.sort(cowList, new ArriveTime());
		
		for(int i=0;i<num;i++){
			if(waiting.size()==0&&cowList.size()!=0){
				int[] ent=cowList.get(0);
				int timeA=ent[1];
				int timeE=ent[2];
				time=timeA+timeE;
				cowList.remove(0);
			}
			else if(waiting.size()!=0){
    		int[] cow1=waiting.get(0);
    		int t=cow1[1];
    		if(o<time-t){
    			o=time-t;
    		}

    		time+=cow1[2];
    		waiting.remove(0);
		}
		if(cowList.size()!=0){
			int[] cows=cowList.get(0);
			int key=cows[0];
			int n=cows[1];
			int m=cows[2];
			while(n<time){
				flag=true;
				cows=cowList.get(0);
				int[] temp={key,n,m};
				waiting.add(temp);
				cowList.remove(0);
				if(cowList.size()!=0){
					cows=cowList.get(0);
					key=cows[0];
					n=cows[1];
					m=cows[2];
				}
				else{
					break;
				}
			}
		}
      		if(flag){
      			Collections.sort(waiting, new Age());
      			flag=false;
      		}
		}
		//System.out.println(o);
  		pw.print(o);
        pw.close();
        br.close();
	}
}
