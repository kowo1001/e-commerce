package sale.domain;

public class Coffee {
	private String coffee_name;
	private String coffee_origin;
	private int coffee_price;

	Coffee() {
	}

	public Coffee(String t, String o, int p) {
		coffee_name = t;
		coffee_origin = o;
		coffee_price = p;
	}

	
	public String getCoffee_name() {
		return coffee_name;
	}

	public void setCoffee_name(String coffee_name) {
		this.coffee_name = coffee_name;
	}

	public String getCoffee_origin() {
		return coffee_origin;
	}

	public void setCoffee_origin(String coffee_origin) {
		this.coffee_origin = coffee_origin;
	}

	public int getCoffee_price() {
		return coffee_price;
	}

	public void setCoffee_price(int coffee_price) {
		this.coffee_price = coffee_price;
	}

	public String toString() {
		return "이름: " + coffee_name + "\n" + "원두: " + coffee_origin + "\n" + "가격: " + coffee_price + "원";

	}
}