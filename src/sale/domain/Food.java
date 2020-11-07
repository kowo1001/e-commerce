package sale.domain;

public class Food {

	private String food_menu;
	private String food_expDate;
	private int food_price;
	
	public Food() {}
	public Food(String food_menu, String food_expDate, int food_price ) {
			this.food_menu = food_menu;
			this.food_expDate = food_expDate;
			this.food_price = food_price;
	}
	public String getFood_menu() {
		return food_menu;
	}
	public void setFood_menu(String food_menu) {
		this.food_menu = food_menu;
	}
	public String getFood_expDate() {
		return food_expDate;
	}
	public void setFood_expDate(String food_expDate) {
		this.food_expDate = food_expDate;
	}
	public int getFood_price() {
		return food_price;
	}
	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}
	public String toString() {
		return "메뉴 : " + food_menu + "\n"   + "유통기한 : " + food_expDate + "가격 : "+ "\n" + food_price;
	}
}

