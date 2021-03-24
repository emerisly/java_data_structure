package shapehierarchy;

public abstract class AbstractShape implements Comparable{

	public abstract double area(); 

	public abstract String toString();

	public int compareTo( Comparable cP)

	{

		Comparable parameter = null;

		System.out.println("Origin: AbstractShapeClass");

		if(this.area()>((AbstractShape) parameter).area())

			return 1;

		else if(area()<((AbstractShape) parameter).area())

			return -1;

		else

			return 0;

	}
	
}
