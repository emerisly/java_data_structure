package V3;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	
	public static Book[] bookList = new Book[5];
    public static double totalPrice = 0;
    public static int bookInCart = -1;
    public static int isPhysical = 0;
	
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
		
		Book book0 = new Book("Absolute Java","Savitch",5,true);
		bookList[0]=book0;
		Book book1 = new Book("JAVA: How to Program","Deitel and Deitel",0,true);
		bookList[1]=book1;
		Book book2 = new Book("Computing Concepts with JAVA 8 Essentials","Horstman",5,false);
		bookList[2]=book2;
		Book book3 = new Book("Java Software Solutions","Lewis and Loftus",5,false);
		bookList[3]=book3;
		Book book4 = new Book("Java Program Design","Cohoon and Davidson",1,true);
		bookList[4]=book4;
		
        System.out.println("Welcome to Daintree!");
        int input = 1;
        
        while(input != 0) {
        	System.out.println();
        	System.out.println("Choose an option:");
        	System.out.println("1. Add a book to shopping cart");
        	System.out.println("2. View shopping cart");
        	System.out.println("3. Remove a book from shopping cart");
        	System.out.println("4. Checkout");
        	System.out.println("5. List all books");
        	System.out.println("0. Quit");
        	System.out.println("Please make a selection: ");
        
        	int option;
        	option = myScanner.nextInt();
        
        	if (option == 0) input = 0;
        	else if (option == 1) addBook();
        	else if (option == 2) viewCart();
        	else if (option == 3) removeBook();
        	else if (option == 4) checkout();
        	else if (option == 5) listBook();
        	else System.out.println("Sorry, that is an invalid option!");
        }
        
        System.out.println("Goodbye!");
        
        
    }

	public static int addBook() {
		System.out.println("Enter title to search for: ");
		Scanner name = new Scanner(System.in);
		String bookName = name.nextLine();
		String newBookName = bookName.toLowerCase();
		System.out.println(newBookName);
		int i=0;
		for(i=0;i<=4;i++) {
			String newBookList = bookList[i].title.toLowerCase();
			if(newBookList.startsWith(newBookName)) {
				System.out.println("The Following Title is a match:");
				System.out.println("1. " + bookList[i].title + " -- " +bookList[i].author);
				System.out.println("0. cancel");
				System.out.println("What is your selection:");
				Scanner myScanner = new Scanner(System.in);
				int selection1 = myScanner.nextInt();
				//if choose to buy book
				if (selection1 == 1) {
					System.out.println("Do you want to buy this as an ebook: ");
					String selection2 = myScanner.next();
					//if choose to buy ebook
					if (selection2.toLowerCase().equals("yes")) {
						//if has ebook
						if(bookList[i].eBook) {
							System.out.println("\""+bookList[i].title+"\" has been added to your Cart");
							bookInCart = i;
							totalPrice = 8;
							isPhysical = 0;
						}
						//if no ebook
						else {
							System.out.println("There are no eBook of that book available!");
						}
					}
					//if choose to buy physical
					else if(selection2.toLowerCase().equals("no")) {
						//if has copies
						if(bookList[i].copy>0) {
							System.out.println("\""+bookList[i].title+"\" has been added to your Cart");
							bookInCart = i;
							totalPrice = 50;
							isPhysical = 1;
						
						}
						//if has no copies
						else {
							System.out.println("There are no physical copies of that book available!");
						}
					}
					else {
						System.out.println("Sorry, that is an invalid option!");
					}
				}
				//if choose cancel
				else if(selection1 == 0) {
					return 0;
				}
				//invalid
				else {
					System.out.println("Sorry, that is an invalid option!");
				}
				return 0;
			}
		}
		System.out.println("There is no title starting with that");
		return 0;
	}
	
	public static int viewCart() {
		if (bookInCart <0) {
			System.out.println("There is no book in your cart.");
		}
		else {
			System.out.println("Shopping Cart contains the following:");
			System.out.println("1. " + bookList[bookInCart].title);
		}
		return 0;
		
	}
	
	public static int removeBook() {
		if (bookInCart <0) {
			System.out.println("There is no book in your cart.");
			return 0;
		}
		System.out.println("Your Shopping Cart Contains the following:");
		System.out.println("1. " + bookList[bookInCart].title);
		System.out.println("0. cancel");
		System.out.println("What do you want to remove: ");
		Scanner myScanner = new Scanner(System.in);
		int remove = myScanner.nextInt();
		if (remove == 1) {
			bookInCart = -1;
			totalPrice= 0;
			isPhysical = 0;
		}
		else if (remove == 0) {
			return 0;
		}
		else {
			System.out.println("Sorry, that is an invalid option!");
		}
		return 0;
	}
	
	public static int checkout() {
		System.out.println("You have purchased item to the total value of $"+ totalPrice);
		System.out.println("Thanks for shopping with Daintree!");
		if(isPhysical>0) bookList[bookInCart].copy--;
		return 0;
	}
	
	public static int listBook() {
		System.out.println("The following titles are avaliable:");
		for(int i = 0;i <= 4; i++) {
			System.out.println((i+1)+". "+bookList[i]);
		}
		return 0;
	}
	
}