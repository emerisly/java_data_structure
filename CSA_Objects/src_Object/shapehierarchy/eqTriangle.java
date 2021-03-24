package shapehierarchy;

public class eqTriangle extends AbstractShape {

	protected static double base;

	

	public eqTriangle()

	{

		

		base = 1;

	}

	

	public eqTriangle( double b)

	{

	

		base = b;

	}

	

	

	

	public int compareTo(Object o) {

		Comparable parameter = null;

		System.out.println("Origin: AbstractShapeClass");

		if(this.area()>((AbstractShape) parameter).area())

			return 1;

		else if(area()<((AbstractShape) parameter).area())

			return -1;

		else

			return 0;

	}



	

	public double area() {

		

		return (Math.sqrt(3)/4)* base*base;

	}

	

	public double perimeter() {

		return base * 3;

	}



	

	public String toString() {

		String result = "";

		result += "base " + base;

		result += "\n perimeter: " + perimeter();

		result += "\n area: " + area();

		return result;

	}

	
	
}
