package shapehierarchy;

public class RectangularPrism extends Rectangle {

	private double height;

	

	public RectangularPrism()

	{

		super();

		height = 1;

	}

	public RectangularPrism(int l, int w, int h) 

	{

		super(length, width);

		height = h;

	}

	public double area() 

	{

		//surface area of rect prism

		//overriding the area() in circle

		

		//System.out.println("Area coming the Cylinder class");

		double area = 2* (width*length + height*length + height*width );

		return area;

	}

	public double volume()

	{

		double v = super.area() * height;

		return v;

	}

	public void increaseHeight(int factor)

	{



		//increase the height by the parameter factor



		//height * factor



		height = height * factor;



	}

	public String toString()

	{



		String result = "\n**Rectangular Prism**";



		//result += "\nThis is coming from the Cylinder class";



		result += "\nlength: " + length;

		

		result += "\nwidth: " + width;



		result += "\nheight: " + height;



		result += "\nbase: " + super.area();



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
