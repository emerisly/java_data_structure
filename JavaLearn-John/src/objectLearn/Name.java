package objectLearn;

public class Name {
	String firstName;
	String lastName;
	
	public Name(String fn, String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}
	
	public Name() {
		this("N/A","N/A");
	}
	
	//getter+setter
	public String getFirstName() {
		return firstName;
	}
	
	public String toString() {
		return firstName+" "+lastName;
	}
	
}
