package data.model;

public class Data_Customer {
	//멤버 변수
	private String id; //아이디
	private String password; //비밀번호
	
	//육안으로 보이진 않았으나 자동 생성된 코드
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



