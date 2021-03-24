package Bronze;
import java.io.*;
import java.util.*;

public class B201701_BlockedBillboardSolution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		int x4 = Integer.parseInt(st.nextToken());
		int y4 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x5 = Integer.parseInt(st.nextToken());
		int y5 = Integer.parseInt(st.nextToken());
		int x6 = Integer.parseInt(st.nextToken());
		int y6 = Integer.parseInt(st.nextToken());
		
		int combinedArea = visibleArea(x1, y1, x2, y2, x5, y5, x6, y6) + visibleArea(x3, y3, x4, y4, x5, y5, x6, y6);
		
		pw.println(combinedArea);
		pw.close();
		
	}
	
	public static int areaOfRectangle(int x1, int y1, int x2, int y2) {
		return (x2-x1)*(y2-y1);
	}
	
	public static int visibleArea(int x1, int y1, int x2, int y2, int x5, int y5, int x6, int y6) {
		int visibleArea=areaOfRectangle(x1,y1,x2,y2);
		int leftBottomX=Math.max(x1, x5);
		int leftBottomY=Math.max(y1, y5);
		int rightTopX=Math.min(x2, x6);
		int rightTopY=Math.min(y2,y6);
		if(leftBottomX<rightTopX&&leftBottomY<rightTopY) {
			visibleArea-=areaOfRectangle(leftBottomX,leftBottomY,rightTopX,rightTopY);
		}
		return visibleArea;
	}
	
	

}
