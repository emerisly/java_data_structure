package V4;

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
	
	//toString methods
	public String toString() {
		String s = eBook ? "ebook available":"no ebook";
		return title+", "+ copy +" copies, "+ s;
	}
	
}