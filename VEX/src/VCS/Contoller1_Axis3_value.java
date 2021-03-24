package VCS;
import java.util.*;

public class Contoller1_Axis3_value {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		int value=console.nextInt();
		value=(int)(-127*(Math.sqrt(-value/127+1)-1));
		console.close();
		System.out.println(value);
	}

}
