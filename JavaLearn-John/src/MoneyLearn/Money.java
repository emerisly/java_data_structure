package MoneyLearn;

public class Money {
	private int dollars;
	private int cents;
	
	public Money(int d, int c) {
		dollars=0;
		cents=0;
		add(d,c);
	}
	
	public void add(int d, int c) {
		int addDollar=0;
		if(c>99) {
			addDollar=(c-c%100)/100;
			c%=100;
		}
		dollars=d+addDollar;
		cents=c;
	}
	
	public String toString() {
		return "Money is: $"+dollars+"."+cents;
	}
	

}
