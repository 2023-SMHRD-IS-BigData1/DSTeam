package member;

import java.util.Scanner;


public class SignIn {

	String member;
	Scanner sc = new Scanner(System.in);
		Controller con = new Controller();

		// 회원가입
	public void signIn() {
		
		MemberDTO dto = new MemberDTO(null, null, null);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("NICKNAME : ");
		String nickName = sc.next();
		
		dto = new MemberDTO(id, pw, nickName);
			con.insert(dto);
		
	}
	

	

	// 회원가입시 중복 아이디 체크
	public void IdCheck() {
		
		MemberDTO dto = new MemberDTO(null, null);
		System.out.print("ID : ");
		String id = sc.next();
		
		dto = new MemberDTO(id, null);
		con.IdCheck(dto);
	
	}
	
	
}
