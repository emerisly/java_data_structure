package FruitAndeggies;

public class FruitAndVeggieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CornOnTheCob c1=new CornOnTheCob(10);
		CornOnTheCob c2=new CornOnTheCob(12);
		Tomato t1=new Tomato(5);
		Tomato t2=new Tomato(5);
		
		System.out.println("Compare Corn: "+c1.compareTo(c2));
		System.out.println("Compare Tomatoes: "+t1.compareTo(t2));
		System.out.println("Compare Corn and Tomatoes: "+c1.compareTo(t1));

	}

}
