package Polygon;

public class Parallelogram extends Quadrilateral {
	private int base;
	private int height;
	
	public Parallelogram(int b,int h) {
		super();
		setBase(b);
		setHeight(h);
	}
	public Parallelogram() {
		this(1,1);
	}
	public int getBase() {
		return this.base;
	}
	public int getHeight() {
		return this.height;
	}
	public void setBase(int b) {
		if(b<0)
			throw new IllegalArgumentException("Base can't be negative");
		this.base=b;
	}
	public void setHeight(int h) {
		if(h<0) 
			throw new IllegalArgumentException("Height can't be negative");
		this.height=h;
	}
	public int getArea() {
		return base*height;
	}
	public String toString() {
		return super.toString()+
				" A parallelogram with a base of length "+
				base+" and a height of length "+height+".";
	}
}
