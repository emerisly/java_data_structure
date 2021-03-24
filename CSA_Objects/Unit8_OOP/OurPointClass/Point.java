package OurPointClass;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int initialX, int initialY) {
		this.setLocation(initialX, initialY);
	}
	
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	public void translate(int dx, int dy) {
		this.setLocation(this.x+dx, this.y+dy);
	}
	
	public void setLocation(int newX,int newY) {
		this.x=newX;
		this.y=newY;
	}
	
	public void setX(int n) {
		this.x=n;
	}
	
	public void setY(int n) {
		this.y=n;
	}
	
	public double getDIstanceFromOrigin() {
		return Math.sqrt(x*x+y*y);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	

}
