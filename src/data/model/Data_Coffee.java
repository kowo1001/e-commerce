
package data.model;

import sale.domain.Coffee;

public class Data_Coffee {
	public static Coffee[] getCoffees() {
		Coffee[] all = { new Coffee("Dolce Latte", "Columbia", 7000),
				new Coffee("Double Shot Macchiato", "Paraguay", 6500),
				new Coffee("Blonde Espresso Frappuchino", "South Korea", 9000) };
		return all;
	}
}
