package member;

public class MemberDTO {

	private String id;
	private String pw;
	private String nickName;
	private String badge;
	
	public MemberDTO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.nickName = name;
	}

	
	
	
	public MemberDTO(String badge) {
		this.badge = badge;
	}




	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}


	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNicName() {
		return nickName;
	}

	
	
	
	
	
	
	
	
}
