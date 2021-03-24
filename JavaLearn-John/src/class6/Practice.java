package class6;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 104;
		int cnt = 0;
		
		while(number%2==0) {
			System.out.println(number);
			number/=2;
			cnt++;
		}
		System.out.println(cnt);
		
		System.out.println();
		for(int i=1;i<3;i++) {
			System.out.println("1");
			for(int j=1;j<3;j++) {
				System.out.println("2");
			}
		}
		
		System.out.println();
		int k=3;
		String s="";
		while(k>-1) {
			s=k+"_"+s;
			k--;
		}
		System.out.println(s);
		System.out.println();
		
		int b=5;
		String list="";
		while(b<11) {
			b=b+2;
			if(b%2==1) {
				list=b+"_"+list;
				//System.out.println(list);
			}
			//System.out.println();
			//System.out.print(list);
		}
		//11 9 7 
		System.out.println(list);
	}

}
