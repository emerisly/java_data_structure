package ObjectLearning;

public class Parallelogram extends Quadrilateral{
	private int base;
	private int height;
	
	//real constructor
	public Parallelogram(int b,int h) {
		super();
		setBase(b);
		setHeight(h);
	}
	
	//default constructor
	public Parallelogram() {
		this(1,1);
	}
	
	public void setBase(int b) {
		if(b<0) throw new IllegalArgumentException("Base has to be > 0");
		base=b;
	}
	
	public void setHeight(int h) {
		if(h<0) throw new IllegalArgumentException("Height has to be > 0");
		height=h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getBase() {
		return base;
	}
	
	public int getArea() {
		return base*height;
	}
	
	/*
	public String getAngle() {
		return "OHHHHH"+super.getAngleSum();
	}
	*/
	
	/*
	public String toString() {
		return "This is a Parallelogram with a base of "
	+base+" and a height of "+height+". "+super.toString();
	}
	*/

}
