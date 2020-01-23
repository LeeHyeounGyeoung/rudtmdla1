package semi;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Font;

public class DaySales extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtTotalUser;
	private JTextField txtTotalOrder;
	private JTextField txtTotalPrice;
	private JTextField txtProfit;
	private JSeparator separator;

	/**
	 * Create the panel.
	 */
	public DaySales() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());
		add(getLblNewLabel_3());
		add(getLblNewLabel_4());
		add(getTxtTotalUser());
		add(getTxtTotalOrder());
		add(getTxtTotalPrice());
		add(getTxtProfit());
		add(getSeparator());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC77C\uC77C\uD310\uB9E4 \uAE30\uB85D");
			lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
			lblNewLabel.setBounds(12, 10, 97, 21);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC774\uC6A9\uC790 \uC218 :");
			lblNewLabel_1.setBounds(12, 45, 66, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC8FC\uBB38 \uAC74\uC218 :");
			lblNewLabel_2.setBounds(12, 70, 66, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uCD1D \uB9E4\uCD9C\uC561 :");
			lblNewLabel_3.setBounds(12, 95, 66, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uCD1D \uC218\uC775 :");
			lblNewLabel_4.setBounds(12, 120, 66, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTxtTotalUser() {
		if (txtTotalUser == null) {
			txtTotalUser = new JTextField();
			txtTotalUser.setBounds(90, 42, 116, 21);
			txtTotalUser.setColumns(10);
		}
		return txtTotalUser;
	}
	private JTextField getTxtTotalOrder() {
		if (txtTotalOrder == null) {
			txtTotalOrder = new JTextField();
			txtTotalOrder.setBounds(90, 67, 116, 21);
			txtTotalOrder.setColumns(10);
		}
		return txtTotalOrder;
	}
	private JTextField getTxtTotalPrice() {
		if (txtTotalPrice == null) {
			txtTotalPrice = new JTextField();
			txtTotalPrice.setBounds(90, 92, 116, 21);
			txtTotalPrice.setColumns(10);
		}
		return txtTotalPrice;
	}
	private JTextField getTxtProfit() {
		if (txtProfit == null) {
			txtProfit = new JTextField();
			txtProfit.setBounds(90, 117, 116, 21);
			txtProfit.setColumns(10);
		}
		return txtProfit;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 33, 194, 2);
		}
		return separator;
	}
}
