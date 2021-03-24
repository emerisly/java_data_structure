import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ParallelArrays {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(new File("grades.txt"));
		String[] names=new String[10];
		double[] grades=new double[10];
		for(int i=0;i<10;i++) {
			StringTokenizer data=new StringTokenizer(console.nextLine());
			names[i]=data.nextToken();
			grades[i]=Double.parseDouble(data.nextToken());
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(names[i]+"\t"+grades[i]);
		}
		System.out.println();
		
		for(int i=0;i<grades.length-1;i++) {
			for(int j=0;j<grades.length-1-i;j++) {
				if(grades[j]<grades[j+1]) {
					double temp=grades[j];
					grades[j]=grades[j+1];
					grades[j+1]=temp;
					String str=names[j];
					names[j]=names[j+1];
					names[j+1]=str;
				}
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(names[i]+"\t"+grades[i]);
		}
		System.out.println();
//		System.out.println(Arrays.toString(names)+"\n"+Arrays.toString(grades));
		
		String maxName=names[0];
		double maxGrade=grades[0];
		
		for(int i=0;i<grades.length-1;i++) {
			for(int j=0;j<grades.length-1-i;j++) {
				if(names[j].compareTo(names[j+1])>0) {
					String str=names[j];
					names[j]=names[j+1];
					names[j+1]=str;
					double temp=grades[j];
					grades[j]=grades[j+1];
					grades[j+1]=temp;
					
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(names[i]+"\t"+grades[i]);
		}
		System.out.println();
		
		
		System.out.println("\nhightest avg: "+maxName+": "+maxGrade);
		console.close();
	}

}
