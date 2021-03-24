package fruitAndVeggies;

public class Tomato extends Veggie implements Fruit{

	public Tomato(double s) {
		super.setSize(s);
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat a Tomato");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a tomato";
	}

	@Override
	public String colorOfFlower() {
		// TODO Auto-generated method stub
		return "yellow";
	}

	@Override
	public boolean isJuicy() {
		// TODO Auto-generated method stub
		return true;
	}

}
