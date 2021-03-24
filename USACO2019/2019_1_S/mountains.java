import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class mountains {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("mountains.in"));
	    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("mountains.out")));
	    int n=Integer.parseInt(br.readLine());
	    mountain[] m=new mountain[n];
		
	    for(int i=0;i<n;i++) {
	    	StringTokenizer st=new StringTokenizer(br.readLine());
	    	m[i]=new mountain(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
	    }
//	    System.out.println(Arrays.toString(m));
	    
	    
	    Arrays.sort(m);
	    System.out.println(Arrays.toString(m));
	    ArrayList<mountain> yes=new ArrayList<>();
	    yes.add(new mountain());
	    boolean see;
	    for(int i=0;i<n;i++) {
	    	see=false;
//	    	System.out.print(i+"\t");
    		int tryLeft=m[i].x-m[i].y;
    		int tryRight=m[i].x+m[i].y;
	    	for(int j=0;j<yes.size();j++) {
	    		mountain mon=yes.get(j);
	    		int monLeft=mon.x-mon.y;
	    		int monRight=mon.x+mon.y;
	    		if(tryLeft<monLeft||tryRight>monRight) {
	    			see=true;
//	    			System.out.println(tryLeft+" "+tryRight+"    "+monLeft+" "+monRight);
//	    			System.out.println("See it");
	    		}
	    		else {
	    			see=false;
	    			break;
	    		}
	    	}
	    	if(see) {
	    		yes.add(m[i]);
	    	}
	    }
	    pw.print(yes.size()-1);
	    
		br.close();
		pw.close();
		
	}//main
	
	static class mountain implements Comparable<mountain>{
		int x;
		int y;
		public mountain() {
			x=0;
			y=0;
		}
		
		public mountain(int a,int b) {
			x=a;
			y=b;
		}
		public int compareTo(mountain m) {
			return m.y-y;
		}
		public String toString() {
			return x+" "+y;
		}
	}//class mountain
	
	

}//class