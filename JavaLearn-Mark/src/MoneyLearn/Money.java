package MoneyLearn;

public class Money {
	
	private int dollars;
	private int cents;
	
	/*
	
	public Money(int d, int c) {
		dollars=0;
		cents=0;
		add(d,c);
	}
	
	public void add(int d, int c) {
		dollars=d+c/100;
		cents=c%100;
	}
	*/
	
	public Money(int d, int c) {
		dollars=d;
		cents=c;
		add();
	}
	
	public void add() {
		dollars+=cents/100;
		cents%=100;
	}
	
	public String toString() {
		return "$"+dollars+"."+cents;
	}

}
