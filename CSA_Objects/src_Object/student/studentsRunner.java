package student;

public class studentsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		address ad1=new address("402 Carter Ave","Point Pleasant Beach");
		students Emerald=new students("Emerald","Liu",10,95,96,ad1);
		address ad2=new address("1119 Shuidian Road","Shanghai");
		students Siqi=new students("Siqi","Liu",8,83,84,ad2);
		address ad3=new address("JiuLiDiNan Road","Chengdu");
		students Zengxing=new students("Zengxing","Liu",12,95,94,ad3);
		address ad4=new address("JingFeng Road","Shanghai");
		students Yan=new students("Yan","Wu",12,96,95,ad4);
		System.out.println(Emerald+"\n"+Siqi+"\n"+Zengxing+"\n"+Yan);
		System.out.println("Emerald compares to Siqi: "+Emerald.compareTo(Siqi));
	}

}
