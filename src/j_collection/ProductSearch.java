package j_collection;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class ProductSearch extends JInternalFrame {
	Set<ProductVo> piList;
	Set<ProductVo> peList;
	
	ButtonGroup group = new ButtonGroup(); // �׷��� ���� ����� ���� �����δ�. ���� �����̱� ���ؼ� �׷��� ����
	
	
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JTextField textField;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JRadioButton imBtn;
	private JRadioButton exBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductSearch frame = new ProductSearch();
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
	public ProductSearch() {
		super("��ȸ", false, true, true, true);
		setVisible(true);
		setBounds(100, 100, 471, 319);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);

	}
	public ProductSearch(Set<ProductVo> pi, Set<ProductVo> pe) {
		this();
		this.piList = pi;
		this.peList = pe;		
	}
	public void search() {
		Set<ProductVo> list = null;
		
		// �˻��� (serial, ��ǰ�ڵ�, ��ǰ��) // 
		ProductVo find = new ProductVo();
		find.setSerial(textField.getText());
		find.setpCode(textField.getText());
		find.setpName(textField.getText());
		
		textArea.setText("");
		if(imBtn.isSelected()) {
			list = piList;
		} else {
			list = peList;
		}	
		Iterator<ProductVo> iter = list.iterator();
		while(iter.hasNext()) {
			ProductVo vo = iter.next();
			if(vo.equals(find)) {
				textArea.append(vo.toString());
			}
		}
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 30));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getTextField_1(), BorderLayout.CENTER);
			panel.add(getBtnNewButton(), BorderLayout.EAST);
			panel.add(getPanel_1(), BorderLayout.WEST);
		}
		return panel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("1�ƻ������ R", Font.PLAIN, 15));
			textArea.setBackground(SystemColor.menu);
		}
		return textArea;
	}
	private JTextField getTextField_1() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(new Color(154, 205, 50));
			btnNewButton.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
		}
		return btnNewButton;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(154, 205, 50));
			panel_1.setPreferredSize(new Dimension(120, 10));
			panel_1.add(getImBtn());
			panel_1.add(getExBtn());
		}
		return panel_1;
	}
	private JRadioButton getImBtn() {
		if (imBtn == null) {
			imBtn = new JRadioButton("\uC785\uACE0");
			imBtn.setForeground(new Color(255, 255, 255));
			imBtn.setBackground(new Color(154, 205, 50));
			imBtn.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			group.add(imBtn);
			imBtn.setSelected(true);
		}
		return imBtn;
	}
	private JRadioButton getExBtn() {
		if (exBtn == null) {
			exBtn = new JRadioButton("\uCD9C\uACE0");
			exBtn.setForeground(new Color(255, 255, 255));
			exBtn.setBackground(new Color(154, 205, 50));
			exBtn.setFont(new Font("1�ƻ������ R", Font.BOLD, 15));
			group.add(exBtn);
		}
		return exBtn;
	}
}
