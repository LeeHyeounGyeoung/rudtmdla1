package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserCreate extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField cId;
	private JTextField cPwd;
	private JTextField cName;
	private JTextField cPhone;
	private JTextField cBirth;
	private JTextField cDate;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JSeparator separator_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserCreate frame = new UserCreate();
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
	public UserCreate() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 398);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getCId());
		contentPane.add(getCPwd());
		contentPane.add(getCName());
		contentPane.add(getCPhone());
		contentPane.add(getCBirth());
		contentPane.add(getCDate());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRdbtnNewRadioButton_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getSeparator_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD68C\uC6D0 \uAC00\uC785");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 165, 48);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 68, 235, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(22, 87, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_2.setBounds(22, 114, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC774\uB984");
			lblNewLabel_3.setBounds(22, 139, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_4.setBounds(22, 164, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
			lblNewLabel_5.setBounds(22, 189, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC131\uBCC4");
			lblNewLabel_6.setBounds(22, 214, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uAC00\uC785\uC77C");
			lblNewLabel_7.setBounds(22, 239, 57, 15);
		}
		return lblNewLabel_7;
	}
	private JTextField getCId() {
		if (cId == null) {
			cId = new JTextField();
			cId.setBounds(91, 84, 116, 21);
			cId.setColumns(10);
		}
		return cId;
	}
	private JTextField getCPwd() {
		if (cPwd == null) {
			cPwd = new JTextField();
			cPwd.setBounds(91, 111, 116, 21);
			cPwd.setColumns(10);
		}
		return cPwd;
	}
	private JTextField getCName() {
		if (cName == null) {
			cName = new JTextField();
			cName.setBounds(91, 136, 116, 21);
			cName.setColumns(10);
		}
		return cName;
	}
	private JTextField getCPhone() {
		if (cPhone == null) {
			cPhone = new JTextField();
			cPhone.setBounds(91, 161, 116, 21);
			cPhone.setColumns(10);
		}
		return cPhone;
	}
	private JTextField getCBirth() {
		if (cBirth == null) {
			cBirth = new JTextField();
			cBirth.setBounds(91, 186, 116, 21);
			cBirth.setColumns(10);
		}
		return cBirth;
	}
	private JTextField getCDate() {
		if (cDate == null) {
			cDate = new JTextField();
			cDate.setBounds(91, 236, 116, 21);
			cDate.setColumns(10);
		}
		return cDate;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("\uB0A8");
			rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
			rdbtnNewRadioButton.setBounds(101, 210, 42, 23);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC");
			rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
			rdbtnNewRadioButton_1.setBounds(155, 210, 42, 23);
		}
		return rdbtnNewRadioButton_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC00\uC785");
			btnNewButton.setBounds(114, 267, 63, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Login");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login panel = new Login();
					panel.toFront();
					setVisible(false);
				}
			});
			btnNewButton_1.setBounds(173, 333, 74, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("\uB85C\uADF8\uC778 \uD558\uB7EC \uAC00\uAE30 >>");
			lblNewLabel_8.setBounds(55, 337, 116, 15);
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("\uC815\uBCF4\uB97C \uC785\uB825\uD558\uC138\uC694");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(12, 308, 235, 15);
		}
		return lblNewLabel_9;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 300, 235, 2);
		}
		return separator_1;
	}
}
