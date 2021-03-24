package Student;

public class Student {
	private Name studentName=new Name();
	private int studentID;
	private int year;
	private double gpa;
	
	public Student(){
		this(000000,0,0);
	}
	public Student(int id,int year,double gpa) {
		this.setStudentID(id);
		this.setYear(year);
		this.setGPA(gpa);
	}
	public void setStudentID(int n) {
		if(Integer.toString(n).length()!=6)
			throw new IllegalArgumentException("ID should contain 6 digits");
		this.studentID=n;
	}
	public void setYear(int n) {
		this.year=n;
	}
	public void setGPA(double n) {
		if(n<0.0||n>4.0)
			throw new IllegalArgumentException("gpa should be between 0.0 and 4.0");
		this.gpa=n;
	}
	public Name getName() {
		return studentName;
	}
	public int getStudnetID() {
		return studentID;
	}
	public int getYear() {
		return year;
	}
	public double getGPA() {
		return gpa;
	}
	
	public String toString() {
		if(studentName.getFirstName()==null) {
			return "This sutudent's name hasn't been entered yet.";
		}
		else {
			return "Student Name: "+studentName.getFirstName()+" "+studentName.getMiddleInitial()+" "+studentName.getLastName()+
			"\nID: "+this.getStudnetID()+"\t Year: "+this.getYear()+"\tGPA: "+this.getGPA();
		}
	}

}
