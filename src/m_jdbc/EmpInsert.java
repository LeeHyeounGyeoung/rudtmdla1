package m_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpInsert {
	public EmpInsert() throws Exception{
		Connection conn = DBconn.getConn();
		
		String sql = "insert into emp1(employee_id, last_name, hire_date, salary, job_id, email)"
							+ " values(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 500);
		pstmt.setString(2, "hong");
		pstmt.setString(3, "2020-01-15");
		pstmt.setInt(4, 10000);
		pstmt.setInt(5, 100);
		pstmt.setString(6, "HONG");
		
		conn.setAutoCommit(false);
		int cnt = pstmt.executeUpdate(); // 사전에 미리 설정
		if(cnt>0) {
			conn.commit();
			System.out.println("정상 입력");
		} else {
			conn.rollback();
			System.out.println("입력중 오류");
		}
		pstmt.close();
		conn.close();
	}
	public static void main(String[] args) throws Exception{
		new EmpInsert();

	}

}
