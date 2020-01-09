package j_collection;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class TreeMapFrame extends JInternalFrame {
	TreeMap<Integer, String> scores;
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeMapFrame frame = new TreeMapFrame();
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
	public TreeMapFrame() {
		super("TreeMap", false, true, true, true);
		getContentPane().setBackground(new Color(250, 240, 230));
		setVisible(true);
		setBounds(100, 100, 292, 371);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getScrollPane());

	}
	
	public void process() {
		scores = new TreeMap<Integer, String>();
		scores.put(80, "kim");
		scores.put(50, "hong");
		scores.put(90, "pack");
		scores.put(30, "gang");
		scores.put(55, "lee");
	
		textArea.setText("");
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		textArea.append("�ּҰ� : " + entry.getKey() + " > " + entry.getValue());
		
		entry = scores.lastEntry();
		textArea.append("\n�ִ밪 : " + entry.getKey() + " > " + entry.getValue());
		
		entry = scores.lowerEntry(55);
		textArea.append("\n55�� �Ʒ� : " + entry.getKey() + " > " + entry.getValue());
		
		entry = scores.higherEntry(85);
		textArea.append("\n85�� �� : " + entry.getKey() + " > " + entry.getValue());
	}
	
	public void asc() { // �������� ����
		if(scores != null) {
			textArea.setText("");
			NavigableMap<Integer, String> tempMap = scores.descendingMap();
			NavigableMap<Integer, String> ascMap = tempMap.descendingMap();
			Set<Map.Entry<Integer, String>> set = ascMap.entrySet();
			for(Map.Entry<Integer, String> d : set) {
				textArea.append(d.getKey() + " : " + d.getValue()+ "\n");
			}
		} else {
			textArea.setText("���� �����ư�� Ŭ�� �� ������ �ּ���.");
		}
	}
	
	public void desc() { // �������� ����
		if(scores != null) {
			textArea.setText("");
			NavigableMap<Integer, String> map = scores.descendingMap();
			Set<Map.Entry<Integer, String>> entry = map.entrySet();
			for(Map.Entry<Integer, String> d : entry) {
				textArea.append(d.getKey() + " : " + d.getValue() + "\n");
			}			
		} else {
			textArea.setText("���� ���۹�ư�� Ŭ�� �� ������ �ּ���.");
		}
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2E4\uD589");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(154, 205, 50));
			btnNewButton.setFont(new Font("Ÿ����_���� B", Font.BOLD, 18));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					process();
				}
			});
			btnNewButton.setBounds(12, 10, 77, 34);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("DESC");
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setBackground(new Color(154, 205, 50));
			btnNewButton_1.setFont(new Font("Ÿ����_���� B", Font.BOLD, 18));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					desc();
				}
			});
			btnNewButton_1.setBounds(172, 10, 91, 34);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("ASC");
			btnNewButton_2.setBackground(new Color(154, 205, 50));
			btnNewButton_2.setForeground(new Color(255, 255, 255));
			btnNewButton_2.setFont(new Font("Ÿ����_���� B", Font.BOLD, 18));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					asc();
				}
			});
			btnNewButton_2.setBounds(93, 10, 77, 34);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 54, 251, 278);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("���� ���", Font.PLAIN, 13));
		}
		return textArea;
	}
}
