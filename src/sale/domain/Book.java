package sale.domain;

public class Book {
	String book_name; //책이름
	String book_publisher; //책 출판사
	int book_price; //책 가격 3 
	
	public Book(){}
	
	public Book(String book_name,String book_publisher, int book_price) {
		this.book_name = book_name;
		this.book_publisher = book_publisher;
		this.book_price = book_price;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_publisher() {
		return book_publisher;
	}

	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
}
