package m_jdbc;

import java.security.KeyStore.ProtectionParameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoreDao {
	Connection conn;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public ScoreDao() {
		conn = DBconn.getConn();
	}
	public int Insert(ScoreVo vo) {
		int r = 0;
		try {
			String sql = "insert into score values(seq_score.nextval,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getmId());
			ps.setString(2, sdf.format(vo.getrDate()));
			ps.setString(3, vo.getSubject());
			ps.setInt(4, vo.getScore());
			conn.setAutoCommit(false);
			
			r = ps.executeUpdate();
			if(r>0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			ps.close();
			conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}
	public int delete(int serial) {
		int r = 0;
		try {
			String sql = "delete from score where serial=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, serial);
			
			r = ps.executeUpdate();
			conn.setAutoCommit(false);
			if(r>0) {
				conn.commit();
			}else {
				conn.rollback();
			}

		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}
	public ScoreVo search(int serial) {
		ScoreVo vo = null;
		try {
			String sql = "select S.serial, S.mId, S.rDate, S.subject, S.score, M.mName from score S join mMember M on S.mId = M.mId  where s.serial = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, serial);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo = new ScoreVo();
				vo.setmId(rs.getString("mId"));
				vo.setrDate(rs.getDate("rDate"));
				vo.setSubject(rs.getString("subject"));
				vo.setScore(rs.getInt("score"));
				vo.setmName(rs.getString("mName"));
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return vo;
		}
	}
	public int update(ScoreVo vo) {
		int r = 0;
		try { // 아이디, 성명, 응시일, 과목, 점수
			String sql = "update score set  rDate=?, subject=?, score=? where serial=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, sdf.format(vo.getrDate()));
			ps.setString(2, vo.getSubject());
			ps.setInt(3, vo.getScore());
			ps.setInt(4, vo.getSerial());
			
			r = ps.executeUpdate();
			conn.setAutoCommit(false);
			if(r>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}
	public List<ScoreVo> select(String find){
		List<ScoreVo> list = new ArrayList<ScoreVo>();
		try {
			String sql = "select S.serial, M.mId, M.mName, S.rDate, S.subject, S.score " + 
							 " from mMember M left outer join score S " + 
							 " on M.mId = S.mId " + 
							 " where M.mId like ? or S.subject like ? or M.mName like ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + find + "%");
			ps.setString(2, "%" + find + "%");
			ps.setString(3, "%" + find + "%");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				ScoreVo vo = new ScoreVo();
				vo.setSerial(rs.getInt("serial"));
				vo.setmId(rs.getString("mId"));
				vo.setmName(rs.getString("mName"));
				vo.setrDate(rs.getDate("rDate"));
				vo.setSubject(rs.getString("subject"));
				vo.setScore(rs.getInt("score"));
				
				list.add(vo);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return list;
		}
	}
}
