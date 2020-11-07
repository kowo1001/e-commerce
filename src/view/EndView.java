package view;

import sale.domain.Book;
import sale.domain.Clothing;
import sale.domain.Coffee;
import sale.domain.Food;

public class EndView {
	//객체 받아서 출력만 담당
	public static void printBooks(Book[] books) {
		for(int i=0; i< books.length; i++) {
			System.out.println("도서: " + books[i].getBook_name() + " / " + "출판사 : " + books[i].getBook_publisher() + " / " + "가격 : " + books[i].getBook_price()+ "원");
		}
	}

	public static void printCoffees(Coffee [] all) {
		for(int i=0; i <all.length; i++) {
			System.out.println("커피: " + all[i].getCoffee_name() +" / "+ "원산지 : " + all[i].getCoffee_origin() +" / "+ "가격 : "  + all[i].getCoffee_price() + "원");
		}
	}
	
	public static void printFoods(Food[] foods) {
		for (int i = 0; i< foods.length; i++) {
			System.out.println("음식: " + foods[i].getFood_menu() + " / " + "유통기한 : " + foods[i].getFood_expDate() + " / " + "가격 : " + foods[i].getFood_price() + "원");
		}
	}
	
//	public class EndView {
//		public void searchclothes(clothes c) {
//			System.out.println(c.toString());
//		}

		public static void printclothes(Clothing[] clothes) {
			for(int i =0;i<clothes.length;i++) {
				System.out.println("옷: " + clothes[i].getClothing_name() + " / " + "성별 : " + clothes[i].getClothing_gender() + " / " + "가격 : " + clothes[i].getClothing_price()+ "원");
			}
		}
}

