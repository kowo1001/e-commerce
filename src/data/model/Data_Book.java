package data.model;

//model package�� ������ ��� Ŭ������ ���� �ݵ�� import ���� �ʼ�
import sale.domain.Book;

public class Data_Book {

	
	
	//? �ΰ� �̻��� å ������ ��ȯ�ϴ� �޼ҵ� ����
	//? �� �޼ҵ��� �������� �ܼ�â�� ���
	public static Book[] getBooks(){
		Book [] all = {new Book("�ڹ� �Թ�","���� ���ǻ�",17500),
					   new Book("���̽� ö�� �Թ�","��Ű�Ͻ�",27000),
					   new Book("�عٴں��� �����ϴ� ������","�Ѻ��̵��",21600)};
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

