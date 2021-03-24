package fruitAndVeggies;

public class VeggieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veggie tomato1 = new Tomato(10);
		System.out.println(tomato1.isJuicy());
		System.out.println(tomato1.colorOfFlower());
		tomato1.eat();
		
		Veggie tomato2 = new Tomato(5);
		Veggie tomato3 = new Tomato(5);
		System.out.println(tomato1.compareTo(tomato2));
		System.out.println(tomato2.compareTo(tomato3));
		
		Veggie tomato4 = null;
		System.out.println(tomato3.compareTo(tomato4));
		
	}

}
