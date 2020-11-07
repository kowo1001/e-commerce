
package sale.domain;

public class Clothing {
	String Clothing_name; 
	String Clothing_gender; 
	int Clothing_price;
	
	
	public Clothing(String x, String y, int z){
		Clothing_name = x;
		Clothing_gender = y;
		Clothing_price = z;	
	}

	
	public String getClothing_name() {
		return Clothing_name;
	}
	public void setClothing_name(String Clothing_name) {
		this.Clothing_name = Clothing_name;
	}
	public String getClothing_gender() {
		return Clothing_gender;
	}
	public void setClothing_gender(String Clothing_gender) {
		this.Clothing_gender = Clothing_gender;
	}
	public int getClothing_price() {
		return Clothing_price;
	}

	public void setClothing_price(int Clothing_price) {
		if(Clothing_price >= 10000 && Clothing_price <= 20000) {
			this.Clothing_price = Clothing_price;
			System.out.println("accessory");
		}else if(Clothing_price > 20000 && Clothing_price <= 60000) {
			this.Clothing_price = Clothing_price;
			System.out.println("casual look");
		}else if(Clothing_price > 60000 && Clothing_price <= 120000) {
			System.out.println("semi suit");
		}else if(Clothing_price > 120000 && Clothing_price <= 200000) {
			System.out.println("suit");
		}else {
			System.out.println("해당 의류는 입고되지 않았습니다.");
		}
	}

	public String toString() {
		return Clothing_name + " " + Clothing_gender + " " + Clothing_price;
	}
}

