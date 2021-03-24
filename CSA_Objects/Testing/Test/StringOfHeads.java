package Test;

public class StringOfHeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0,head=0;
		
		while(head<12) {
			cnt++;
			int coin=(int)(Math.random()*2);
			if(coin==1) head++;
			if(coin==0) head=0;
		}
		System.out.println(cnt);

	}

}
