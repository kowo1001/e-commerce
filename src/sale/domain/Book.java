package sale.domain;

public class Book {
	String book_name; //å�̸�
	String book_publisher; //å ���ǻ�
	int book_price; //å ���� 3 
	
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
	public String toString() {
		return "Book [bookname=" + book_name + ", book_publisher=" + book_publisher + ", book_price=" + book_price + "]";
	}
}
