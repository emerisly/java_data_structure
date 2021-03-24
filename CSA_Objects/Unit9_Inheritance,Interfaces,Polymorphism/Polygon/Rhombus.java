package Polygon;

public class Rhombus extends Parallelogram{
	int side;
	
	public Rhombus(int s) {
		super(s,s);
	}
	public Rhombus() {
		super(1,1);
	}
	public String toString() {
		return super.toString()+" (sides are all the same).";
	}

}
