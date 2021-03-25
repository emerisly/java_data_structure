package rmit;

import java.util.Scanner;

public class stringLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String title = bookList[i].title;
		String title = "Absolute Java (Savitch)";
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What book do you want: ");
		String bookWanted = myScanner.nextLine();
		
		
		//bookName.title.startWith(bookWanted)
		//title.startWith(bookWanted)
		
		String newTitle = title.toLowerCase();
		//System.out.println(newTitle);
		String newBookWanted = bookWanted.toLowerCase();
		//System.out.println(newBookWanted);
		
		if(newTitle.startsWith(newBookWanted)) {
			System.out.println("Yes, we have the book: "+title);
		}else {
			System.out.println("Hum we don't have the book starts with "+bookWanted);
		}
		

	}

}
