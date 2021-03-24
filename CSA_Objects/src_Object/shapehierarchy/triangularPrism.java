package shapehierarchy;

public class triangularPrism extends eqTriangle {

private double length;

	

	public triangularPrism()

	{

		super();

		length = 1;

	}

	public triangularPrism(double b , double l) 

	{

		super(base);

		length = l;

	}

	public double area() 

	{

		//surface area of tri prism

		//overriding the area() in circle

		

		//System.out.println("Area coming the Cylinder class");

		double area = 2*super.area()+ 3 * (base * length);

		return area;

	}

	public double volume()

	{

		double v = super.area() * length;

		return v;

	}

	public void increaseHeight(int factor)

	{



		//increase the height by the parameter factor



		//height * factor



		length = length * factor;



	}

	public String toString()

	{



		String result = "\n**Triangular Prism**";



		//result += "\nThis is coming from the Cylinder class";

		

		result += "\nbase: " + base;



		result += "\nlength: " + length;



		result += "\nface: " + super.area();



		result += "\nsurface area: " + area();



		result += "\nvolume: " + volume();



		return result;

	}

	public int compareTo(Shape param)

	{

		//System.out.println("Origin: Cylinder");

		if(this.area() > param.area())

		{

			return 1;

		}

		else if(area() < param.area())

		{

			return -1;

		}

		else

		{

			return 0;

		}

	}
	
}
