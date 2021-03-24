package shapehierarchy;

import java.awt.*;

public class Rectangle implements Shape{

	protected static int length;

	protected static int width;

	

	public Rectangle()

	{

		length = 1;

		width = 1;

	}

	public Rectangle(int l, int w)

	{

		length = l;

		width = w;

		

	}

	public double area() 

	{

		

		return length * width;

		

	}

	public double perimeter()

	{

		return length + length + width + width;

	}

	


	

	public String toString()

	{

		String result = "";

		result += "Length " + length;

		result += "\n perimeter: " + perimeter();

		result += "\n area: " + area();

		return result;

	}

	@Override

	public int compareTo(Shape o) 

	{

		Shape parameter = (Shape)o;

		System.out.println("Origin: AbstractShapeClass");

		if(this.area()>parameter.area())

			return 1;

		else if(area()<parameter.area())

			return -1;

		else

			return 0;

	}
}
