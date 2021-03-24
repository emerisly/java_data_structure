package Object;

public class Person {
	String fName;
	String lName;
	int a;
	
	public Person() {
		this("","",0);
	}
	
	public Person(String firstName,String lastName,int age){
		this.fName=firstName;
		this.lName=lastName;
		this.a=age;
	}

}
