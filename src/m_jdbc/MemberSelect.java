package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class MemberSelect extends JInternalFrame {
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTextField find;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberSelect frame = new MemberSelect();
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
	public MemberSelect() {
		super("학생 정보 조회", false, true, true, true);
		setVisible(true);
		
		setBounds(100, 100, 351, 347);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getFind());
		getContentPane().add(getScrollPane());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uC0DD \uC815\uBCF4 \uC870\uD68C");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(SystemColor.inactiveCaption);
			lblNewLabel.setBounds(12, 10, 311, 41);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberDao dao = new MemberDao();
					String f = find.getText();
					List<MemberVo> list = dao.select(f);
					
					textArea.setText("");
					for(MemberVo vo : list) {
						textArea.append(vo.toString());
					}
				}
			});
			btnNewButton.setBackground(SystemColor.inactiveCaption);
			btnNewButton.setBounds(260, 64, 63, 23);
		}
		return btnNewButton;
	}
	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(107, 65, 141, 21);
			find.setColumns(10);
		}
		return find;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 99, 311, 209);
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
