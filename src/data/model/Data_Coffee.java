
package data.model;

import sale.domain.Coffee;

public class Data_Coffee {
	public static Coffee[] getCoffees() {
		Coffee[] all = { new Coffee("돌체 라떼", "콜롬비아", 7000),
				new Coffee("더블 샷 마끼아또", "파라과이", 6500),
				new Coffee("에스프레소 프라푸치노", "케냐", 9000) };
		return all;
	}
}
