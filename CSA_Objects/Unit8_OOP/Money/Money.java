package Money;

public class Money {
	
	private int dollars;
	private int cents;
	
	public Money() {
		this(0,0);
	}
	public Money(int d, int c) {
		add(d,c);
	}
	
	public void setDollars(int d) {
		this.dollars=d;
	}
	public void setCents(int c) {
		this.cents=c;
	}
	
	public void add(int d, int c) {
		if(c<100) {
			this.setDollars(d);
			this.setCents(c);
		}
		else {
			this.setDollars(d+c/100);
			this.setCents(c%100);
		}
	}
	
	public String toString() {
		return "My money is: $"+dollars+"."+cents;
	}
}
