import java.io.*;
import java.util.*;

class pair{
	  int area;
	  boolean[][] mask2;
	  pair(int area,int n){
	    this.area=area;
	    mask2=new boolean[n][n];
	  }
	}

public class peri {
	 static boolean[][] mask;
	  static boolean[][] eternalmask;

	  static ArrayList<String>[] list;
	  static int lines;
	  static pair temp;
	  public static int connected(int x,int y){

	    if(!list[x].get(y).equals("#")){
	      return 0;
	    }
	    else if(eternalmask[x][y]==false){//haven't checked
	      mask[x][y]=true;//set it to checked state
	      eternalmask[x][y]=true;//set it to checked state

	      return 1+ (x-1>=0?connected(x-1,y):0) + (x+1<lines?connected(x+1,y):0) + (y-1>=0?connected(x, y-1):0 )+ (y+1<lines? connected(x, y+1):0);
	    }
	    else{
	      return 0;//if checked return 0
	    }
	  }
	  
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("perimeteri.txt"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("perimetero.txt")));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    lines=Integer.parseInt(st.nextToken());
	    mask=new boolean[lines][lines];
	    eternalmask=new boolean[lines][lines];
	    String color;
	    ArrayList<pair> res=new ArrayList<>();
	    list=(ArrayList<String>[])new ArrayList[lines];
	    for(int j=0;j<lines;j++){
	      list[j]=new ArrayList<String>();
	    }//initialize the ArrayLists
	    for(int i=0;i<lines;i++){
	      st = new StringTokenizer(br.readLine());
	      String[] arr=st.nextToken().split("");
	      for(int j=0;j<lines;j++){
	        list[j].add(0,arr[j]);
	      }
	    }//store all of them
	      for(int i=0;i<lines;i++){
	        for(int j=0;j<lines;j++){
	          if(!eternalmask[i][j]){
	          color=list[i].get(j);
	            if(color!="."){
	              temp=new pair(connected(i,j),lines);
	              for(int k=0;k<lines;k++){
	                temp.mask2[k]=mask[k].clone();
	              }
	              res.add(0,temp);
	            for(int m=0;m<lines;m++){
	                for(int n=0;n<lines;n++){
	                  mask[m][n]=false;
	                }
	              }
	            }
	          }
	        }
	      }
	      int max=0;
	      for(pair p: res){
	        if(max<p.area){
	          max=p.area;
	        }
	      }
	      int perim=0;
	      for(pair p: res){

	        if(max==p.area){
	          for(int m=0;m<lines;m++){
	              for(int n=0;n<lines;n++){
	                if(p.mask2[m][n]==true){
	                  if(m-1<0){
	                    perim++;
	                  }
	                  else if(!p.mask2[m-1][n]){
	                    perim++;
	                  }

	                  if(m+1>=lines){
	                    perim++;
	                  }
	                  else if(!p.mask2[m+1][n]){
	                    perim++;
	                  }

	                  if(n+1>=lines){
	                    perim++;
	                  }
	                  else if(!p.mask2[m][n+1]){
	                    perim++;
	                  }

	                  if(n-1<0){
	                    perim++;
	                  }
	                  else if(!p.mask2[m][n-1]){
	                    perim++;
	                  }
	                }
	              }
	            }
	        }
	      }
	      System.out.println(max);
	      System.out.print(perim);
	      out.close();
	  }
	}

