package inheritance;

public class Rhombus extends Parallelogram {

	public Rhombus(int b, int h) {
		super(b, h);
		// TODO Auto-generated constructor stub
	}
	
	public double getDiagonalD1() {
		return 0;
	}
	public double getDiagnoalD2() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getArea() {
		return (int)(0.5*getDiagonalD1()*getDiagnoalD2());
	}
	
	public String toString() {
		return "This is a rhomub with a base of "+getBase()+
				" and a height of "+ getHeight();
	}

	

}
