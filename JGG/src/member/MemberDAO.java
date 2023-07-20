package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	MemberDTO dto = null;
	int cnt = 0;
	String data = "";

	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String db_id = "campus_e_0718_2";
			String db_pw = "smhrd2";

			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩 실패!(OracleDriver 클래스를 못 찾았습니다)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getClose() {

		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
		}

	}

	public int IdCheck(MemberDTO dto) {

		try {

			getCon();

			String sql = "select* from signin where id = ? ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId()); 

			rs = psmt.executeQuery();

			if (rs.next()) {
				cnt++;
			}
		}  catch (SQLException e) {
			System.out.println("SQL오류!");
		} finally {
			
			getClose();

		}
		return cnt;

	}
	
	
	public int insert(MemberDTO dto) {

		getCon();

		try {
			String sql = "INSERT INTO SIGNIN VALUES(?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getNicName());
			psmt.setString(4, null);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

		} finally {
			getClose();
		}
		return cnt;

	}

	public int login(MemberDTO dto) {

		try {

			getCon();

			String sql = "select* from signin where id = ? and pw = ? ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId()); 
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();

			if (rs.next()) {
				return cnt++;

			}
		}  catch (SQLException e) {
			System.out.println("SQL오류!");
		} finally {
			
			getClose();

		}
		return cnt;

	}

	public String badge(MemberDTO dto) {

		try {

			getCon();

			String sql = "select* from signin where id = ? ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId()); 

			rs = psmt.executeQuery();

			if (rs.next()) {
				String badge = rs.getString("badge");
				data += badge;
				return data;

			}
		}  catch (SQLException e) {
			System.out.println("SQL오류!");
		} finally {
			
			getClose();

		}
		return data;

	}
	
	public int badgeUpdate(MemberDTO dto) {

		getCon();

		try {
			String sql = "UPDATE SIGNIN SET BADGE = ? WHERE ID = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, "심부름배지");
			psmt.setString(2, dto.getId());
			
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

		} finally {
			getClose();
		}
		return cnt;

	}
	
	
}

