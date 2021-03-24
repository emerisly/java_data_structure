package AssignmentsChapter5;

public class DiceWithoutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int two=0;
		int three=0;
		int four=0;
		int five=0;
		int six=0;
		int seven=0;
		int eight=0;
		int nine=0;
		int ten=0;
		int eleven=0;
		int tweleve=0;
		
		
		for(int i=1;i<=10000;i++) {
			int dice1=(int)(Math.random()*6+1);
			int dice2=(int)(Math.random()*6+1);
			int sum=dice1+dice2;
			System.out.println("First Dice: "+dice1+"\tSecond Dice: "+dice2+"\tSum: "+sum);
			if(sum==2)
				two++;
			else if(sum==3)
				three++;
			else if(sum==4)
				four++;
			else if(sum==5)
				five++;
			else if(sum==6)
				six++;
			else if(sum==7)
				seven++;
			else if(sum==8)
				eight++;
			else if(sum==9)
				nine++;
			else if(sum==10)
				ten++;
			else if(sum==11)
				eleven++;
			else
				tweleve++;
		}//end for loop
		
			System.out.println("\nTwo: "+two+"\nThree: "+three+"\nFour: "+four+"\nFive: "+five+
					"\nSix: "+six+"\nSeven: "+seven+"\nEight: "+eight+"\nNine: "+nine+"\nTen: "+ten+
					"\nEleven: "+eleven+"\nTweleve: "+tweleve);
			
			double twoP=(double)two/100;
			double threeP=(double)three/100;
			double fourP=(double)four/100;
			double fiveP=(double)five/100;
			double sixP=(double)six/100;
			double sevenP=(double)seven/100;
			double eightP=(double)eight/100;
			double nineP=(double)nine/100;
			double tenP=(double)ten/100;
			double elevenP=(double)eleven/100;
			double tweleveP=(double)tweleve/100;
			
			System.out.println("\nTwoP: "+twoP+
					"%\t"+(double)((int)((1.0/36.0)*10000))/100+
					"%\nThreeP: "+threeP+
					"%\t"+(double)((int)((2.0/36.0)*10000))/100+
					"%\nFourP: "+fourP+
					"%\t"+(double)((int)((3.0/36.0)*10000))/100+
					"%\nFiveP: "+fiveP+
					"%\t"+(double)((int)((4.0/36.0)*10000))/100+
					"%\nSixP: "+sixP+
					"%\t"+(double)((int)((5.0/36.0)*10000))/100+
					"%\nSevenP: "+sevenP+
					"%\t"+(double)((int)((6.0/36.0)*10000))/100+
					"%\nEightP: "+eightP+
					"%\t"+(double)((int)((5.0/36.0)*10000))/100+
					"%\nNineP: "+nineP+
					"%\t"+(double)((int)((4.0/36.0)*10000))/100+
					"%\nTenP: "+tenP+
					"%\t"+(double)((int)((3.0/36.0)*10000))/100+
					"%\nElevenP: "+elevenP+
					"%\t"+(double)((int)((2.0/36.0)*10000))/100+
					"%\nTweleveP: "+tweleveP+
			        "%\t"+(double)((int)((1.0/36.0)*10000))/100+"%");

			}
	}

