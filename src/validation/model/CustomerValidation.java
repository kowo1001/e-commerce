package validation.model;

public class CustomerValidation {
	
	public static String ValidationCheck(String id, String pw) {
		String userId = "playdata";
		String userPw = "0109852";
		
		if(id==null && pw==null) { //아이디/비밀번호가 모두 빈값인 경우
			System.out.println("아이디 또는 이메일 주소를 입력해주세요.");
		}
//		if(id==true && pw==null) {
//			
//		}
		
		if(userId.equals(id)) {
			if(userPw.equals(pw)) { //아이디/비밀번호가 일치한 경우
				System.out.println("로그인 되셨습니다. 방문 감사합니다.^^");
			}else{
				System.out.println("아이디/비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			}
		}
		
		if(userId.equals(id)) {
			return "유효한 id입니다";
		}else {
			return "무효한 id입니다";
		}
	}
	
	
	
	public static void main(String[] args) {
//		String message = idCheck("p");
//		System.out.println(message); //무효한 id
		
//		String message2 = idCheck("playdata");
//		System.out.println(message2); //유효한 id
		
	}

}
