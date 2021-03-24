package class4;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println(n);
		
		{
			int tryIt=100;
			System.out.println(tryIt);
		}
		//scope of tryIt -> line 11-13
		
		//System.out.println(tryIt);
		int number=0;
		number=n+3;
		System.out.println(number);
		
		int count = 0;
		for(count = 1; count <=10; count++) {
			
		}
		System.out.println(count);
		
		int i;
		for(i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+""+j+" OH");
			}
		}
		

	}

}
