package Hashing;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Joe Namath";
		String s2=new String("Joe Namath");
		String s3="Joe Namath";
		String s4=new String("Joe Namath");
		String s5=s1.intern();
		String s6=s1;
		String s7=s2.intern();
		
		
		String[] arr={s1,s2,s3,s4,s5,s6,s7};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].hashCode());
		}
		System.out.println();
		
		
		/*
		 0
		 0 -> 1
		 0
		 0 -> 1
		 
		 0
		 1 -> 0
		 0
		 
		 0
		 0 -> 1
		 
		 0
		 
		 1
		 */
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);//
		System.out.println(s1==s4);
		System.out.println(s1==s5);//
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s5);
		System.out.println(s3==s4);
		System.out.println(s3==s5);//
		System.out.println(s4==s5);
		System.out.println(s1==s6);//
		System.out.println(s2==s7);
		System.out.println(s1==s7);//
		
		
		//intern check the string and see if the string is in the pool already and assign address if there is one
	}

}
