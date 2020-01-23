package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semi_1.UserDao;
import semi_1.UserVo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FindId extends JFrame {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	UserDao dao = new UserDao();
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField cId;
	private JLabel lblNewLabel_3;
	private JTextField cPhone;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_4;
	private JLabel label;
	private JButton button;
	private JSeparator separator_1;
	private JTextField cEmail;
	private JLabel lblNewLabel_5;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindId frame = new FindId();
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
	public FindId() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 434);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getCId());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getCPhone());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
		contentPane.add(getLabel());
		contentPane.add(getButton());
		contentPane.add(getSeparator_1());
		contentPane.add(getCEmail());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getStatus());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4 \uC870\uD68C");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(24, 10, 264, 38);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 55, 288, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC774\uB984\uACFC \uC774\uBA54\uC77C, \uC5F0\uB77D\uCC98\uB97C \uC870\uD68C\uD558\uC138\uC694");
			lblNewLabel_1.setBounds(47, 69, 196, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC774\uB984");
			lblNewLabel_2.setBounds(47, 103, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getCId() {
		if (cId == null) {
			cId = new JTextField();
			cId.setBounds(127, 100, 116, 21);
			cId.setColumns(10);
		}
		return cId;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC774\uBA54\uC77C");
			lblNewLabel_3.setBounds(47, 134, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getCPhone() {
		if (cPhone == null) {
			cPhone = new JTextField();
			cPhone.setBounds(127, 162, 116, 21);
			cPhone.setColumns(10);
		}
		return cPhone;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String uId = cId.getText();//아이디
					String uEmail = cEmail.getText();//이메일
					String uPhone = cPhone.getText();//전화번호
					UserVo vo = new UserVo(uId,uEmail,uPhone);//매개변수 만들기
					List<UserVo> list = dao.idPwdSearch(vo);
					for(int i = 0; i<list.size() ; i++) {
						UserVo vo2 = list.get(i);//결과값받은 것을 뿌려주기
						if(vo2 !=null) {
							textArea.append(vo2.toString());
							status.setText("정보를 찾았습니다 로그인 해주세요");
						}else{
							status.setText("일치하는 정보가 없습니다");
						}
					}
				}
			});
			btnNewButton.setBounds(109, 215, 63, 23);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(34, 248, 243, 93);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_4());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel(" \uC544\uC774\uB514               \uBE44\uBC00\uBC88\uD638");
		}
		return lblNewLabel_4;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uB85C\uADF8\uC778 \uD558\uB7EC \uAC00\uAE30 >>");
			label.setBounds(109, 371, 116, 15);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Login");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login panel = new Login();
					setVisible(false);
				}
			});
			button.setBounds(227, 363, 73, 23);
		}
		return button;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 351, 288, 2);
		}
		return separator_1;
	}
	private JTextField getCEmail() {
		if (cEmail == null) {
			cEmail = new JTextField();
			cEmail.setBounds(127, 131, 116, 21);
			cEmail.setColumns(10);
		}
		return cEmail;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_5.setBounds(47, 168, 66, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 193, 288, 15);
		}
		return status;
	}
}
