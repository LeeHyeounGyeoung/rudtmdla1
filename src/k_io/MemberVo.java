package k_io;

import java.io.Serializable;

public class MemberVo implements Serializable{ // ����ȭ ����
	
	// ���� �ٸ� ��ǻ�Ϳ��� ������ �ϴ��� �Ʒ��� ��ȣ���� ������ ������ ��ǻ�Ϳ��� �������� ���Ϸ� �ν�
	public static long serialVersionUID = 1L;
	
	private String mId;
	private String pwd;
	private String mName;
	private String phone;
	
	public MemberVo(String mId, String pwd, String mName, String phone) {
		this.mId = mId;
		this.pwd = pwd;
		this.mName = mName;
		this.phone = phone;
	}

	@Override
	public int hashCode() {		
		return mId.hashCode() + phone.hashCode(); 
		// ���̵�� ����ó�� �����ϸ� ���� ��ü�̴�.
	   // �ٸ� ������ �ٸ���, ���̵�� ����ó�� ���ٸ� ������ ��ü��� �ν� => ���� ���ٴ� �ǹ̴� �ƴ�
	}
	
	@Override
	public boolean equals(Object obj) {	
		String find = (String)obj;
		boolean result = false;
			if(mId.indexOf(find)>=0 || mName.indexOf(find)>=0 || phone.indexOf(find)>=0) {
				result = true;						
			}
		return result;
	}
	
	@Override
	public String toString() {		
		return mId + "\t" + pwd + "\t" + mName + "\t" + phone + "\n" ; 
	}
	
	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	
}