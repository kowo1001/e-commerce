package data.model;

//model package를 제외한 모든 클래스들 사용시 반드시 import 문장 필수
import sale.domain.Book;

public class Data_Book {

	
	
	//? 두개 이상의 책 정보를 반환하는 메소드 구현
	//? 이 메소드의 실행결과는 콘솔창에 출력
	public static Book[] getBooks(){
		Book [] all = {new Book("자바 입문","생능 출판사",17500),
					   new Book("파이썬 철저 입문","위키북스",27000),
					   new Book("밑바닥부터 시작하는 딥러닝","한빛미디어",21600)};
		return all;
	}

	static void printAll(Book [] all) {
		for(int i=0;i<all.length;i++) 
			System.out.println(all[i]);
	}
	
	public static void main(String[] args) {
		Book[] c = getBooks();
		printAll(c);
	}
}

