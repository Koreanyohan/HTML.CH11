package object;

public class Ex04 {

	public static void main(String[] args) {
		
		Book book = new Book(200, "개미");
		
		System.out.println(book.toString());
		System.out.println(book); // 자바에서는 참조변수 출력하면 참조변수.toString() 출력.
	}
}

class Book {
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

//	@Override
//	public String toString() {
//		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
//	}
}

