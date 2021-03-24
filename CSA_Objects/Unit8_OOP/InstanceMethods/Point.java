package InstanceMethods;

public class Point {
	int x=0;
	int y=0;
	
	public void translate(int dx, int dy) {
		x+=dx;
		y+=dy;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	


}
