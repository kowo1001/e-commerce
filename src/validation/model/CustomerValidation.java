package validation.model;

public class CustomerValidation {
	
	public static String ValidationCheck(String id, String pw) {
		String userId = "playdata";
		String userPw = "0109852";
		
		if(id==null && pw==null) { //���̵�/��й�ȣ�� ��� ���� ���
			System.out.println("���̵� �Ǵ� �̸��� �ּҸ� �Է����ּ���.");
		}
//		if(id==true && pw==null) {
//			
//		}
		
		if(userId.equals(id)) {
			if(userPw.equals(pw)) { //���̵�/��й�ȣ�� ��ġ�� ���
				System.out.println("�α��� �Ǽ̽��ϴ�. �湮 �����մϴ�.^^");
			}else{
				System.out.println("���̵�/��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
		if(userId.equals(id)) {
			return "��ȿ�� id�Դϴ�";
		}else {
			return "��ȿ�� id�Դϴ�";
		}
	}
	
	
	
	public static void main(String[] args) {
//		String message = idCheck("p");
//		System.out.println(message); //��ȿ�� id
		
//		String message2 = idCheck("playdata");
//		System.out.println(message2); //��ȿ�� id
		
	}

}
