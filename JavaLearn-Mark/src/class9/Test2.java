package class9;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner console = new Scanner(System.in);
		System.out.println(swapPairs("good morning"));

	}
	
	public static String swapPairs(String str) {
		 int number= str.length()-1;
		 String answer="";
		 while(number>1) {
		  int i = 0;
		  int j = 1;
		  char firstLetter = str.charAt(i);
		  System.out.println(firstLetter);
		  char secondLetter = str.charAt(j);
		  System.out.println(secondLetter);
		  answer = ""+ firstLetter + secondLetter + answer;
		  System.out.println(answer);
		  i = i + 2;
		  j = j + 2;
		  number = number - 2;
		 }
		 return answer;
		}


}
