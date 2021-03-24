package BackForth;
import java.io.*;
import java.util.*;

public class BackForth {

	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		BufferedReader br=new BufferedReader(new FileReader("backforth.in"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
		ArrayList<Integer> B1=new ArrayList<Integer>();
		ArrayList<Integer> B2=new ArrayList<Integer>();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<10;i++) {
			B1.add(Integer.parseInt(st.nextToken()));
		}
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<10;i++) {
			B2.add(Integer.parseInt(st.nextToken()));
		}
		day(B1,B2,0);
		pw.print(Bt.size());
		br.close();
		pw.close();
	}

	static ArrayList<Integer> Bt=new ArrayList<Integer>();
	
	public static void day(ArrayList<Integer>B1,ArrayList<Integer>B2,int counter) {
		if(counter==4) {
			Integer sum=0;
			for(int i=0;i<B1.size();i++) {
				sum+=B1.get(i);
			}
			if(!Bt.contains(sum)) {
				Bt.add(sum);
			}
		}
		else if(counter%2==0) {
			int ct=counter+1;
			for(int i=0;i<B1.size();i++) {
				ArrayList<Integer> TempB1=(ArrayList<Integer>)B1.clone();
				ArrayList<Integer> TempB2=(ArrayList<Integer>)B2.clone();
				TempB2.add(TempB1.remove(i));
				day(TempB1,TempB2,ct);
			}
		}
		else {
			int ct=counter+1;
			for(int i=0;i<B2.size();i++) {
				ArrayList<Integer> TempB1=(ArrayList<Integer>)B1.clone();
				ArrayList<Integer> TempB2=(ArrayList<Integer>)B2.clone();
				TempB1.add(TempB2.remove(i));
				day(TempB1,TempB2,ct);
			}
		}
	}

}
