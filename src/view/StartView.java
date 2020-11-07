
package view;

import data.model.Data_Book;
import data.model.Data_Clothing;
import data.model.Data_Coffee;
import data.model.Data_Food;

public class StartView {

	public static void main(String[] args) {
		//Data data = new Data(); //getBook() 호출을 위한 객체 생성
		//ctrl +shift+o 필요없는 import 문장을 제거해주거나 객체가 있으면 객체에 맞는 import문을 가져온다.
		
//		EndView view = new EndView(); //printBook() 호출을 위한 객체 생성
		EndView.printBooks(Data_Book.getBooks());
		EndView.printCoffees(Data_Coffee.getCoffees());
		EndView.printFoods(Data_Food.getFood());
		EndView.printclothes(Data_Clothing.getClothes());
		
		
	}

}
