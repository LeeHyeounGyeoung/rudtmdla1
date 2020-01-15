package z_exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream.PutField;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.awt.event.ActionEvent;

public class MapEx extends JFrame {
	
	Map<String, String> map = new HashMap<String, String>();

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapEx frame = new MapEx();
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
	public MapEx() {
		setTitle("MapEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getBtnNewButton_5());
		contentPane.add(getBtnNewButton_6());
		contentPane.add(getScrollPane());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("KEY");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(81, 7, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("VALUE");
			lblNewLabel_1.setBounds(12, 35, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(81, 32, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Kyes");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 1번째 방법
					textArea.setText("");
					Set<String> keys = map.keySet();
					for(String k : keys) {
						textArea.append(k + "\n");
					}
					// 2번째 방법
					textArea.append("...how 2 ......\n");
					Set<String> keys2 = map.keySet();
					Iterator<String> iter = keys2.iterator();
					while(iter.hasNext()) {
						String k = iter.next();
						textArea.append(k + "\n");
					}
				}
			});
			btnNewButton.setBounds(289, 7, 76, 47);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Values");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					Collection<String> values = map.values();
					for(String v : values) {
						textArea.append(v + "\n");
					}
				}
			});
			btnNewButton_1.setBounds(366, 7, 76, 47);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC785\uB825");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key = textField.getText();
					String values = textField_1.getText();
					map.put(key, values); // key값은 중복불가, values 중복가능
				}
			});
			btnNewButton_2.setBounds(81, 60, 76, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uC218\uC815");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key = textField.getText();
					String value = textField_1.getText();
					
					if(map.containsKey(key)) {
					map.put(key, value);
					}else {
						JOptionPane.showMessageDialog(MapEx.this, "키값이 존재하지 않습니다.");
					}
				}
			});
			btnNewButton_3.setBounds(169, 60, 76, 23);
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("\uC0AD\uC81C");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key = textField.getText();
					if(map.containsKey(key)) {
						map.remove(key);
						textField_1.setText("");
					}else {
						JOptionPane.showMessageDialog(MapEx.this, "삭제할 키가 없음");
					}
					textField.requestFocus();
					textField.selectAll();
				}
			});
			btnNewButton_4.setBounds(257, 60, 76, 23);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("\uC870\uD68C");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField_1.setText("");
					String key = textField.getText();
					String value = map.get(key);
					if(value != null) {
					textField_1.setText(value);		
					}
				}
			});
			btnNewButton_5.setBounds(209, 7, 62, 46);
		}
		return btnNewButton_5;
	}
	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("Map.Entry");
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					Set<Map.Entry<String, String>> set = map.entrySet();
					
					// how 1.
					for(Map.Entry<String, String> m : set) {
						textArea.append(m.getKey() + " = " + m.getValue() + "\n");
					}
					// how 2.
					Iterator<Map.Entry<String, String>> iter = set.iterator();
					textArea.append("....how2.........\n");
					while(iter.hasNext()) {
						Map.Entry<String, String> m = iter.next();
						textArea.append(m.getKey() + " = " + m.getValue() + "\n");
					}
				}
			});
			btnNewButton_6.setBounds(345, 61, 97, 21);
		}
		return btnNewButton_6;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 100, 430, 272);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
