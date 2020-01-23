package semi;

import java.util.Date;

public class UserVo {
	int    serial;	//시리얼번호
	String cId;		//아이디
	String cPwd;	//패스워드
	String cEmail;	//이메일
	Date   cBirth;	//생년월일
	String cPhone;	//핸드폰번호
	String cGender;	//성별
	Date   cDate;	//가입날짜
	String is_Admin;//관리자체크
	String cName;	//이름
	

	
	public UserVo() {
		
	}
	//회원 아이디 패스워드 찾기를 위한 생성자
	public UserVo(String cName,String cEmail , String cPhone) {
		this.cName = cName;
		this.cEmail = cEmail;
		this.cPhone = cPhone;
	}
	
	
	//회원 가입이 아이디 중복조회 용 생성자
	public UserVo(String cId) {
		this.cId = cId;
	}
	//회원 아이디비밀번호 조회용 생성자 + 회원 아이디 패스워드찾기를 위한 생성자
	public UserVo(String cId,String cPwd) {
		this.cId = cId;
		this.cPwd = cPwd;
	}
	//회원 가입용 생성자
	public UserVo(int serial, String cId, String cPwd, String cEmail, Date cBirth,String cPhone,String cGender,Date cDate,String is_Admin,String cName) {
		this.serial = serial;
		this.is_Admin = is_Admin;
		this.cId = cId;
		this.cPwd = cPwd;
		this.cName = cName;
		this.cPhone = cPhone;
		this.cBirth = cBirth;
		this.cEmail = cEmail;
		this.cGender = cGender;
		this.cDate = cDate;
	}
	public String toString() {
		String temp = String.format("%15s\t%15s\n", cId , cPwd);
		return temp;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getIs_Admin() {
		return is_Admin;
	}
	public void setIs_Admin(String is_Admin) {
		this.is_Admin = is_Admin;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcPwd() {
		return cPwd;
	}
	public void setcPwd(String cPwd) {
		this.cPwd = cPwd;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	public Date getcBirth() {
		return cBirth;
	}
	public void setcBirth(Date cBirth) {
		this.cBirth = cBirth;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getcGender() {
		return cGender;
	}
	public void setcGender(String cGender) {
		this.cGender = cGender;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
}
