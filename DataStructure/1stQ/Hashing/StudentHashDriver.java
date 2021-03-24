package Hashing;


public class StudentHashDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentHash s1=new StudentHash("Namath",12);
		StudentHash s2=new StudentHash("Maynard",13);
		StudentHash s3=new StudentHash("Namath",12);
		StudentHash s4=new StudentHash("Maynard",13);
		StudentHash s5=s1;
		
		if(s1==s2)
			System.out.println("s1 and s2 are ==");
		if(s1==s3)
			System.out.println("s1 and s3 are ==");
		if(s2==s4)
			System.out.println("s2 and s4 are ==");
		if(s2==s3)
			System.out.println("s2 and s3 are ==");
		if(s1==s4)
			System.out.println("s1 and s4 are ==");
		if(s3==s4)
			System.out.println("s3 and s4 are ==");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		StudentHash s=new StudentHash("Very Interesting",31);
		System.out.println(s.hashCode());
		
	}

}
