package Hashing;

public class StudentHash{
	String name;
	int id;
	public StudentHash(String N,int I) {
		name=N;
		id=I;
	}
	public String toString() {
		String result;
		result="Name: "+name+" id: "+id;
		return result;
	}
	public boolean equals(StudentHash obj) {
		if(!name.equals(obj.name))
			return false;
		if(id!=obj.id)
			return false;
		return true;
	}
	public int hashCode() {
		int hash = name.hashCode()+id;
		if(hash<0)
			hash=-hash;
		return hash;
	}
	
}