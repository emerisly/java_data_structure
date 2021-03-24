//3.40s
package Tryout;
import java.util.Arrays;
import java.util.Scanner;
public class MissingNumber {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner console=new Scanner(System.in);
		int howMany=console.nextInt();//4
		int num[]=new int[howMany-1];//3
		while(console.hasNext()) {
			for(int i=0;i<howMany-1;i++) {
				num[i]=console.nextInt();
			}
			Arrays.sort(num);
			
/*			for(int i=0;i<howMany-1;i++) {
				System.out.print(num[i]+" ");
			}
			System.out.println();
*/			
			for (int i=0;i<howMany-1;i++) {
				if(num[i]!=i+1) {
					System.out.println(i+1);
					break;
				}
			}
			if(num[howMany-2]==howMany-1)
				System.out.println(howMany);
			}
		console.close();
		}
		
		
	}