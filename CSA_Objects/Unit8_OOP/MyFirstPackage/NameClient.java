package MyFirstPackage;
import java.util.*;

public class NameClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object name1=new Object("Emerald","Erisly","Liu");
		Object name2=new Object();
		Object name3=new Object();
		name2.setName("Crys", "Cat", "Aqua");
		System.out.println("Enter names for the third name");
		Scanner console=new Scanner(System.in);
		name3.setName(console.next(), console.next(), console.next());
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println();
		System.out.println(name1.getNormalOrder());
		System.out.println(name2.getReverseOrder());
		System.out.println(name3.getNormalOrder());

	}

}
