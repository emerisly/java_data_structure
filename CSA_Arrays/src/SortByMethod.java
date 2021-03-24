import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SortByMethod {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(new File("grades.txt"));
		String[] namesArr=new String[10];
		double[] gradesArr=new double[10];
		for(int i=0;i<10;i++) {
			StringTokenizer data=new StringTokenizer(console.nextLine());
			namesArr[i]=data.nextToken();
			gradesArr[i]=Double.parseDouble(data.nextToken());
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(namesArr[i]+"\t"+gradesArr[i]);
		}
		System.out.println();
		
		sortDescendingBubblePrimitiveInt(gradesArr);
		
		for(int i=0;i<10;i++) {
			System.out.println(gradesArr[i]);
		}
		System.out.println();
		
		sortAlphaString(namesArr);
		
		for(int i=0;i<10;i++) {
			System.out.println(namesArr[i]);
		}
		System.out.println();
		
		console.close();
		
	}

	private static void sortAlphaString(Comparable[] names) {
		// TODO Auto-generated method stub
		for(int i=0;i<names.length-1;i++) {
			for(int j=0;j<names.length-1-i;j++) {
				if(names[j].compareTo(names[j+1])>0) {
					Comparable str=names[j];
					names[j]=names[j+1];
					names[j+1]=str;
					
				}
			}
		}
	}

	public static void sortDescendingBubblePrimitiveInt(double[] grades) {
		// TODO Auto-generated method stub
		for(int i=0;i<grades.length-1;i++) {
			for(int j=0;j<grades.length-1-i;j++) {
				if(grades[j]<grades[j+1]) {
					double temp=grades[j];
					grades[j]=grades[j+1];
					grades[j+1]=temp;
				}
			}
		}
	}
	
	

}
