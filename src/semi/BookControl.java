package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import m_jdbc.DBconn;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class BookControl extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JTextField find;
	private JButton select;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel label;
	private JButton button;
	Connection conn = DBconn.getConn();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookControl frame = new BookControl();
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
	public BookControl() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getFind());
		contentPane.add(getSelect());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLabel());
		contentPane.add(getButton());
	}
	
	public void search() { //조회버튼을 눌렀을시
		String sql = " select * from Book   where bookname like ? or author like ? "; //도서명이나 저자가 같은지
		String a = find.getText();
		try {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + a + "%");
			ps.setString(2, "%" + a + "%");
			DefaultTableModel model = new DefaultTableModel();

			ResultSetMetaData meta = ps.getMetaData();

		
			int cnt = meta.getColumnCount();
			for (int i = 1; i <= cnt; i++) {
		
				model.addColumn(meta.getColumnName(i));
			}

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Vector row = new Vector(); 
				for (int i = 1; i <= cnt; i++) {
					row.add(rs.getString(i));
				}
				model.addRow(row);

			}

			table.setModel(model);//테이블 이용.
			rs.close();
			ps.close();

		} catch (Exception ex) {

		}

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uB3C4\uC11C \uAD00\uB9AC");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 169, 49);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 69, 554, 2);
		}
		return separator;
	}
	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(12, 81, 217, 21);
			find.setColumns(10);
		}
		return find;
	}
	private JButton getSelect() {
		if (select == null) {
			select = new JButton("\uC870\uD68C");
			select.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
			select.setBounds(241, 80, 97, 23);
		}
		return select;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 112, 325, 246);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB3C4\uC11C \uCD94\uAC00");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BookInsert panel = new BookInsert();
					panel.toFront();
					setVisible(false);
				}
			});
			btnNewButton_1.setBounds(469, 132, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uB3C4\uC11C \uC0AD\uC81C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BookDelete panel = new BookDelete();
					panel.toFront();
					setVisible(false);
				}
			});
			btnNewButton_2.setBounds(469, 299, 97, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uB3C4\uC11C \uC218\uC815");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BookUpdate panel = new BookUpdate();
					panel.toFront();
					setVisible(false);
				}
			});
			btnNewButton_3.setBounds(469, 222, 97, 23);
		}
		return btnNewButton_3;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(BookControl.class.getResource("/semiIcon/\uB3C4\uC11C \uCD94\uAC002.png")));
			lblNewLabel_1.setBounds(350, 93, 111, 100);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon(BookControl.class.getResource("/semiIcon/\uB3C4\uC11C \uC218\uC8153.png")));
			lblNewLabel_2.setBounds(360, 195, 97, 76);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setIcon(new ImageIcon(BookControl.class.getResource("/semiIcon/\uB3C4\uC11C \uC0AD\uC81C1.png")));
			lblNewLabel_3.setBounds(371, 273, 86, 75);
		}
		return lblNewLabel_3;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(BookControl.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(351, 9, 72, 50);
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
			button.setBounds(435, 29, 72, 23);
		}
		return button;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
}
