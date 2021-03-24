package shapehierarchy;

public interface Shape extends Comparable<Shape>{
	public double area();
	public int compareTo(Shape obj);
	public static final double P=Math.PI;
	public String toString();
}
