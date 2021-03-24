package FruitAndeggies;

public abstract class Vegetable implements Comparable<Vegetable>{

	double size;
	
	public void setSize(double s) {
		this.size=s;
	}
	public double getSize() {
		return this.size;
	}
	
	public abstract void eat();
	public abstract String toString();
	
	public int compareTo(Vegetable other) {
		if(this.size<other.getSize())
			return -1;
		else if(this.size>other.getSize())
			return 1;
		else
			return 0;
	}
}

