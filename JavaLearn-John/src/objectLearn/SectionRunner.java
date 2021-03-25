package objectLearn;

public class SectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Section worldHistory1 = new Section();
		Name n1 = new Name("Mark","White");
		Teacher t1 = new Teacher(n1,40,15,"Math");

		//got teacher
		worldHistory1.setTeacher(t1);
		System.out.println(worldHistory1.printTeacher());
		
		//create students
		Undergrates[] studentGroup1 = new Undergrates[2];
		Name name1 = new Name("Tom","StudentCo");
		Undergrates stu1 = new Undergrates(name1,3.5,"male",14);
		studentGroup1[0]=stu1;
		Name name2 = new Name("Tom2","StudentCo2");
		Undergrates stu2 = new Undergrates(name2,3.6,"male",14);
		studentGroup1[1]=stu2;
		
		
		worldHistory1.setStudent(studentGroup1);
		//got student
		
		
		
		System.out.println("The first Studnet in world History classs is: "+worldHistory1.getStudent()[0].getName().getFirstName());
		
		worldHistory1.room=305;
		worldHistory1.period=8;
		//section completed
		
		System.out.println("Section Info:\n"+worldHistory1);
		
		Section randomSection = new Section(null,null,100,4);
		
		Name n2 = new Name("Alex","Coots");
		Teacher t2 = new Teacher(n2,30,10,"Physics");
		Section randomSection2 = new Section(t2,null,200,2);
		randomSection2.setTeacher(t2);
		

	}

}
