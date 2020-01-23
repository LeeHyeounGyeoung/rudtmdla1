package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import m_jdbc.DBconn;
import net.proteanit.sql.DbUtils;
import semi.ManagerFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ManagerFrame extends JFrame {
	String id;
	Connection conn = DBconn.getConn();
	
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JTextField find;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField mId;
	private JTextField mPwd;
	private JTextField mName;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_6;
	private JButton button;
	private JLabel label;
	private JLabel lblNewLabel_7;
	private JTextField mcheck;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerFrame frame = new ManagerFrame();
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
	public ManagerFrame() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getFind());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getScrollPane_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getMId());
		contentPane.add(getMPwd());
		contentPane.add(getMName());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getButton());
		contentPane.add(getLabel());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getTextField_1_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD68C\uC6D0 \uAD00\uB9AC");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 166, 43);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 56, 328, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD68C\uC6D0 Id/ \uC131\uBA85");
			lblNewLabel_1.setBounds(22, 68, 79, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(113, 65, 116, 21);
			find.setColumns(10);
		}
		return find;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(241, 64, 68, 23);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 94, 328, 118);
			scrollPane.setViewportView(getTable_1());
		}
		return scrollPane;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uBE44\uBC00\uBC88\uD638 \uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setBounds(209, 222, 116, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBC29\uBB38 \uAE30\uB85D");
			lblNewLabel_2.setBounds(22, 249, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(12, 275, 328, 57);
			scrollPane_1.setViewportView(getTable());
		}
		return scrollPane_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uB9E4\uB2C8\uC800 ID");
			lblNewLabel_3.setBounds(22, 342, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_4.setBounds(22, 372, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC131\uBA85");
			lblNewLabel_5.setBounds(22, 397, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getMId() {
		if (mId == null) {
			mId = new JTextField();
			mId.setBounds(91, 339, 116, 21);
			mId.setColumns(10);
		}
		return mId;
	}
	private JTextField getMPwd() {
		if (mPwd == null) {
			mPwd = new JTextField();
			mPwd.setBounds(91, 369, 116, 21);
			mPwd.setColumns(10);
		}
		return mPwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(91, 394, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0DD\uC131");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_2.setBounds(49, 444, 68, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uC0AD\uC81C");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ManagerDelete1 panel = new ManagerDelete1();
					panel.toFront();
					setVisible(false);
					
				}
			});
			btnNewButton_3.setBounds(241, 444, 68, 23);
		}
		return btnNewButton_3;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setIcon(new ImageIcon(ManagerFrame.class.getResource("/semiIcon/\uC0AD\uC81C2.png")));
			lblNewLabel_6.setBounds(225, 369, 84, 70);
		}
		return lblNewLabel_6;
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
			button.setBounds(268, 26, 72, 23);
		}
		return button;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(ManagerFrame.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(184, 0, 72, 50);
		}
		return label;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uAD8C\uD55C");
			lblNewLabel_7.setBounds(22, 422, 57, 15);
		}
		return lblNewLabel_7;
	}
	private JTextField getTextField_1_1() {
		if (mcheck == null) {
			mcheck = new JTextField();
			mcheck.setBounds(91, 419, 116, 21);
			mcheck.setColumns(10);
		}
		return mcheck;
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
