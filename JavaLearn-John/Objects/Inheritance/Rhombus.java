package Inheritance;

public class Rhombus extends Parallelogram implements regularPolygon{
	
	public Rhombus (int b,int h) {
		super(b,h);
	}
	
	
	public int getArea() {
		return (int) (0.5*getHeight()*getBase());
	}
	
	public String toString() {
		return "This is a rhombus.... The area is "+getArea();
	}
	
	public double getInterorAngleMeasure() {
		return 0;
	}
	
	public double getSidesLength() {
		return (getBase()+getHeight())*2;
	}

}
