package semi;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class termSales extends JPanel {
	private JLabel lblNewLabel;
	private JRadioButton rdoDay;
	private JRadioButton rdoMonth;
	private JRadioButton rdoYear;
	private JTextField txtMinDate;
	private JLabel lblNewLabel_1;
	private JTextField txtMaxDate;
	private JSeparator separator;

	/**
	 * Create the panel.
	 */
	public termSales() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		add(getLblNewLabel());
		add(getRdoDay());
		add(getRdoMonth());
		add(getRdoYear());
		add(getTxtMinDate());
		add(getLblNewLabel_1());
		add(getTxtMaxDate());
		add(getSeparator());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uAE30\uAC04");
			lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
			lblNewLabel.setBounds(12, 10, 30, 21);
		}
		return lblNewLabel;
	}
	private JRadioButton getRdoDay() {
		if (rdoDay == null) {
			rdoDay = new JRadioButton("\uC77C\uBCC4");
			rdoDay.setBackground(new Color(255, 255, 255));
			rdoDay.setBounds(26, 70, 54, 23);
		}
		return rdoDay;
	}
	private JRadioButton getRdoMonth() {
		if (rdoMonth == null) {
			rdoMonth = new JRadioButton("\uC6D4\uBCC4");
			rdoMonth.setBackground(new Color(255, 255, 255));
			rdoMonth.setBounds(102, 70, 54, 23);
		}
		return rdoMonth;
	}
	private JRadioButton getRdoYear() {
		if (rdoYear == null) {
			rdoYear = new JRadioButton("\uB144\uBCC4");
			rdoYear.setBackground(new Color(255, 255, 255));
			rdoYear.setBounds(179, 70, 54, 23);
		}
		return rdoYear;
	}
	private JTextField getTxtMinDate() {
		if (txtMinDate == null) {
			txtMinDate = new JTextField();
			txtMinDate.setBounds(12, 99, 97, 21);
			txtMinDate.setColumns(10);
		}
		return txtMinDate;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("~");
			lblNewLabel_1.setBounds(122, 102, 16, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTxtMaxDate() {
		if (txtMaxDate == null) {
			txtMaxDate = new JTextField();
			txtMaxDate.setBounds(150, 99, 116, 21);
			txtMaxDate.setColumns(10);
		}
		return txtMaxDate;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 49, 254, 2);
		}
		return separator;
	}
}
