
package validation.model;

import validation.model.CustomerLogin;

public class CustomerException {
	
	public static void main(String[] args) { 
		try {
			boolean loginResult = login("������", "D4567");
			
			if (loginResult) System.out.println("�α��� �Ǿ����ϴ�.");
			
		}catch (Exception e) {
			System.out.println("Error message");
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("���� ����ȭ�� �ٷΰ���");
		}
	}
	static boolean login(String id, String password) throws Exception {
		
		boolean wrongId = false;
		boolean wrongPassword = false;
		
		if(wrongId) throw new Exception ("���̵� �߸��Ǿ����ϴ�.");
		else if(wrongPassword) throw new Exception ("��й�ȣ�� �߸��Ǿ����ϴ�.");
		
		return true;
		
	}
		
}

