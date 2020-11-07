package data.model;

import sale.domain.Clothing;

public class Data_Clothing {
	public static Clothing[] getClothes() {
		Clothing[] all = {new Clothing("suit", "female", 160000),
				 		new Clothing("accessory", "female", 18000),
				 		new Clothing("semi suit", "male", 110000)};
			return all ;
	}
}