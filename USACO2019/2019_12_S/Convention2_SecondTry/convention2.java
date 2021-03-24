package Convention2_SecondTry;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;



class SortbyValue implements Comparator<int[]>{
    public int compare(int[] a, int[] b)
    {
        return a[1] - b[1];
    }
}
class SortbyKey implements Comparator<int[]>{
    public int compare(int[] a, int[] b)
    {
        return a[0] - b[0];
    }
}

public class convention2 {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("convention2.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("convention2.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num=Integer.parseInt(st.nextToken());
		int curr=0;
		int max=-1;
		ArrayList<int[]> map=new ArrayList<int[]>();
		ArrayList<int[]> waiting=new ArrayList<int[]>();
		boolean flag=false;
		int j;
		int k;
		int l;
		for(j=0;j<num;j++){
			st = new StringTokenizer(br.readLine());
			k= Integer.parseInt(st.nextToken());
			l= Integer.parseInt(st.nextToken());;
			int[] temp={j,k,l};
			map.add(temp);
		}
		Collections.sort(map, new SortbyValue());

		for(int i=0;i<num;i++){
			if(waiting.size()==0&&map.size()!=0){
				int[] ent=map.get(0);
				int seniority=ent[0];
				int TArrive=ent[1];
				int TEating=ent[2];
				curr=TArrive+TEating;
				map.remove(0);
			}
			else if(waiting.size()!=0){
    		int[] ent3=waiting.get(0);
    		int t=ent3[1];
    		if(max<curr-t){
    			max=curr-t;
    		}

    		curr+=ent3[2];
    		waiting.remove(0);
		}
		if(map.size()!=0){
			int[] ent=map.get(0);
			int key=ent[0];
			int n=ent[1];
			int m=ent[2];
			while(n<curr){
				flag=true;
				ent=map.get(0);
				int[] temp={key,n,m};
				waiting.add(temp);
				map.remove(0);
				if(map.size()!=0){
					ent=map.get(0);
					key=ent[0];
					n=ent[1];
					m=ent[2];
				}
				else{
					break;
				}
			}
		}
      		if(flag){
      			Collections.sort(waiting, new SortbyKey());
      			flag=false;
      		}
		}

  		pw.print(max);
        pw.close();
        br.close();
	}
}
