
package validation.model;

import validation.model.CustomerLogin;

public class CustomerException {
	
	public static void main(String[] args) { 
		try {
			boolean loginResult = login("이정민", "D4567");
			
			if (loginResult) System.out.println("로그인 되었습니다.");
			
		}catch (Exception e) {
			System.out.println("Error message");
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("마켓 메인화면 바로가기");
		}
	}
	static boolean login(String id, String password) throws Exception {
		
		boolean wrongId = false;
		boolean wrongPassword = false;
		
		if(wrongId) throw new Exception ("아이디가 잘못되었습니다.");
		else if(wrongPassword) throw new Exception ("비밀번호가 잘못되었습니다.");
		
		return true;
		
	}
		
}

