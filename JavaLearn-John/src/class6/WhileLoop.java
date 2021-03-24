package class6;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		int n=1;
		while(n<=10) {
			//n++;
			System.out.println(n);
			n++;
		}
		
		int i=1;
		while(i<=2){
			int j = 1;
		    while(j<=3){
		        System.out.print("!");
		        j++;
		    }
		    System.out.println();
		    i++;
		}
		mystery(64);
		
		
	}//main
	
	public static void mystery(int x)
	{
	  int y = 0;
	  while (x % 2 == 0)
	  {
	    y++;
	    x = x / 2;
	  }
	  System.out.println( x + " " + y);
	}
	
	public static void mystery2(int x)
	{
	  int y = 1;
	  int z = 0;
	  while (2 * y <= x)
	  {
	    y = y * 2;
	    z++;
	  }
	  System.out.println(y + " " + z);
	} 


}
