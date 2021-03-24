package class6;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int x = (int)(Math.random()*6+1);
		int y = (int)(Math.random()*6+1);
		System.out.println(x+" "+y);
		cnt++;
		while(x+y!=7) {
			x = (int)(Math.random()*6+1);
			y = (int)(Math.random()*6+1);
			System.out.println(x+" "+y);
			cnt++;
		}
		System.out.println("YES. YOU GOT A 7");
		System.out.println("Took you " +cnt+ " times");

	}

}
