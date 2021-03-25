package rmit;

public class ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean hasBook = true;
		boolean hasMoney = false;
		if(hasBook && hasMoney) {
			System.out.println("I want to buy a book");
		}else {
			System.out.println("Oops");
		}
		
		int yourAge = 5;
		if(yourAge<=5||yourAge>=60) {
			System.out.println("Free ticket");
		}
		
		boolean isEighteen = false;
		if(!isEighteen) {
			System.out.println("You cannot vote yet!");
		}else {
			System.out.println("Yes go vote");
		}

	}

}
