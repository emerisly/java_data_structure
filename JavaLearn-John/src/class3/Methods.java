package class3;

public class Methods {

	public static void main(String[] args) {
		// void -> return nothing
		System.out.println(sqrt(4)+"\n"+givePI());
		//sqrt(4);
		//givePI();
		
		int a, b, c;
		
		if(true) {
			System.out.println("YES");
		}
		
		for(int i=1;i<=5;i++) {
		//for(<initialization>;<continuation test>;<update>){ }
			System.out.println(i+"^2="+(i*i));
		}
		
		for(int i = 0; i < 2; i++)
			System.out.println("Hi");
		
		int answer = 1;
		for(int i=1;i<=10;i++) {
			answer*=i;
			System.out.println("current ans: "+answer);
		}
		System.out.println(answer);
		
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		char ch=65;
		System.out.println("65="+ch);

	}
	
	public static double sqrt(double input) {
		//<public> <static> <returnType> <methodsName> (<varType> <varName>)
		//this methods will return a double
		double answer = Math.pow(input,0.5);
		return answer;
	}
	
	public static double givePI() {
		//System.out.println("This will not be printed");
		return 3.1415926;
	}
	
	public static void getRoots(int a, int b, int c) {
		//*******
		//SOP(root1)
		//SOP(root2)
	}

}
