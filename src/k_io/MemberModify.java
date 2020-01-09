//2019.12.19
package k_io;

import java.awt.EventQueue;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JSeparator;

public class MemberModify extends JInternalFrame {
	int index = -1;		
	List<MemberVo> list;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField mId;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel status;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberModify frame = new MemberModify();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberModify() {
		super("ȸ�� ����&����", false, true, true, true);
		getContentPane().setBackground(new Color(204, 204, 255));
		setVisible(true);
		setBounds(300, 100, 293, 279);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getMId());
		getContentPane().add(getPwd());
		getContentPane().add(getMName());
		getContentPane().add(getPhone());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());
		getContentPane().add(getSeparator());
		

	}
	
	public void search() { // �˻� ��ư
		index = -1;
		pwd.setText("");
		mName.setText("");
		phone.setText("");
		
		String find = mId.getText();
		MemberDao dao = new MemberDao();
		MemberVo vo = dao.search(find);
		
		if(vo != null) {
			pwd.setText(vo.getPwd());
			mName.setText(vo.getmName());
			phone.setText(vo.getPhone());
			
			status.setBackground(Color.BLUE);			
			status.setText("�ڷᰡ �˻��Ǿ����ϴ�.");
		}else {
			status.setBackground(Color.RED);
			status.setText("ã�� �ڷᰡ �����ϴ�.");
			
			mId.requestFocus();
			mId.selectAll();
		}
	}
	
	public void modify() { // ���� ��ư	
	  String id = mId.getText();
	  String p = pwd.getText();
	  String n = mName.getText();
	  String ph = phone.getText();
	  
	  boolean flag =
				Pattern.matches(FileExam2.idCheck, id)&&
				Pattern.matches(FileExam2.pwdCheck, p)&&
				Pattern.matches(FileExam2.nameCheck, n)&&
				Pattern.matches(FileExam2.phoneCheck, ph);
	  
	  if(flag) {
		  MemberVo vo = new MemberVo(id,p,n,ph);
		  MemberDao dao = new MemberDao();
		  boolean b = dao.modify(vo);
		  if(b) {
			  status.setText("�ڷᰡ �����Ǿ����ϴ�.");		  
		  }else {
			  status.setText("������ ���� �߻�");
	        }
	  	 }else {
		     status.setText("�Է��ڷḦ Ȯ���� �ּ���.");
	  }			
	}
	
	public void delete() { // ���� ��ư
		String findMid = mId.getText();
		MemberDao dao = new MemberDao();
		boolean b = dao.delete(findMid);
		if(b) {
		status.setBackground(Color.BLUE);
		status.setText("�ڷᰡ �����Ǿ����ϴ�.");
		
		pwd.setText("");
		mName.setText("");
		phone.setText("");
		
		mId.requestFocus();
		mId.selectAll();
		} else {
			status.setBackground(Color.RED);
			status.setText("�ڷ� ������ �����߻�");
		}
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(102, 0, 153));
			lblNewLabel.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(204, 204, 255));
			lblNewLabel.setBounds(12, 21, 62, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uBE44\uBC00 \uBC88\uD638");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setForeground(new Color(102, 0, 153));
			lblNewLabel_1.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setBackground(new Color(204, 204, 255));
			lblNewLabel_1.setBounds(12, 52, 62, 21);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC131\uBA85");
			lblNewLabel_2.setOpaque(true);
			lblNewLabel_2.setBackground(new Color(204, 204, 255));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setForeground(new Color(102, 0, 153));
			lblNewLabel_2.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			lblNewLabel_2.setBounds(12, 83, 62, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_3.setBackground(new Color(204, 204, 255));
			lblNewLabel_3.setForeground(new Color(102, 0, 153));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			lblNewLabel_3.setOpaque(true);
			lblNewLabel_3.setBounds(12, 114, 62, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getMId() {
		if (mId == null) {
			mId = new JTextField();
			mId.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			mId.setBounds(86, 18, 105, 21);
			mId.setColumns(10);
		}
		return mId;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			pwd.setBounds(86, 53, 105, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			mName.setBounds(86, 80, 105, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			phone.setBounds(86, 111, 145, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			btnNewButton.setBackground(new Color(153, 102, 204));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					modify();
				}
			});
			btnNewButton.setBounds(39, 147, 70, 34);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			btnNewButton_1.setBackground(new Color(153, 102, 204));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delete();
				}
			});
			btnNewButton_1.setBounds(161, 147, 70, 34);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uAC80\uC0C9");
			btnNewButton_2.setForeground(new Color(255, 255, 255));
			btnNewButton_2.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			btnNewButton_2.setBackground(new Color(153, 102, 204));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
			btnNewButton_2.setBounds(195, 17, 70, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uB370\uC774\uD130\uB97C \uAC80\uC0C9\uD558\uC138\uC694");
			status.setForeground(new Color(255, 255, 255));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setFont(new Font("Ÿ����_���� B", Font.BOLD, 18));
			status.setOpaque(true);
			status.setBackground(new Color(153, 102, 204));
			status.setBounds(12, 201, 253, 41);
		}
		return status;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(153, 102, 204));
			separator.setOpaque(true);
			separator.setBackground(new Color(153, 102, 204));
			separator.setBounds(74, 10, 4, 133);
		}
		return separator;
	}
}
