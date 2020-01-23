package semi;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;

public class NowCharge extends JPanel {
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtInitPrice;
	private JTextField txtAddPrice;

	/**
	 * Create the panel.
	 */
	public NowCharge() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		add(getLblNewLabel());
		add(getSeparator());
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());
		add(getTxtInitPrice());
		add(getTxtAddPrice());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD604\uC7AC \uC694\uAE08");
			lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
			lblNewLabel.setBounds(12, 10, 70, 21);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 38, 214, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uAE30\uBCF8 \uC694\uAE08");
			lblNewLabel_1.setBounds(25, 53, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uCD94\uAC00 \uC694\uAE08");
			lblNewLabel_2.setBounds(25, 79, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTxtInitPrice() {
		if (txtInitPrice == null) {
			txtInitPrice = new JTextField();
			txtInitPrice.setBounds(94, 50, 116, 21);
			txtInitPrice.setColumns(10);
		}
		return txtInitPrice;
	}
	private JTextField getTxtAddPrice() {
		if (txtAddPrice == null) {
			txtAddPrice = new JTextField();
			txtAddPrice.setBounds(94, 76, 116, 21);
			txtAddPrice.setColumns(10);
		}
		return txtAddPrice;
	}
}
