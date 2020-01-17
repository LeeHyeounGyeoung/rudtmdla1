package m_jdbc;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class MemberUpdate extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tmId;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JSeparator separator;
	private JTextField tmName;
	private JTextField trDate;
	private JComboBox tgrade;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberUpdate frame = new MemberUpdate();
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
	public MemberUpdate() {
		super("학생 정보 수정", false, true, true, true);
		setVisible(true);
		
		setBounds(100, 100, 297, 301);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTmId());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getSeparator());
		getContentPane().add(getTmName());
		getContentPane().add(getTrDate());
		getContentPane().add(getTgrade());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uC0DD \uC815\uBCF4 \uC218\uC815");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(SystemColor.inactiveCaption);
			lblNewLabel.setBounds(12, 10, 257, 45);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(12, 68, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(81, 65, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uD559\uC0DD\uBA85 ");
			lblNewLabel_2.setBounds(12, 105, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uD559\uC77C");
			lblNewLabel_3.setBounds(12, 130, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD559\uB144");
			lblNewLabel_4.setBounds(12, 155, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(SystemColor.inactiveCaption);
			separator.setBackground(SystemColor.inactiveCaption);
			separator.setBounds(12, 93, 257, 2);
		}
		return separator;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setBounds(81, 102, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(81, 127, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
	private JComboBox getTgrade() {
		if (tgrade == null) {
			tgrade = new JComboBox();
			tgrade.setBounds(81, 152, 85, 21);
			
			tgrade.addItem("1학년");
			tgrade.addItem("2학년");
			tgrade.addItem("3학년");
			tgrade.addItem("4학년");
			tgrade.addItem("5학년");
			tgrade.addItem("6학년");
			tgrade.addItem("7학년");
			tgrade.addItem("8학년");
			tgrade.addItem("9학년");
			tgrade.addItem("10학년");
		}
		return tgrade;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String mId = tmId.getText();
					MemberDao dao = new MemberDao();
					MemberVo vo = dao.search(mId);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					
					status.setBackground(Color.BLUE);	
					status.setText("학생 정보가 검색되었습니다.");
					
					tmName.setText(vo.getmName());
					trDate.setText(sdf.format(vo.getrDate()));
					tgrade.setSelectedIndex(vo.getGrade()-1);
				}
			});
			btnNewButton.setBackground(SystemColor.inactiveCaption);
			btnNewButton.setBounds(209, 65, 60, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberDao dao = new MemberDao();
					 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					 MemberVo vo = new MemberVo();
					 Date d;
					 try{
					 d = sdf.parse(trDate.getText());
					 
					 vo.setmId(tmId.getText());
					 vo.setmName(tmName.getText());
					 vo.setrDate(d);
					 vo.setGrade(tgrade.getSelectedIndex()+1);
			
					int cnt = dao.update(vo);
					
					if(cnt>0) {
						status.setText("정상적으로 수정됨.");
					}else {	
						status.setText("수정 중 오류가 발생되었습니다.");				
					}
						
					}catch(Exception ex) {
						ex.printStackTrace();
					}
					
				}
			});
			btnNewButton_1.setBackground(SystemColor.inactiveCaption);
			btnNewButton_1.setBounds(68, 193, 97, 33);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC218\uC815\uD560 \uC544\uC774\uB514\uB97C \uAC80\uC0C9\uD558\uC138\uC694");
			status.setForeground(Color.WHITE);
			status.setOpaque(true);
			status.setBackground(SystemColor.inactiveCaption);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 242, 257, 21);
		}
		return status;
	}
}
