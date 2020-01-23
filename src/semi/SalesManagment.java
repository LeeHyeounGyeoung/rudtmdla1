package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SpringLayout.Constraints;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SalesManagment extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtDate;
	private JButton btnSearch;
	private JSeparator separator_1;
	private JButton btnSalesSearch;
	private JButton btnDelete;
	private JButton btnInsert;
	private JPanel panel;
	private JPanel panel_1;
	private JSeparator separator_2;
	private JLabel label;
	private JButton button;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesManagment frame = new SalesManagment();
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
	public SalesManagment() {
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTxtDate());
		contentPane.add(getBtnSearch());
		contentPane.add(getSeparator_1());
		contentPane.add(getBtnSalesSearch());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnInsert());
		contentPane.add(getPanel_2());
		contentPane.add(getPanel_1_1());
		contentPane.add(getSeparator_2());
		contentPane.add(getLabel());
		contentPane.add(getButton());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		
//		DaySales day = new DaySales();
//		panel.add(day);
		
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uB9E4\uCD9C \uAD00\uB9AC");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 161, 61);
		}
		return lblNewLabel;
	}
	private JTextField getTxtDate() {
		if (txtDate == null) {
			txtDate = new JTextField();
			txtDate.setBounds(12, 93, 116, 21);
			txtDate.setColumns(10);
		}
		return txtDate;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("\uC870\uD68C");
			btnSearch.setBounds(158, 92, 67, 23);
		}
		return btnSearch;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 283, 406, 2);
		}
		return separator_1;
	}
	private JButton getBtnSalesSearch() {
		if (btnSalesSearch == null) {
			btnSalesSearch = new JButton("\uB9E4\uCD9C \uC870\uD68C");
			btnSalesSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SalesSearch panel = new SalesSearch();
					panel.toFront();
					setVisible(false);
				}
			});
			btnSalesSearch.setBounds(309, 435, 97, 23);
		}
		return btnSalesSearch;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("\uAE30\uB85D \uC0AD\uC81C");
			btnDelete.setBounds(321, 229, 97, 23);
		}
		return btnDelete;
	}
	private JButton getBtnInsert() {
		if (btnInsert == null) {
			btnInsert = new JButton("\uAE30\uB85D \uC800\uC7A5");
			btnInsert.setBounds(321, 139, 97, 23);
		}
		return btnInsert;
	}
	private JPanel getPanel_2() {
		if (panel == null) {
			panel = new DaySales();
			panel.setBounds(12, 124, 213, 148);
		}
		return panel;
	}
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new termSales();
			panel_1.setBounds(12, 295, 276, 130);
		}
		return panel_1;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setForeground(new Color(255, 140, 0));
			separator_2.setBackground(new Color(255, 140, 0));
			separator_2.setBounds(12, 73, 406, 2);
		}
		return separator_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(SalesManagment.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(178, 10, 72, 50);
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
			button.setBounds(258, 35, 72, 23);
		}
		return button;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(SalesManagment.class.getResource("/semiIcon/\uC800\uC7A51.png")));
			lblNewLabel_1.setBounds(227, 120, 82, 61);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon(SalesManagment.class.getResource("/semiIcon/\uC815\uBCF4 \uC0AD\uC81C1.png")));
			lblNewLabel_2.setBounds(237, 191, 72, 82);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setIcon(new ImageIcon(SalesManagment.class.getResource("/semiIcon/\uB9E4\uCD9C\uC870\uD68C1.png")));
			lblNewLabel_3.setBounds(288, 309, 130, 116);
		}
		return lblNewLabel_3;
	}
}
