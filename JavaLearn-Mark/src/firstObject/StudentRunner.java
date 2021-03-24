package firstObject;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("emerald",18,0.0);
		System.out.println(s1);
		System.out.println(s1.getName());
		//s1.name="Mark";
		//s1.age=18;
		//s1.gpa=5.0;
		//System.out.println(s1.name);
		s1.setName("Mark");
		s1.setAge(200);
		s1.setGpa(5.0);
		s1.increaseAgeByOne();
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.gAge());
		
		Student s2 = new Student();
		System.out.println(s2);
		
	}

}
