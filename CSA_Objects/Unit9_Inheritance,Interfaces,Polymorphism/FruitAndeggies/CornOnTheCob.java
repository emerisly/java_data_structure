package FruitAndeggies;

public class CornOnTheCob extends Vegetable{
	
	public CornOnTheCob(double s) {
		super.setSize(s);
	}
	public void eat() {
		System.out.println("Eat this corn on the cob");
	}
	public String toString() {
		return "This piece of corn on the cob is "
				+ super.getSize()+" cm in diameter.";
		}
}
