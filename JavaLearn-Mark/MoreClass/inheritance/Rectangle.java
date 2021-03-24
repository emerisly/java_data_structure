package inheritance;

public class Rectangle extends Parallelogram implements MathTest{

	private int angleMeasure;
	
	public Rectangle(int b, int h) {//overloading
		super(b, h);
		angleMeasure=90;
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle() {
		this(1,1);
	}
	
	public String toString() {//overriding
		return "This is a rectangle with a base of "+getBase()+" and a height of "+getHeight()
				+" . And the angle measure is: "+angleMeasure;
	}


}
