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

public class MemberInsert extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
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
		getContentPane().add(getTextField());
		getContentPane().add(getTextField_1());
		getContentPane().add(getTextField_2());
		getContentPane().add(getComboBox());
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
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(81, 101, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(81, 132, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(81, 175, 116, 21);
			textField_2.setColumns(10);
			
			Date nal = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String n = sdf.format(nal);
			textField_2.setText(n);
			
		}
		return textField_2;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(81, 225, 116, 21);
			
			comboBox.addItem("1학년");
			comboBox.addItem("2학년");
			comboBox.addItem("3학년");
			comboBox.addItem("4학년");
			comboBox.addItem("5학년");
			comboBox.addItem("6학년");
			comboBox.addItem("7학년");
			comboBox.addItem("8학년");
			comboBox.addItem("9학년");
			comboBox.addItem("10학년");
		}
		return comboBox;
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
			btnNewButton = new JButton("\uC785\uB825");
			btnNewButton.setBackground(SystemColor.inactiveCaption);
			btnNewButton.setBounds(87, 266, 97, 23);
		}
		return btnNewButton;
	}
}
