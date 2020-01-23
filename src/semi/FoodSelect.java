package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import m_jdbc.DBconn;
import m_jdbc.MemberDelete;
import m_jdbc.MemberInsert;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class FoodSelect extends JFrame {

	Connection conn = DBconn.getConn();
	
	String header[] = {"음식 번호", "음식명", "재고 수량", "입고 금액", "판매 금액", "판매 여부"};
	   DefaultTableModel model = new DefaultTableModel(header, 0);
	
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JButton btnSearch;
	private JTextField tFind;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;
	private JButton button;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodSelect frame = new FoodSelect();
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
	public FoodSelect() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnSearch());
		contentPane.add(getTFind());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnUpdate());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLabel());
		contentPane.add(getButton());
		
		// 화면 처음 틀면 재고 목록이 바로 나타남
		FoodDao dao = new FoodDao();
		List<FoodVo> list = dao.list();
		try {
				Vector row = new Vector(list.size());
				for(int i = 1; i <list.size(); i++) {
					FoodVo vo = list.get(i);
					model.addRow(new Object[] {
							vo.getfNo(), vo.getfName(), vo.getfEa(), 
							vo.getInPrice(), vo.getSalPrice(), vo.getSales()
					});
				}		
			table.setModel(model);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

}
	
	
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 113, 435, 244);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC74C\uC2DD \uC790\uC7AC \uAD00\uB9AC");
			lblNewLabel.setBackground(new Color(255, 255, 255));
			lblNewLabel.setOpaque(true);
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 248, 49);
		}
		return lblNewLabel;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("\uAC80\uC0C9");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // 검색 눌렀을떄
					model.setNumRows(0);
					String f = tFind.getText();
					FoodDao dao = new FoodDao();
					List<FoodVo> list = dao.Select(f);
					try {
							Vector row = new Vector(list.size());
							for(int i = 1; i <list.size(); i++) {
								FoodVo vo = list.get(i);
								model.addRow(new Object[] {
										vo.getfNo(), vo.getfName(), vo.getfEa(), 
										vo.getInPrice(), vo.getSalPrice(), vo.getSales()
								});
							}
						table.setModel(model);
					} catch (Exception ex) {
						ex.printStackTrace();
					}

					
				}
			});
			btnSearch.setBounds(360, 81, 64, 23);
		}
		return btnSearch;
	}
	private JTextField getTFind() {
		if (tFind == null) {
			tFind = new JTextField();
			tFind.setBounds(55, 82, 293, 21);
			tFind.setColumns(10);
		}
		return tFind;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("\uC74C\uC2DD \uCD94\uAC00");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // 추가 버튼을 눌렀을때
					FoodInsert panel = new FoodInsert();
					panel.toFront();
					setVisible(false);
				}
			});
			btnAdd.setBounds(610, 143, 97, 23);
		}
		return btnAdd;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("\uC74C\uC2DD \uC218\uC815/\uC0AD\uC81C");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // 수정/삭제 버튼을 눌렀을떄
					FoodUpdate panel = new FoodUpdate();
					panel.toFront();
					setVisible(false);
				}
			});
			btnUpdate.setBounds(610, 242, 121, 23);
		}
		return btnUpdate;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 69, 719, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(FoodSelect.class.getResource("/semiIcon/음식 추가1.png")));
			lblNewLabel_1.setBounds(459, 101, 139, 107);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon(FoodSelect.class.getResource("/semiIcon/삭제2.png")));
			lblNewLabel_2.setBounds(486, 218, 97, 101);
		}
		return lblNewLabel_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(FoodSelect.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(575, 15, 72, 50);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // back 버튼을 클릭할떄
					AdminMain panel = new AdminMain();
					panel.toFront();
					setVisible(false);
				}
			});
			button.setBounds(659, 29, 72, 23);
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
