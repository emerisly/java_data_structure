package Array;

public class enhacedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		for(int row[]:a) {
			int avg=0;
			for(int col:row) {
				avg+=col;
				System.out.print(col+" ");
			}
			System.out.println(avg/4);
		}

	}

}
