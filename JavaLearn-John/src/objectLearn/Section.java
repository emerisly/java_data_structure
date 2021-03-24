package objectLearn;

import java.util.Arrays;

public class Section {
	
	
	private Teacher teacher;
	private Student[] student;
	int room;
	int period;
	
	
	//constructor
	public Section(Teacher t,Student[] s,int r,int p) {
		teacher=t;
		student=s;
		room=r;
		period=p;
	}
	
	public Section() {
		this(null,null,0,0);
		/*
		teacher=null;
		student=null;
		room=0;
		period=0;
		*/
	}
	
	//methods
	//public void moveSection
	
	public String printTeacher() {
		return teacher.name+"";
		//return teacher.name.firstName+" "+teacher.name.lastName;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher t) {
		teacher=t;
	}
	
	public String printStudent() {
		//return Arrays.toString(student);
		String str="";
		for(int i=0;i<student.length;i++) {
			str+=(i+1)+". "+student[i].printName()+", ";
		}
		return str;
	}
	
	public Student[] getStudent() {
		return student;
	}
	
	public void setStudent(Student[] s) {
		student=s;
	}
	
	public void setOneStudent(int index, Student s) {
		student[index]=s;
	}
	
	//toString
	public String toString() {
		return "Teacher: "+printTeacher()+"\nStudent: "+printStudent()+"\nRoom: "+room+", Period: "+period;
	}

}
