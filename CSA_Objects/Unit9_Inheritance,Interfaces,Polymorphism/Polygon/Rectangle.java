package Polygon;

public class Rectangle extends Parallelogram{
	int base;
	int height;
	int angle;
	
	public Rectangle(int b,int h) {
		super(b,h);
	}	
	public Rectangle() {
		super(1,1);
	}
	public String getAngle() {
		return "90 degrees";
	}
	
	public String toString() {
		return super.toString()+" With four 90 degress angles.";
	}
}
