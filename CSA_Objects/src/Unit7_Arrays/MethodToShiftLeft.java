package Unit7_Arrays;

import java.util.Arrays;

public class MethodToShiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list= {4,5,6,7,8,9};
		System.out.println(Arrays.toString(list));
		
		int[] listCopy=Arrays.copyOf(list, list.length);
//		System.out.println(Arrays.toString(listCopy)+"\n");
		
		int[] list2=rotateLeft(list);
		System.out.println(Arrays.toString(list2));

		int[] list3=rotateRight(listCopy);
		System.out.println(Arrays.toString(list3));

	}
	
	private static int[] rotateLeft(int[] list) {
		// TODO Auto-generated method stub
		int temp=list[0];
		for(int i=1;i<list.length;i++) {
			list[i-1]=list[i];
		}
		list[list.length-1]=temp;
		return list;
	}
	private static int[] rotateRight(int[] list) {
		// TODO Auto-generated method stub
		int temp=list[list.length-1];
		for(int i=list.length-2;i>=0;i--) {
			list[i+1]=list[i];
		}
		list[0]=temp;
		return list;
	}
	
}
