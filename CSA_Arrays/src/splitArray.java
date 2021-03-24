
public class splitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={90,50,23,-45,76,-12,78,99,-13,56,-21,34,66,73,-15};
		int[] even=new int[15];
		int[] odd=new int[15];
		int[] negative=new int[15];
		int[] positive=new int[15];
		int countEven=0;
		int countOdd=0;
		int countPos=0;
		int countNeg=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[countEven]=a[i];
				countEven++;
			}
			else {
				odd[countOdd]=a[i];
				countOdd++;
			}
			if(a[i]>0) {
				positive[countPos]=a[i];
				countPos++;
			}
			else {
				negative[countNeg]=a[i];
				countNeg++;
			}
			}
		System.out.print("Even: ");
		for(int i=0;i<countEven;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.print("Odd: ");
		for(int i=0;i<countOdd;i++) {
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		System.out.print("Negative: ");
		for(int i=0;i<countNeg;i++) {
			System.out.print(negative[i]+" ");
		}
		System.out.println();
		System.out.print("Positive: ");
		for(int i=0;i<countPos;i++) {
			System.out.print(positive[i]+" ");
		}
		}
	}

