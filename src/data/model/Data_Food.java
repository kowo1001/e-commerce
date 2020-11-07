
package data.model;

import sale.domain.Food;


public class Data_Food {
	public static Food [] getFood() {
		Food [] all = {new Food("갈비만두", "2020-12-25", 4500), 
					new Food("갈비찜", "2020-12-24", 16000),
					new Food("연어초밥", "2020-12-31",10000)};
		return all;
	}

}