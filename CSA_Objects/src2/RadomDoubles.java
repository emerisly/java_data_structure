import java.text.NumberFormat;
public class RadomDoubles {
	
	public static void main(String[] arg) {
//	Random r=new Random();
//	int daysWorking=r.nextInt(11)+10;
//	int tips=r.nextInt(91)+10;
	int daysWorking=(int)(Math.random()*19)+10;
	//tip from 10 to 100
	double tip=Math.random()*91+10;

	int day=0;
	double sum=0;
	NumberFormat currencyFormat=NumberFormat.getCurrencyInstance();
	
	while (day<daysWorking) {
		System.out.println("# "+day+"\tTips: "+currencyFormat.format(tip));
		sum=sum+tip;
		//daysworking from 10 to 20
		daysWorking=(int)(Math.random()*11)+10;
	    //tip from 10 to 100
		tip=Math.random()*91+10;
		day++;
	}
	double avg=(double)sum/(double)daysWorking;
	System.out.println("\nThe sum of tips is "+currencyFormat.format(sum));
	System.out.println("The avg of tips is "+currencyFormat.format(avg));
	
	//double number=Integer.parseInt(scan.next());
	
	}
	
	
}
