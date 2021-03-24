package Test;
import java.util.StringTokenizer;



public class error {

	public static int sum(int n) {

		

	if(n==1) 

		return 1; 

	else 

		return n+sum(n-1);
	}
	
	
	public static int sumOfSquares(int n) {

		if(n==1)

			return 1; 

		else 

			return n*n+sumOfSquares(n-1);

	}

	public static boolean isPalindrome2(String s, int i, int j){
		if (i>=j)
			return true; 

	else if (s.charAt(i)!=s.charAt(j))
		return false; 

	else 
		return isPalindrome2(s,++i,--j);

	}

	
	public static boolean isPalindrome3(String s, int i, int j) {

		if(i >= j)
			return true; 

		else if(!(s.substring(i,i+1).equals(s.substring(j-1,j))))
				return false; 

		else 
			return isPalindrome3(s,++i,--j); 
	}

	
	
	public static void reverseArray(int[]array, int i, int j) {

		if(!(i>=j)) {

			int temp = array[i]; 

			array[i]= array[j]; 

			array[j]=temp; 

			reverseArray(array,++i,--j);
		}

			
	}

	
	
		public static String StringBuilder_1(String s) {

			String result ="";

			StringTokenizer tokenizer = new StringTokenizer(s); 

			while(tokenizer.hasMoreTokens()) {

				String token = tokenizer.nextToken(); 

				System.out.println(token);

				result += token+" "; 

			}

			return result; 

		}

	
		
		public static int fibonacci(int n) {

			// return fibonacci number, recurisive algorithm

			if (n<=2)

				return 1; 

			else 

				return fibonacci(n-1)+fibonacci(n-2); 

		}
		
		
		

		//for(int i =0; i<5 i++) {

			//sum = sum + Math.pow(i+1, 2.0); 

	

	public static int factorial(int n) {

		if(n==1)

			return 1;

		else 

			return n*factorial(n-1); 

	}



	public static boolean isPalindrome1(String s) {

		if(s.length()<=1)

			return true; 

		else if(s.charAt(0)!=(s.charAt(s.length()-1)))

			return false; 

		else 

			return isPalindrome1(s.substring(1,s.length()-1)); 

	}

		//Recursion and string building 1 

		
		
		
		
		
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int ans1 = sum(5); 

		System.out.println(ans1); 

		

		ans1 = sumOfSquares(5); 

		System.out.println(ans1);

		

		ans1 = factorial(5); 

		System.out.println(ans1);

		

		String s = "121"; 

		System.out.println(isPalindrome1(s));

		System.out.println(isPalindrome2(s,0,2)); 

		System.out.println(isPalindrome3(s,0,s.length())); 

		

		

		int[]a = {1,2,3,4,5,6,7,8,9, 10}; 

		reverseArray(a,0,a.length-1); 

		//for(int i=0; i<a.length; i++)
		//	System.out.println();
		
		
		System.out.println(fibonacci(5));

		
		
		String Str ="I have not yet begun to fight";  

		System.out.println(StringBuilder_1(Str)); 

		}
}

