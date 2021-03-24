package student;
public class students implements Comparable<students>{
	private String firstName;
	private String lastName;
	private int grade;
	private double sem1;
	private double sem2;
	private double average;
	private address ad;
	
	public int compareTo(students studParam)
	{
		if(this.getAverage()>studParam.getAverage())
		{
			return 1;
		}
		else if(this.getAverage() < studParam.getAverage())
		{
			return -1;
		}
		else
			return 0;
	}
	
	public students()
	{//default constructor
		this.firstName="";
		this.lastName="";
		this.grade=0;
		this.sem1=0;
		this.sem2=0;
		this.average = 0;
	}
	
	public students(String f, String l, int g, double s1, double s2, address ad)
	{
		this.firstName = f;
		this.lastName = l; 
		this.grade = g;
		this.sem1 = s1;
		this.sem2 = s2;
		this.ad = ad;
		average();
	}
	
	public void average()
	{
		average = (sem1+sem2)/2.0;
	}
	
	
	public void setLastName(String l)
	{
		this.lastName = l; 
	}
	
	public void setFirstName(String f)
	{
		this.firstName = f;
	}
	
	public void setSemester1(double s1)
	{
		if(s1<0||s1>100)
		{
			throw new IllegalStateException("Semester Grade must be >= 0 and <= 100");
		}
		this.sem1 = s1; 
		average();
	}
	
	public void setSemester2(double s2)
	{
		this.sem2 = s2;
		average();
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public double getAverage()
	{
		return (sem1+sem2)/2.0;
	}
	
	public int hashCode() {
		return firstName.hashCode()+lastName.hashCode()+(int)average;
	}
	
	public students(students s) {
		firstName=s.firstName;
		lastName=s.lastName;
		grade=s.grade;
		ad=s.ad.clone();
		
	}
	
	public students clone() {
		return new students(this.firstName,this.lastName,this.grade,this.sem1,this.sem2,this.ad.clone());
	}
	
	
	public String toString()
	{
		String result = "";
		result = result + "First Name: " + firstName;
		result = result + "\nLast Name: " + lastName;
		result += "\nGrade: " + grade;
		result += "\nSemester One: " + sem1;
		result += "\nSemester Two: " + sem2;
		result += "\nAverage: " + average;
		result += "\nAddress: " +ad;
		result += "\n";
		return result;
	}
	
}