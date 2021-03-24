package student;

public class address {
	
	private String street;
	private String city;
	
	public address() {
		this.street="";
		this.city="";
	}
	
	public address(String s,String c) {
		this.street=s;
		this.city=c;
	}
	
	public String toString() {
		String result=this.street+", "+this.city;
		return result;
	}
	
	public address clone()
	{
		return new address(street,city);
	}

}
