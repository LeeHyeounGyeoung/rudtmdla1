package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class MemberDelete extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JSeparator separator;
	private JComboBox comboBox;
	private JTextField textField_1;
	private JTextField textField_2;
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
					MemberDelete frame = new MemberDelete();
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
	public MemberDelete() {
		super("학생 정보 삭제", false, true, true, true);
		setVisible(true);
		
		setBounds(100, 100, 305, 309);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTextField());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getSeparator());
		getContentPane().add(getComboBox());
		getContentPane().add(getTextField_1());
		getContentPane().add(getTextField_2());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uC0DD \uC815\uBCF4 \uC0AD\uC81C");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(SystemColor.inactiveCaption);
			lblNewLabel.setBounds(12, 10, 265, 59);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(12, 82, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(81, 79, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uD559\uC0DD\uBA85");
			lblNewLabel_2.setBounds(12, 133, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uD559\uC77C");
			lblNewLabel_3.setBounds(12, 158, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD559\uB144");
			lblNewLabel_4.setBounds(12, 187, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(SystemColor.inactiveCaption);
			separator.setBackground(SystemColor.inactiveCaption);
			separator.setBounds(12, 110, 265, 2);
		}
		return separator;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1\uD559\uB144", "2\uD559\uB144", "3\uD559\uB144", "4\uD559\uB144", "5\uD559\uB144", "6\uD559\uB144", "7\uD559\uB144", "8\uD559\uB144", "9\uD559\uB144", "10\uD559\uB144"}));
			comboBox.setBounds(81, 184, 116, 21);
		}
		return comboBox;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(81, 130, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(81, 155, 116, 21);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.setBackground(SystemColor.inactiveCaption);
			btnNewButton.setBounds(209, 78, 68, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.setBackground(SystemColor.inactiveCaption);
			btnNewButton_1.setBounds(79, 215, 80, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC218\uC815\uD560 \uC544\uC774\uB514\uB97C \uAC80\uC0C9\uD558\uC138\uC694");
			status.setBackground(SystemColor.inactiveCaption);
			status.setOpaque(true);
			status.setBounds(12, 248, 265, 21);
		}
		return status;
	}
}
