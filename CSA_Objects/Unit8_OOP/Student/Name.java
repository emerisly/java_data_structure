package Student;

public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name() {
		this("","","");
	}
	public Name(String fn,String mn, String ln) {
		this.setName(fn, mn, ln);
	}
	
	public void setName(String fn,String mn,String ln) {
		this.firstName=fn;
		this.middleName=mn;
		this.lastName=ln;
	}
	
	public void setFirstName(String fn) {
		this.firstName=fn;
	}
	
	public void setMiddleName(String mn) {
		this.middleName=mn;
	}
	
	public void setLastName(String ln) {
		this.lastName=ln;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public String getMiddleInitial() {
		return this.middleName.charAt(0)+".";
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getName() {
		return this.firstName+" "+this.middleName+" "+this.lastName;
	}
	
	public String toString() {
		return this.firstName+" "+this.middleName+" "+this.lastName;
	}
}
