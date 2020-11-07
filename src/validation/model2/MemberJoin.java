//회원가입
//비번 입력해서 저장

package validation.model2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberJoin {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		File file = new File("C:\\Users\\LG\\Desktop\\MemberDB.txt");
		try {
			FileWriter filewriter = new FileWriter(file, true); //file에 이어쓰기
			if(file.isFile() && file.canWrite()) { //파일이 있고 파일을 쓸 수 있다면
				System.out.println("회원가입을 위해 ID와 비밀번호를 입력하세요.");
				System.out.print("ID 입력 : ");
				filewriter.append(scan.nextLine()); //엔터를 칠때까지 텍스트를 입력할 수 있게, 사용자가 입력한 내용을 파일에 추가해준다
				filewriter.append("\t");
				System.out.print("비밀번호 입력 : ");
				filewriter.append(scan.nextLine());
				filewriter.append("\r"); //다음 사람이 추가될 수 있도록 개행문자 
				System.out.println("회원가입이 완료되었습니다.");
			}
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
