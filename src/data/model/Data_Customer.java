package data.model;

public class Data_Customer {
	//��� ����
	private String id; //���̵�
	private String password; //��й�ȣ
	
	//�������� ������ �ʾ����� �ڵ� ������ �ڵ�
	public Data_Customer(){} 
	
	public Data_Customer(String id, String password) {
		this.id = id;
		this.password = password;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", password=" + password + "]";
	}

	
}



