package objectLearn;

public class Name {
	String bookTitle;
	String author;
	
	public Name(String bt, String au) {
		bookTitle=bt;
		author=au;
	}
	
	public Name() {
		this("N/A","N/A");
	}
	
	//getter+setter
	public String getFirstName() {
		return bookTitle;
	}
	
	public String toString() {
		return bookTitle+" "+author;
	}
	
}
