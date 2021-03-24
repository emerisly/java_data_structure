package shapehierarchy;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {
		super();
		height=1;
	}
	
	public Cylinder(double r,double h) {
		super(r);
		height=h;
	}
	
	public double area() {
		double area=2*super.area()+circumference()*height;
		return area;
	}
	
	public double volume() {
		double volume=super.area()*height;
		return volume;
		
	}
	
	
	public void increaseHeight(int factor) {
		height*=factor;
	}
	
	public String toSting() {
		String result="*** Cylinder ***\n";
		result+="This is coming from the Cylinder Class\n";
		result+="radius: "+radius;
		result+="\nheight: "+height;
		result+="\nbase: "+super.area();
		result+="\nsurfaceArea: "+area();
		result+="\nvolume: "+volume();
		return result;
	}
	
	public int compareTo(Shape param) {
		System.out.println("coming from compareTo in the Cylineader Class");
		if(this.area()<param.area()) {
			return 1;
		}
		else if(this.area()<param.area()) {
			return -1;
		}
		else {
			return 0;
		}
		
		
	}

}
