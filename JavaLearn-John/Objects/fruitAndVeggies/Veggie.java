package fruitAndVeggies;

public abstract class Veggie implements Fruit,Comparable<Veggie>{
	double size;
	
	public void setSize(double s) {
		size=s;
	}
	
	public double getSize() {
		return size;
	}
	
	public abstract void eat();
	public abstract String toString();
	
	//p1.translate(dx,dy); -> instance
	//translate(p1,dx,dy); -> static
	
	//tomato1.compareTo(tomato2);
	public String compareTo(Veggie other) {
		if(this==null||other==null) throw new NullPointerException("Nullptr");
		if(this.size<other.size) return "smaller";
		else if(this.size>other.size) return "larger";
		else return "same";
	}

}
