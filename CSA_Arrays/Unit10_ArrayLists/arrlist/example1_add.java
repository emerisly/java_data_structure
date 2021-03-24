package arrlist;
import java.util.*;

public class example1_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myFirstArrList=new ArrayList<>();
		myFirstArrList.add("opps");
		myFirstArrList.add("wow");
		myFirstArrList.add("Hum");
		System.out.println(myFirstArrList);
		myFirstArrList.add(1,"yeah!");
		myFirstArrList.add(3, "yooo!");
		System.out.println(myFirstArrList);
		myFirstArrList.remove(2);
		System.out.println(myFirstArrList);
		
		int sum=0;
		for(int i=0;i<myFirstArrList.size();i++) {
			String s=myFirstArrList.get(i);
			sum+=s.length();
		}
		System.out.println("Total length: "+sum);
		
		if(myFirstArrList.contains("yeah!"))
			System.out.println("YEAH!");
		
		System.out.println(myFirstArrList.indexOf("Hum"));
		
		myFirstArrList.clear();
		System.out.println(myFirstArrList);
	}

}
