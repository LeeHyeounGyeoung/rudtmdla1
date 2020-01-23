package semi;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewCharge extends JPanel {
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtInitModify;
	private JTextField txtAddModify;
	private JButton btnPriceModify;

	/**
	 * Create the panel.
	 */
	public NewCharge() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		add(getLblNewLabel());
		add(getSeparator());
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());
		add(getTxtInitModify());
		add(getTxtAddModify());
		add(getBtnPriceModify());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC218\uC815 \uC694\uAE08");
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
	private JTextField getTxtInitModify() {
		if (txtInitModify == null) {
			txtInitModify = new JTextField();
			txtInitModify.setBounds(94, 50, 116, 21);
			txtInitModify.setColumns(10);
		}
		return txtInitModify;
	}
	private JTextField getTxtAddModify() {
		if (txtAddModify == null) {
			txtAddModify = new JTextField();
			txtAddModify.setBounds(94, 76, 116, 21);
			txtAddModify.setColumns(10);
		}
		return txtAddModify;
	}
	private JButton getBtnPriceModify() {
		if (btnPriceModify == null) {
			btnPriceModify = new JButton("\uAC00\uACA9 \uC218\uC815\uD558\uAE30");
			btnPriceModify.setBounds(94, 11, 116, 23);
		}
		return btnPriceModify;
	}
}
