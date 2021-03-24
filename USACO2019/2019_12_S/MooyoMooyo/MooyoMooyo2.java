package MooyoMooyo;

import java.io.*;
import java.util.*;

/*
 * Emerald Liu
 * 1.Find if characters connected with DP
 * 2.SetZero
 * 3.Fall
 */
//set flag so won't check again if already include


class MooyoMooyo2 {
	static ArrayList<String>[] column;
	static String character;
	static int num;
	static boolean[][] flag;
	
	//method to test if connected
	public static int connected(int x,int y){
		if(!column[x].get(y).equals(character)){
			return 0;
		}
		else if(!flag[x][y]){
			flag[x][y]=true;
			return 1+(x-1>=0?connected(x-1,y):0)+(x+1<10?connected(x+1,y):0)
					+(y-1>=0?connected(x,y-1):0)+(y+1<num?connected(x,y+1):0);
		}
		else {
		return 0;
		}
	}

	//method to fall
	public static void fall(){
		for(int i=0;i<10;i++){
			int temp=num;
			for(int k=0;k<temp;k++){
				if(column[i].get(k).equals("0")){
					column[i].add("0");
					column[i].remove(k);
					k--;
					temp--;
				}
			}
		}
	}
	
	
	public static void main (String [] args) throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("mooyomooyoi.txt"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mooyomooyoo.txt")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		num=Integer.parseInt(st.nextToken());
		flag=new boolean[10][num];
		int min=Integer.parseInt(st.nextToken());
		column=(ArrayList<String>[])new ArrayList[10];
		for(int j=0;j<10;j++){
			column[j]=new ArrayList<String>();
		}
		for(int i=0;i<num;i++){
			st = new StringTokenizer(br.readLine());
			String[] arr=st.nextToken().split("");
			for(int j=0;j<10;j++){
				column[j].add(0,arr[j]);
			}
		}
		
		//see if there's more characters to delete
		boolean test=true;
		while(test){
			test=false;
			for(int i=0;i<10;i++){
				for(int j=0;j<num;j++){
					character=column[i].get(j);
					if(character!="0"&&connected(i,j)>=min){
							test=true;
							for(int k=0;k<10;k++){
								for(int n=0;n<num;n++){
									if(flag[k][n]==true){
										column[k].set(n,"0");
									}
								}
							}
						for(int k=0;k<10;k++){
							for(int n=0;n<num;n++)
								flag[k][n]=false;
							}
						}
					}
				}
			fall();
			}
			
			
		//print
		for(int i=num-1;i>=0;i--){
			String sum="";
			for(int j=0;j<10;j++){
				sum+=column[j].get(i);
			}
			pw.println(sum);
		}
		pw.close();
		br.close();
		
		
		
	}
}
