package MyFirstPackage;

public class Object {
	private String firstName;
	private String middleName;
	private String lastName;
	int studentId;
	int year;
	double gpa;
	
	public Object() {
		this("", "", "",0,0,0);
	}
	public Object(String fn,String mn,String ln) {
		setName(fn,mn,ln);
	}
	
	public Object(String fn,String mn,String ln,int id,int year, double gpa) {
		setEverything(fn,mn,ln,id,year,gpa);
	}
	
	public void setName(String fn,String mn,String ln) {
		this.firstName=fn;
		this.middleName=mn;
		this.lastName=ln;
	}
	
	public void setEverything(String fn,String mn,String ln,int id,int year, double gpa) {
		this.firstName=fn;
		this.middleName=mn;
		this.lastName=ln;
		this.studentId=id;
		this.year=year;
		this.gpa=gpa;
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
	
	public String getMiddleInitial() {
		return this.firstName.charAt(0)+".";
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getNormalOrder() {
		return this.getFirstName()+" "+this.getMiddleInitial()+" "+this.getLastName();
	}
	
	public String getReverseOrder() {
		return this.getLastName()+", "+this.getFirstName()+" "+this.getMiddleInitial();
	}
	
	public String toString() {
		return this.firstName+" "+this.middleName+" "+this.lastName;
	}
}
