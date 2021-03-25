package objectLearn;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tyep name = new type()
		Undergrates stu1 = new Undergrates();
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
		Undergrates stu4 = new Undergrates();
		System.out.println(stu4);
		System.out.println();
		
		Undergrates stu2 = new Undergrates();
		System.out.println(stu1);
		System.out.println(stu2);
		
		System.out.println("***"+stu1.toString());
		
		
		Undergrates stu5 = new Undergrates();
		//stu5.setGpa(-1);
		System.out.println(stu5.getGpa());
		
		Undergrates[] studentGroup = new Undergrates[3];
		studentGroup[0]=stu1;
		studentGroup[1]=stu2;
		studentGroup[2]=stu4;
		
		
		System.out.println("Name is "+stu1.getName().getFirstName());
		System.out.println("Name is "+stu1.printName());
		
		
		
		Undergrates stu6 = new Undergrates();
		System.out.println("Name is "+stu6.getName().getFirstName());

	}

}
