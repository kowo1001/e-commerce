package data.model;

import sale.domain.Clothing;

public class Data_Clothing {
	public static Clothing[] getClothes() {
		Clothing[] all = {new Clothing("����", "female", 160000),
				 		new Clothing("���ǽ�", "female", 18000),
				 		new Clothing("���̽�Ʈ", "male", 110000)};
			return all ;
	}
}