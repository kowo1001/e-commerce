package data.model;

import sale.domain.Clothing;

public class Data_Clothing {
	public static Clothing[] getClothes() {
		Clothing[] all = {new Clothing("정장", "female", 160000),
				 		new Clothing("원피스", "female", 18000),
				 		new Clothing("세미슈트", "male", 110000)};
			return all ;
	}
}