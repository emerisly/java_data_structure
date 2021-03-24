package firstObject;

public class Student {
	//fields
	//methods
	//constructors
	
	private String name;
	private int age;
	private double gpa;
	
	public Student(String n, int a, double g) {
		this.name=n;
		this.age=a;
		this.gpa=g;
	}
	
	public Student() {
		//name="";
		//age=0;
		//gpa=0;
		this("",0,0);
	}
	
	public String getName() {
		return "Name is: "+name+ "!!!!";
	}
	
	public String gAge() {
		return "Age is: "+age;
	}
	
	public void increaseAgeByOne() {
		age++;
	}
	
	public void setName(String s) {
		name=s;
	}
	
	public void setAge(int n) {
		age=n;
	}
	
	public void setGpa(double i) {
		gpa=i;
	}

	public String toString() {
		return "Name: "+name+", age: "+age+", gpa: "+gpa;
	}


}
