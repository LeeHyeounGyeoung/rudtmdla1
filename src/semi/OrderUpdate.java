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
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class OrderUpdate extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel label;
	private JButton button;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JButton btnNewButton;
	private JSeparator separator_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JSeparator separator_2;
	private JLabel lblNewLabel_9;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUpdate frame = new OrderUpdate();
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
	public OrderUpdate() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 391);
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
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTextField());
		contentPane.add(getBtnNewButton());
		contentPane.add(getSeparator_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_3());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getTextField_6());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getSeparator_2());
		contentPane.add(getLblNewLabel_9());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC74C\uC2DD \uC8FC\uBB38 \uB0B4\uC5ED \uAD00\uB9AC");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 341, 48);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 62, 509, 2);
		}
		return separator;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(OrderUpdate.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(357, 8, 72, 50);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AdminMain panel = new AdminMain();
					panel.toFront();
					setVisible(false);
				}
			});
			button.setBounds(441, 29, 72, 23);
		}
		return button;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC8FC\uBB38 \uB0B4\uC5ED");
			lblNewLabel_1.setBounds(72, 74, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 96, 202, 247);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC8FC\uBB38 \uBC88\uD638");
			lblNewLabel_2.setBounds(244, 74, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(313, 71, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.setBounds(441, 70, 80, 23);
		}
		return btnNewButton;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(226, 103, 295, 2);
		}
		return separator_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_3.setBounds(244, 115, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC8FC\uBB38\uB0A0\uC9DC");
			lblNewLabel_5.setBounds(244, 146, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC8FC\uBB38 \uC0C1\uD488\uBA85");
			lblNewLabel_6.setBounds(237, 177, 64, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uC218\uB7C9");
			lblNewLabel_7.setBounds(244, 202, 57, 15);
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("\uC8FC\uBB38 \uAC00\uACA9");
			lblNewLabel_8.setBounds(244, 227, 57, 15);
		}
		return lblNewLabel_8;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(313, 112, 208, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(313, 143, 208, 21);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(313, 174, 208, 21);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(313, 199, 208, 21);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setBounds(313, 224, 208, 21);
			textField_6.setColumns(10);
		}
		return textField_6;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.setBounds(254, 261, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0AD\uC81C");
			btnNewButton_2.setBounds(398, 261, 97, 23);
		}
		return btnNewButton_2;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setForeground(new Color(255, 140, 0));
			separator_2.setBackground(new Color(255, 140, 0));
			separator_2.setBounds(226, 308, 295, 2);
		}
		return separator_2;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("\uC8FC\uBB38 \uBC88\uD638\uB97C \uAC80\uC0C9\uD558\uC138\uC694");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(226, 320, 295, 23);
		}
		return lblNewLabel_9;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
}
