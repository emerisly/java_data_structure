package V2;

//define Book object
public class Book {
	
	//field
	String title;
	String author;
	int copy;
	boolean eBook;
	
	
	//constructor
	public Book(String t,String a,int c,boolean p) {
		title=t;
		author=a;
		copy=c;
		eBook=p;
	}
}