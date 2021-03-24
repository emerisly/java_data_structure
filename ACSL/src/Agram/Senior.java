package Agram;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Senior {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader br=new BufferedReader(new FileReader("input2.txt"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		for(int k=1;k<=5;k++) {
			String line=br.readLine();
			String[] data=line.split(", ");
			data[0]=data[0].substring(3);
			int[] cardsNum=new int[6];
			String[] cardsSuit=new String[6];
			for(int i=0;i<6;i++) {
				String number=data[i].substring(0,1);
				int num=0;
					switch(number) {
					//change letters to numbers
					case "A":num=1;break;
					case "T":num=10;break;
					case "J":num=11;break;
					case "Q":num=12;break;
					case "K":num=13;break;
					default: num=Integer.parseInt(number);
					}
				cardsNum[i]=num;
				cardsSuit[i]=data[i].substring(1,2);
			}
			
			
			int max=100,min=100;
			String cardNum="";
			String cardSuit="";

}
		/*
			
			if(searchSuit(cardsSuit,cardsSuit[0])) {
				for(int i=1;i<=5;i++) {
					//has suit
					if(cardsSuit[0].equals(cardsSuit[i])) {
						if(cardsNum[i]>=cardsNum[0]&&cardsNum[i]<max) {
							max=cardsNum[i];
						}
						if(cardsNum[i]<cardsNum[0]&&cardsNum[i]<min) {
							min=cardsNum[i];
						}
						if(max<14) {
							switch(max) {
							//change numbers to letters
							case 1:cardNum="A";break;
							case 10:cardNum="T";break;
							case 11:cardNum="J";break;
							case 12:cardNum="Q";break;
							case 13:cardNum="K";break;
							default: cardNum=Integer.toString(max);
							}
						}
						else{
							cardNum=Integer.toString(min);
						}
						cardSuit=cardsSuit[0];
					}
				}
			}
			else {
				switch(cardsSuit[0]) {
					case "C":
						for(int i=1;i<6;i++) {
							if(cardsSuit[i].equals("D")&&cardsNum[i]<min) {
								min=cardsNum[i];
							}
							else if(cardsSuit[i].equals("")&&cardsNum[i]<min) {
								min=cardsNum[i];
						}
						break;
					case "D":
						
						break;
					case "H":
						
						break;
					case "S":
						
						break;
					}
				}
			}

			System.out.println();
			System.out.println(Arrays.toString(cardsNum));
			System.out.println(Arrays.toString(cardsSuit));
			System.out.println("max "+max+"  min "+min);
			System.out.println("cardNum "+cardNum+"   cardSuit "+cardSuit);
		}
		br.close();
		pw.close();
	}

public static boolean searchSuit(String[] arr,String suit) {
	for(int i=1;i<=5;i++) {
		if(suit.equals(arr[i])) {
			return true;
		}
		else {
			return false;
	}
	
}
*/
}
}






	