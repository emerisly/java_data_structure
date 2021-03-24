package shapehierarchy;

public class Circle implements Shape{
	protected double radius;
	
	public Circle() {
		this.radius=1;
	}
	
	public Circle(double r) {
		this.radius=r;
	}
	
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double circumference() {
		return 2*Math.PI*radius;
	}
	
	public int compareTo(Shape param) {
		if(this.area()>param.area()) {
			return 1;
		}
		else if(this.area()<param.area()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public String toString() {
		String result="";
		result+="radius: "+radius+"\n";
		result+="circumference: "+circumference()+"\n";
		result+="area: "+area();
		return result;
	}
	
}
