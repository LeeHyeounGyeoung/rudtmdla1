package semi;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import m_jdbc.DBconn;




public class ManagerDao {
	
	Connection conn;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	ResultSetMetaData meta;
	DefaultTableModel model;
	Vector row ;
	public ManagerDao() {
		conn = DBconn.getConn();
	}

	public ManagerDao(Vector row,DefaultTableModel model) {
		this();
		this.row=row;
		this.model=model;
	}
	public char insert(ManagerVo vo) {//FirstFrame_1 로그인버튼 누르면 로그인
		char r=0;

		try {
			String sql = " select is_admin from member where userid =  ? and password = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getcId());
			ps.setString(2, vo.getcPwd());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				String c =rs.getString("IS_ADMIN");
				
				r=c.charAt(0);
				
				rs.close();
				ps.close();
			}else {
				r=0;
			}
		}catch (Exception ex){
			
			
		}
		
		return r;
		
	}
		
		
		
		
		

	
	
	public int update(ManagerVo vo) {//ManagerFrame의 비밀번호 수정 버튼 누르면 비밀번호 수정
		int r = 0;
		
		try {
			String sql = " update member set PASSWORD = ? where userid = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
		    ps.setString(1, vo.getcPwd());
		    ps.setString(2,vo.getcId());
		    r = ps.executeUpdate();
		    
		    
	    
	    r = ps.executeUpdate();
	    ps.close();
	    
	    if(r>0) conn.commit();
	    else conn.rollback();
		}catch(Exception ex) {
			
		}finally {

		return r;
		}
	}
	
	public void Minsert(ManagerVo vo) {//ManagerFrame의 생성버튼누르면 매니저 계정 생성
	try {
		String sql = " insert into member(userno,userid,password,email,phone,is_admin,username) values(seq_member.nextval,?,?,' ','010-1234',?,?) ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, vo.getcId());
	    ps.setString(2,vo.getcPwd());
	    ps.setString(3,String.valueOf(vo.getcCheck()));
	    ps.setString(4, vo.getcName());
		ps.executeUpdate();
		
        ps.close();
	} catch (Exception ex) {

	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	public void delete(String id){
		//ManagerFrame의 삭제 버튼 누르면 ManagerDelete 프레임이 실행되고 ManagerDelete의 로그인 버튼누르면 이 함수가 실행됨
		
		try {

			System.out.println(id);
			String sql = " delete from member where userid=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			ps.executeUpdate();
			

		} catch (Exception ex) {

		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void search(String find) {
    	
		String sql = " select * from member where userid like ? ";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + find + "%");
			
			
			
			meta = ps.getMetaData();
			model.setRowCount(0);
			
			int cnt = meta.getColumnCount();
			for(int i=1; i<=cnt; i++) {
				model.addColumn( meta.getColumnName(i));
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				row = new Vector();
				for(int i=1; i<=cnt; i++) {
					row.add(rs.getString(i));
				}
				model.addRow(row);
			}
			rs.close();
			ps.close();
            
		} catch (Exception ex) {
			
		}
			
		
		
	}
			
}			
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	


