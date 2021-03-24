package Test;

public class NamedPoint extends Point {
	private String name;
	
	public NamedPoint(int d1, int d2, String pointName) {
		super(d1,d2);
		name=pointName;
	}
//	public NamedPoint(String pointName) {
//		name=pointName;
//	}
//	public NamedPoint() {
//		name="";
//	}
	public String toString() {
		return super.toString()+" "+name;
	}

}
