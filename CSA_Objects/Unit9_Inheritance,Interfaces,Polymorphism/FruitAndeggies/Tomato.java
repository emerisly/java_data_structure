package FruitAndeggies;

public class Tomato extends Vegetable{

	public Tomato(double s) {
		super.setSize(s);
	}
	public void eat() {
		System.out.println("Eat this tomato");
	}
	public String toString() {
		return "This tomato is "+super.getSize()+" cm in diameter.";
	}
	
}
