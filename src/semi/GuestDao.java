package semi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import m_jdbc.DBconn;

public class GuestDao {
	Connection conn;

	public GuestDao() {
		conn = DBconn.getConn();
	}

	public List<GuestVo> select(String find) { //select메소드를 사용하여 조회부분 작성
		List<GuestVo> list = new ArrayList<GuestVo>();

		String sql = " select * from Book " + " where mName like ? or author like ?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + find + "%");

			ps.setString(2, "%" + find + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String mName = rs.getString("bookname");
				String author = rs.getString("author");
				String company = rs.getNString("publishing");
				int ea = rs.getInt("count");
				int price = rs.getInt("price");
				GuestVo vo = new GuestVo(mName, author, company, ea, price);
				list.add(vo);
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception ex) {

		} finally {
			return list;
		}

	}

}
