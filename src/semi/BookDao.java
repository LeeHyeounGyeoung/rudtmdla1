package semi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import m_jdbc.DBconn;

public class BookDao {
	Connection conn;

	public BookDao() {
		conn = DBconn.getConn(); 
	}
		//insert 메소드를 사용하여 입력부분작성.
	public int insert(BookVo vo) { 
		int r = 0;

		try {
			String sql = "insert into Book values(seq_book.nextval,? ,? ,? ,? , ? )";//시퀀스를 사용및 값입력
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getmName());
			ps.setString(2, vo.getAuthor());
			ps.setString(3, vo.getCompany());
			ps.setInt(4, vo.getEa()); 
			ps.setInt(5, vo.getPrice());

			conn.setAutoCommit(false);

			r = ps.executeUpdate();
			if (r > 0)
				conn.commit();
			else
				conn.rollback();

			ps.close();
			conn.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			return r;
		}

	}

	// delete 메소드를 사용하여 삭제부분작성.
	public int delete(String mName) {
		int r = 0;

		try {
			String sql = "delete from Book where bookname=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mName);
			conn.setAutoCommit(false);
			r = ps.executeUpdate();
			if (r > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			ps.close();
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			return r;
		}
	}

	// search 메소드를 사용하여 검색부분작성.
	
	public BookVo search(String mName) {
		BookVo vo = new BookVo();

		String sql = "select * from Book where bookname=?"; 
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mName);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vo.setmName(rs.getString("bookname"));
				vo.setAuthor(rs.getString("author"));
				vo.setCompany(rs.getString("publishing"));
				vo.setEa(rs.getInt("count"));
				vo.setPrice(rs.getInt("price"));
			}

			rs.close(); 
			ps.close();
			conn.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			return vo;
		}
	}

	/// update메소드를 사용하여 수정부분작성.
	
	public int update(BookVo vo) {
		int r = 0;
		try {
			String sql = "update book set  author = ?, publishing = ?, count =? , price = ? " + " where bookname=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getAuthor());
			ps.setString(2, vo.getCompany());
			ps.setInt(3, vo.getEa());
			ps.setInt(4, vo.getPrice());
			ps.setString(5, vo.getmName());

			r = ps.executeUpdate();

			ps.close();
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			return r;
		}
	}

	//  select메소드를 사용하여 조회.

	public List<BookVo> select(String find) { 
		List<BookVo> list = new ArrayList<BookVo>();
	
		String sql = " select * from Book " + " where bookname like ? or author like ?";
																						
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
				BookVo vo = new BookVo(mName, author, company, ea, price);
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
