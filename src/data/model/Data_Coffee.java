
package data.model;

import sale.domain.Coffee;

public class Data_Coffee {
	public static Coffee[] getCoffees() {
		Coffee[] all = { new Coffee("��ü ��", "�ݷҺ��", 7000),
				new Coffee("���� �� �����ƶ�", "�Ķ����", 6500),
				new Coffee("���������� ����Ǫġ��", "�ɳ�", 9000) };
		return all;
	}
}
