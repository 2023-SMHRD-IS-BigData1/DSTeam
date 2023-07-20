package member;

public class Controller {

	MemberDAO dao = new MemberDAO();

	int cnt = 0;
	
	public void IdCheck(MemberDTO dto) {

		int cnt = dao.IdCheck(dto);

		if (cnt > 0) {
			System.out.println("\nID가 중복됩니다. 다시 입력해주세요.");
		} 
		else {
			System.out.println("\n중복되는 ID가 없습니다. 회원가입을 진행해주세요^▽^");
			
		}
	}

	public void insert(MemberDTO dto) {

		int cnt = dao.insert(dto);

		if (cnt > 0) {
			System.out.println("\n회원가입 성공");
		} else {
			System.out.println("\n회원가입 실패");
		}

	}

	public void badge(MemberDTO dto) {

		String data = new MemberDAO().badge(dto);

		if (data.equals("null")) {
			System.out.println("\n획득한 배지가 존재하지 않습니다ಥ_ಥ");
		} else {
			System.out.println(data);
		}

	}

	public void badgeUpdate(MemberDTO dto) {
		MemberDAO dao = new MemberDAO();
		int cnt = dao.badgeUpdate(dto);

		if (cnt > 0) {
			System.out.println("\t\t\t" + "  획득한 배지가 등록되었습니다~\n");
		} else {
			System.out.println("\t\t\t" + "  배지가 등록되지 않았어요⊙﹏⊙∥\n");
		}
	}

	public int login(MemberDTO dto) {

		int cnt = dao.login(dto);

		if (cnt > 0) {
			return cnt++;
		} else {

		}
		return cnt;
	}

}