package recursion;

public class fibonacciRec1
{
	public static void main(String[] arg) {
		String a="racecar";
		System.out.println(isPalendrome3(a,0,a.length()-1));
	}
	public static int sum1(int n) {
		//pre:n is a positive integer
		//post:return the sum of the n positive integer
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static int sum2(int n) {
		if(n<=1)
			return 1;
		else
			return n+sum2(n-1);
	}
	public static int factorial(int n) {
		//pre:n is >=0
		//post:return n!
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static boolean isPalindrome1(String s) {
		if(s.length()<=1)
			return true;
		else if(s.charAt(0)!=s.charAt(s.length()-1))
			return false;
		else
			return isPalindrome1(s.substring(1,s.length()-1));
	}
	public static boolean isPalindrome2(String s,int i,int j){
		if(i>=j)
			return true;
		else if(s.charAt(i)!=s.charAt(j))
			return false;
		else
			return isPalindrome2(s,i++,j--);
	}
	public static boolean isPalendrome3(String s, int i,int j) {
		String a=s.substring(i,i+1);
		String b=s.substring(j,j+1);
		if(i>=j)
			return true;
		else if(!a.equals(b)) {
			//System.out.println(s.substring(i,i+1)+" "+s.substring(j,j+1));
			//System.out.println(i+" "+j);
			return false;
		}
		else {
			//System.out.println(i+" "+j);
			return isPalendrome3(s,++i,--j);
		}
	}
	
	public static int[] fibArray=new int[17];
	public static int fibDynamic(int n) {
		if(fibArray[n]!=0) {
			return fibArray[n];
		}
		else if(n<=1) {
			fibArray[n]=1;
			return 1;
		}
		else {
			int num=fibDynamic(n-1)+fibDynamic(n-2);
			fibArray[n]=num;
			return num;
		}
	}
	
	
  public static int fibonacciRec1(int n)
  {
      if (n==1){
          return 1;
      }
      else{
          return (fibonacciRec1(n+(n-1)));
      }
  }
  public static int fiblinearRec(int a, int b, int n)
  {
      if (n==1){
          return a;
      }
      else if(n==2){
          return b;
      }
      else{
          return fiblinearRec(b,a+b,n-1);
      }
  }
}


