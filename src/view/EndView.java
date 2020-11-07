package view;

import sale.domain.Book;
import sale.domain.Clothing;
import sale.domain.Coffee;
import sale.domain.Food;

public class EndView {
	//Book 객체 받아서 출력만 담당
	public static void printBook(Book b) {
		System.out.println(b.toString());
	}
	
	public static void printBooks(Book[] books) {
		for(int i=0; i< books.length; i++) {
			System.out.println(books[i].toString());
		}
	}
	
	public static void printCoffees(Coffee [] all) {
		for(int i=0; i <all.length; i++) {
			System.out.println(all[i].getCoffee_name() + all[i].getCoffee_origin() + all[i].getCoffee_price());
		}
	}
	
	public static void printFoods(Food[] foods) {
		for (int i = 0; i< foods.length; i++) {
			System.out.println("메뉴: " + foods[i].getFood_menu() + " / " + "유통기한 : " + foods[i].getFood_expDate() + " / " + "가격 : " + foods[i].getFood_price() + "원");
		}
	}
	
//	public class EndView {
//		public void searchclothes(clothes c) {
//			System.out.println(c.toString());
//		}

		public static void printclothes(Clothing[] clothes) {
			for(int i =0;i<clothes.length;i++) {
				System.out.println(clothes[i].getClothing_name() + clothes[i].getClothing_gender() + clothes[i].getClothing_price());
			}
		}
}

