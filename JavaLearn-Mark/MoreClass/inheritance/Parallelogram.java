package inheritance;

public class Parallelogram extends Quadrilateral{
	private int base;
	private int height;
	
	public Parallelogram(int b, int h) {
		setSides(0);
		setBase(b);
		setHegiht(h);
	}

	public void setHegiht(int h) {
		// TODO Auto-generated method stub
		height=h;
	}

	public void setBase(int b) {
		// TODO Auto-generated method stub
		if(b<=0) throw new IllegalArgumentException("Base need to be > 0");
		base=b;
	}
	
	public int getBase() {return base;}
	public int getHeight() {return height;}
	
	public int getArea() {
		return base*height;
	}
	
	public String toString() {
		return "This is a parallelogram with 4 sides. It's base is "+base+", and it's height is "+height+". "+super.toString();
	}

}
