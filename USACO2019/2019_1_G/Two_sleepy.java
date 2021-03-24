import java.io.*;
import java.util.*;

class Two_sleepy {
  static ArrayList<Integer> order;
  public static int search(int curr, int a,int b){
    int mid=(int)Math.floor((a+b)/2);
    if(a==b-1){
      if(order.get(a)>curr)
        return a;
      else
        return b;
    }
    if(order.get(mid)>curr)
      return search(curr,a,mid);
    else if(order.get(mid)<curr)
      return search(curr,mid,b);
    else
    	return 0;
  }

  public static int enterorder(int a){
    int position=search(a,0,order.size());
    order.add(position,a);
    return position;
  }

  public static void main (String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("sleepy.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sleepyo.txt")));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N=Integer.parseInt(st.nextToken());
    int[] disorder=new int[N];
    order=new ArrayList<>();
    st=new StringTokenizer(br.readLine());
    for(int i=0;i<N;i++){
      disorder[i]=Integer.parseInt(st.nextToken());
    }
    order.add(0,disorder[N-1]);
    for(int i=N-2;i>=0;i--){
      if(disorder[i]<disorder[i+1])
        order.add(0,disorder[i]);
      else
        break;
    }
    int S=order.size();
    for(int i=0;i<N-S;i++){
      int J=enterorder(disorder[i]);
      out.print(J+N-(int)order.size()+" ");
    }
      out.close();
  }
}