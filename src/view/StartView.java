
package view;

import data.model.Data_Book;
import data.model.Data_Clothing;
import data.model.Data_Coffee;
import data.model.Data_Food;

public class StartView {

	public static void main(String[] args) {
		//Data data = new Data(); //getBook() ȣ���� ���� ��ü ����
		//ctrl +shift+o �ʿ���� import ������ �������ְų� ��ü�� ������ ��ü�� �´� import���� �����´�.
		
//		EndView view = new EndView(); //printBook() ȣ���� ���� ��ü ����
		EndView.printBooks(Data_Book.getBooks());
		EndView.printCoffees(Data_Coffee.getCoffees());
		EndView.printFoods(Data_Food.getFood());
		EndView.printclothes(Data_Clothing.getClothes());
		
		
	}

}
