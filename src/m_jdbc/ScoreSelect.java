package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class ScoreSelect extends JInternalFrame {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	ScoreDao dao = new ScoreDao();
	
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
					ScoreSelect frame = new ScoreSelect();
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
	public ScoreSelect() {
		super("성적 조회", false, true, true, true);
		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosed(InternalFrameEvent e) {
				try {
					dao.conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		setVisible(true);
		
		setBounds(100, 100, 383, 419);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getFind());
		getContentPane().add(getScrollPane());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC870\uD68C");
			lblNewLabel.setBounds(12, 10, 343, 47);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String f = find.getText();
					List<ScoreVo> list = dao.select(f);
					
					textArea.setText("");
					for(ScoreVo vo : list) {
						textArea.append(vo.toString());
					}
				}
			});
			btnNewButton.setBounds(283, 67, 72, 23);
		}
		return btnNewButton;
	}
	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(155, 68, 116, 21);
			find.setColumns(10);
		}
		return find;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 104, 343, 276);
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
