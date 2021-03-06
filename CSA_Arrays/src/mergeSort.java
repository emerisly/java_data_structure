import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr1= {35,63.2,124.8,94,23,86.2,9};
		double[] arr2= {64,42,39,18,38.6};
		System.out.println("Original Arrays\n"+Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
		System.out.println();
		sortArr(arr1);
		sortArr(arr2);
		System.out.println("Sorted Arrays\n"+Arrays.toString(arr1)+"\n"+Arrays.toString(arr2)+"\n");
		double[] newArray=new double[arr1.length+arr2.length];
		newArray=merge(arr1,arr2);
		System.out.println("Merged Arrays\n"+Arrays.toString(newArray));
				
			}
	

	public static void sortArr(double[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					double temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
		
		public static double[] merge(double[] a,double[] b) {
			
			
			double[] arr=new double[a.length+b.length];
			int countA=0;
			int countB=0;
			int countArr=0;
			while(countA<a.length&&countB<b.length) {
				if(a[countA]>=b[countB]) {
					arr[countArr]=a[countA];
					countArr++;
					countA++;
				}
				if(b[countB]>a[countA]) {
					arr[countArr]=b[countB];
					countArr++;
					countB++;
				}
			}	
			while(countArr<arr.length) {
				if(countA==a.length) {
					arr[countArr]=b[countB];
					countArr++;
				}
				else {
					arr[countArr]=a[countA];
					countArr++;
				}
			}
			return arr;	
		}
}
