package class9;

import java.lang.reflect.Array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		str = "abc" + str;
		
		int n = 0;
		n+=3;
		
		
		String str1="what";
		System.out.println(str1.indexOf("at"));
		//System.out.println(str.charAt(5));
		
		int x=0;
		int y=3;
		if (x==0||(y/x)==3) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		System.out.println();
		
		//<type[]> <arrayName> = new <type[size]>
		String[] strArray = new String[10];
		strArray[0] = "Hello there";
		int size = strArray.length;
		System.out.println("size="+size);
		
		int[] firstArray = new int[3];//length=3, index biggest to 2
		firstArray[0]=10231;
		firstArray[1]=232;
		firstArray[2]=-823;
		
		System.out.println(firstArray[2]);
		
		System.out.println(firstArray);		
		
		
		for(int i=0;i<firstArray.length;i++) {
			System.out.print(firstArray[i]+", ");
		}
		
		//System.out.println(Array.toString(firstArray));
		
		
		
		int[] list = new int[5];
		for(int i = 0; i<list.length; i++){
		    list[i]=2*i+1;
		}
		
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+", ");
		}
		System.out.println();
		for (int i=0;i<list.length;i++){
		    list[i]++;
		}
		
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+", ");
		}
		

		
	}

}
