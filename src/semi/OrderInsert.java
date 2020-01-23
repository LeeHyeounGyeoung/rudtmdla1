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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class OrderInsert extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel label;
	private JButton button;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtId;
	private JSeparator separator_1;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderInsert frame = new OrderInsert();
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
	public OrderInsert() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 391);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLabel());
		contentPane.add(getButton());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getScrollPane_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getTxtId());
		contentPane.add(getSeparator_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC74C\uC2DD \uC8FC\uBB38");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 168, 44);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 72, 513, 2);
		}
		return separator;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(OrderInsert.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(337, 13, 72, 50);
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
			button.setBounds(437, 31, 72, 23);
		}
		return button;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 106, 152, 237);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uBA54\uB274 \uAD00\uB9AC");
			lblNewLabel_1.setBounds(12, 84, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uBA54\uB274 \uCD94\uAC00");
			btnNewButton.setBounds(176, 104, 104, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC120\uD0DD \uCDE8\uC18C");
			btnNewButton_1.setBounds(176, 137, 104, 23);
		}
		return btnNewButton_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(292, 106, 233, 193);
			scrollPane_1.setViewportView(getTable_1());
		}
		return scrollPane_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBA54\uB274\uB97C \uC120\uD0DD\uD558\uC5EC \uCD94\uAC00\uD558\uACE0, \uC8FC\uBB38\uD558\uAE30 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694");
			lblNewLabel_2.setBounds(186, 323, 339, 20);
		}
		return lblNewLabel_2;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC8FC\uBB38\uD558\uAE30");
			btnNewButton_2.setBounds(192, 276, 88, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setIcon(new ImageIcon(OrderInsert.class.getResource("/semiIcon/\uC8FC\uBB38\uD558\uAE301.png")));
			lblNewLabel_3.setBounds(176, 170, 104, 94);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD68C\uC6D0\uB2D8\uC758 \uC8FC\uBB38 \uB0B4\uC5ED");
			lblNewLabel_4.setBounds(409, 84, 116, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTxtId() {
		if (txtId == null) {
			txtId = new JTextField();
			txtId.setEditable(false);
			txtId.setText("\uD68C\uC6D0 ID");
			txtId.setBounds(293, 81, 104, 21);
			txtId.setColumns(10);
		}
		return txtId;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(176, 311, 353, 2);
		}
		return separator_1;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
	private JTable getTable_1() {
		if (table_1 == null) {
			table_1 = new JTable();
		}
		return table_1;
	}
}
