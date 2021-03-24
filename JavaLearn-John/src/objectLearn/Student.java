package objectLearn;

public class Student {
	//we are creating a type of object that is studnet
	
	//fields
	private Name name;
	private double gpa;
	String gender;
	int age;
	
	
	//over-loading constructor
	public Student(){
		/*
		name="default";
		gpa=0.0;
		gender="N/A";
		age=0;
		*/
		this(null,0.0,"N/A",0);
	}
	
	public Student(Name n, double gp, String ge, int a) {
		name=n;
		gpa=gp;
		gender=ge;
		age=a;
	}
	
	//behaviors
	
	public void setName(Name n) {
		this.name=n;
	}
	
	public Name getName() {
		return this.name;
	}
	
	public String printName() {
		return this.name.firstName+" "+this.name.lastName;
	}
	
	
	public void setGpa(double Gpa) {
		if(Gpa<0.0||Gpa>4.0)
			throw new IllegalArgumentException("gpa has to be between 0-4");
		gpa=Gpa;
	}
	
	public String getGpa() {
		return "Gpa: "+gpa;
	}
	
	public String toString() {
		if(name==null) return "Student's data hasn't been entered yet";
		return "Student's data: "+name+" "+gpa+" "+gender+" "+age;
	}
	
	
}
