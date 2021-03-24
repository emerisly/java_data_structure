package objectLearn;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tyep name = new type()
		Student stu1 = new Student();
		Name name1 = new Name("John","Li");
		//stu1.name="John";
		stu1.setName(name1);
		//stu1.gpa=5.0;
		stu1.setGpa(4.0);
		stu1.gender="male";
		stu1.age=13;
		System.out.println(stu1);
		System.out.println(stu1.getName());
		//System.out.println(stu1.gpa);
		System.out.println(stu1.getGpa());
		
		System.out.println();
		//Student stu3 = new Student("Gabby",3.0,"female",16);
		//System.out.println(stu3);
		Student stu4 = new Student();
		System.out.println(stu4);
		System.out.println();
		
		Student stu2 = new Student();
		System.out.println(stu1);
		System.out.println(stu2);
		
		System.out.println("***"+stu1.toString());
		
		
		Student stu5 = new Student();
		//stu5.setGpa(-1);
		System.out.println(stu5.getGpa());
		
		
		System.out.println("Name is "+stu1.getName().getFirstName());
		System.out.println("Name is "+stu1.printName());
		
		
		
		Student stu6 = new Student();
		System.out.println("Name is "+stu6.getName().getFirstName());

	}

}
