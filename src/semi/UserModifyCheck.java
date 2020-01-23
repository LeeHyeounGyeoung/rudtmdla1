package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserModifyCheck extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel label;
	private JButton button;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField cId;
	private JTextField cPwd;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModifyCheck frame = new UserModifyCheck();
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
	public UserModifyCheck() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 251);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLabel());
		contentPane.add(getButton());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getCId());
		contentPane.add(getCPwd());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC815\uBCF4 \uC218\uC815");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 24, 164, 50);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 84, 328, 2);
		}
		return separator;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(UserModifyCheck.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(184, 20, 72, 54);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserMain panel = new UserMain();
					panel.toFront();
					setVisible(false);
				}
			});
			button.setBounds(268, 43, 72, 23);
		}
		return button;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514\uC640 \uBE44\uBC00\uBC88\uD638 \uD655\uC778");
			lblNewLabel_1.setBounds(99, 96, 138, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_2.setBounds(55, 121, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_3.setBounds(55, 152, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getCId() {
		if (cId == null) {
			cId = new JTextField();
			cId.setBounds(138, 118, 116, 21);
			cId.setColumns(10);
		}
		return cId;
	}
	private JTextField getCPwd() {
		if (cPwd == null) {
			cPwd = new JTextField();
			cPwd.setBounds(138, 149, 116, 21);
			cPwd.setColumns(10);
		}
		return cPwd;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC77C\uCE58 \uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserModifyCheck2 panel = new UserModifyCheck2();
					panel.toFront();
					setVisible(false);
				}
			});
			btnNewButton.setBounds(148, 180, 97, 23);
		}
		return btnNewButton;
	}
}
