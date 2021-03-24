package Inheritance;

public class Rectangle extends Parallelogram{
	private int angleMeasure;
	
	public Rectangle(int b, int h) {
		super(b,h);
		angleMeasure=90;
	}
	public Rectangle() {
		this(1,1);
		angleMeasure=90;
	}
	
	public int getAngle() {
		return angleMeasure;
	}
	
	public String toString() {
		return "This is a rectangle with a base of "+getBase()+" and a height of "+getHeight()+
				", and all angels are "+angleMeasure+" degrees. "+super.toString();
		
	}
	

}
