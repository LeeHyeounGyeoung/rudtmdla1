package m_jdbc;

import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberInsert extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tmId;
	private JTextField tmName;
	private JTextField trDate;
	private JComboBox tgrade;
	private JLabel status;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInsert frame = new MemberInsert();
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
	public MemberInsert() {
		super("학생 정보 입력", false, true, true, true);
		setVisible(true);
		
		setBounds(100, 100, 277, 368);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getTmId());
		getContentPane().add(getTmName());
		getContentPane().add(getTrDate());
		getContentPane().add(getTgrade());
		getContentPane().add(getStatus());
		getContentPane().add(getBtnNewButton());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uC0DD \uC815\uBCF4 \uC785\uB825");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(SystemColor.inactiveCaption);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 237, 64);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(12, 101, 57, 21);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC774\uB984");
			lblNewLabel_2.setBounds(12, 132, 57, 21);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uD559\uC77C");
			lblNewLabel_3.setBounds(12, 175, 57, 21);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD559\uB144");
			lblNewLabel_4.setBounds(12, 225, 57, 21);
		}
		return lblNewLabel_4;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(81, 101, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setBounds(81, 132, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(81, 175, 116, 21);
			trDate.setColumns(10);
			
			Date nal = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String n = sdf.format(nal);
			trDate.setText(n);
			
		}
		return trDate;
	}
	private JComboBox getTgrade() {
		if (tgrade == null) {
			tgrade = new JComboBox();
			tgrade.setBounds(81, 225, 116, 21);
			
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
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC815\uBCF4\uB97C \uC785\uB825\uD558\uC138\uC694 ");
			status.setBackground(SystemColor.inactiveCaption);
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 307, 237, 21);
		}
		return status;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					MemberDao dao = new MemberDao();
					MemberVo vo = new MemberVo();
					try {
					vo.setmId(tmId.getText());
					vo.setmName(tmName.getText());
					vo.setrDate(sdf.parse(trDate.getText()));
					vo.setGrade(tgrade.getSelectedIndex()+1);
					
					int cnt = dao.insert(vo);
					if(cnt>0) {
						status.setText("자료가 입력되었습니다.");
					} else {
						status.setText("입력중 오류가 발생되었습니다.");
					}
					
					}catch(Exception ex) {
						
					}
				}
			});
			btnNewButton.setBackground(SystemColor.inactiveCaption);
			btnNewButton.setBounds(87, 266, 97, 23);
		}
		return btnNewButton;
	}
}
