import java.util.Arrays;

public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr1= {35,63.2,124.8,94,23,86.2,9};
		double[] arr2= {64,42,39,18,38.6};
		System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
		sortArr(arr1);
		sortArr(arr2);
		System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
		double[] newArray=new double[arr1.length+arr2.length];
		newArray=mergeSort(arr1,arr2);
		System.out.println(Arrays.toString(newArray));
		
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
	public static double[] mergeSort(double[] a,double[] b) {
		double[] arr=new double[a.length+b.length];
		int j=0;
		for(int i=0;i<Math.min(a.length, b.length)*2;i+=2) {
			arr[i]=Math.max(a[j], b[j]);
			arr[i+1]=Math.min(a[j], b[j]);
			j++;
		}
		int lengthOfNum=2*Math.min(a.length, b.length);
			if(a.length>b.length) {
				int length=b.length;
				for(int i=lengthOfNum;i<arr.length;i++) {
					arr[i]=a[length];
					length++;
				}
			}
			if(a.length<b.length) {
				int length=a.length;
				for(int i=lengthOfNum;i<arr.length;i++) {
					arr[i]=b[length];
					length++;
				}
			}
		return arr;
	}

}
