package Bronze;
import java.util.*;
import java.io.*;

public class B201702_TheBovineShuffle {

	public static void main(String[] args) throws IOException{
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br=new BufferedReader(new FileReader("shuffle.in"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int howMany=Integer.parseInt(st.nextToken());
		int a[]=new int[howMany+1];
		
		int arr3[]=new int[howMany+1];
		int arr2[]=new int[howMany+1];
		int arr1[]=new int[howMany+1];	
		

		st=new StringTokenizer(br.readLine());
		for(int i=1;i<a.length;i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		
		
		int idArr[]=new int[howMany+1];
		int idNumArr[]=new int[howMany+1];
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<a.length;i++) {
			idArr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<idNumArr.length;i++) {
			idNumArr[i]=i;
//			System.out.println(a[i]);
		}
		
		for(int i=1;i<a.length;i++) {
			arr3[i]=idNumArr[a[i]];
//			System.out.println("a[i]\t\t"+a[i]);
//			System.out.println("idNumArr[a[i]]\t\t"+idNumArr[a[i]]);
//			System.out.println("arr3[i]\t\t\t\t"+arr3[i]);
		}
		
		for(int i=1;i<a.length;i++) {
			arr2[i]=arr3[a[i]];
		}
		
		for(int i=1;i<a.length;i++) {
			arr1[i]=arr2[a[i]];
		}
		
		for(int i=1;i<a.length;i++) {
			pw.println(idArr[arr1[i]]);
		}
		pw.close();
		
	}

}
