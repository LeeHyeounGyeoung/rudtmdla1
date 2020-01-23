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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UserPrice extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton;
	private JLabel lblNewLabel_7;
	private JSeparator separator_1;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPrice frame = new UserPrice();
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
	public UserPrice() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 401);
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
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getSeparator_1());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getLblNewLabel_10());
		contentPane.add(getLblNewLabel_11());
		contentPane.add(getLblNewLabel_12());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACB0\uC81C \uAE08\uC561");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(22, 10, 172, 43);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 61, 265, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("??");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(96, 73, 71, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uB85C\uADF8\uC778 \uC2DC\uAC04");
			lblNewLabel_2.setBounds(12, 102, 71, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uB85C\uADF8\uC544\uC6C3 \uC2DC\uAC04");
			lblNewLabel_3.setBounds(12, 137, 82, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uAE08\uC77C \uC774\uC6A9\uC2DC\uAC04");
			lblNewLabel_4.setBounds(12, 177, 82, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uCD1D \uC774\uC6A9\uC2DC\uAC04");
			lblNewLabel_5.setBounds(12, 219, 82, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uACB0\uC81C \uAE08\uC561");
			lblNewLabel_6.setBounds(12, 259, 82, 15);
		}
		return lblNewLabel_6;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uB2EB\uAE30");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnNewButton.setBounds(106, 285, 71, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uC774\uC6A9\uD574 \uC8FC\uC154\uC11C \uAC10\uC0AC\uD569\uB2C8\uB2E4.");
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(12, 330, 265, 23);
		}
		return lblNewLabel_7;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 318, 265, 2);
		}
		return separator_1;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("??");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setBounds(138, 102, 57, 15);
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("??");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(137, 137, 57, 15);
		}
		return lblNewLabel_9;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("??");
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setBounds(137, 177, 57, 15);
		}
		return lblNewLabel_10;
	}
	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("??");
			lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_11.setBounds(137, 219, 57, 15);
		}
		return lblNewLabel_11;
	}
	private JLabel getLblNewLabel_12() {
		if (lblNewLabel_12 == null) {
			lblNewLabel_12 = new JLabel("??");
			lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_12.setBounds(137, 259, 57, 15);
		}
		return lblNewLabel_12;
	}
}
