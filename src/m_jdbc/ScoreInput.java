package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class ScoreInput extends JInternalFrame {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	ScoreDao dao = new ScoreDao();
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tmId;
	private JTextField trDate;
	private JTextField tsubject;
	private JTextField tscore;
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreInput frame = new ScoreInput();
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
	public ScoreInput() {
		super("성적 입력", false, true, true, true);
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
		
		setBounds(100, 100, 253, 291);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getTmId());
		getContentPane().add(getTrDate());
		getContentPane().add(getTsubject());
		getContentPane().add(getTscore());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC785\uB825");
			lblNewLabel.setBounds(12, 10, 213, 55);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(12, 75, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC751\uC2DC\uC77C");
			lblNewLabel_2.setBounds(12, 100, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uACFC\uBAA9");
			lblNewLabel_3.setBounds(12, 125, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC810\uC218");
			lblNewLabel_4.setBounds(12, 150, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(81, 72, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(81, 97, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
	private JTextField getTsubject() {
		if (tsubject == null) {
			tsubject = new JTextField();
			tsubject.setBounds(81, 122, 116, 21);
			tsubject.setColumns(10);
		}
		return tsubject;
	}
	private JTextField getTscore() {
		if (tscore == null) {
			tscore = new JTextField();
			tscore.setBounds(81, 147, 116, 21);
			tscore.setColumns(10);
		}
		return tscore;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {					
					ScoreVo vo = new ScoreVo();
					vo.setmId( tmId.getText());
					vo.setrDate(sdf.parse(trDate.getText()));
					vo.setSubject(tsubject.getText());
					vo.setScore(Integer.parseInt(tscore.getText()));
					
					int cnt = dao.Insert(vo);
					if(cnt>0) {
						status.setText("성적정보가 입력되었습니다.");
					}else {
						status.setText("정보 입력 중 오류 발생");
					}
					tmId.requestFocus();
					tmId.selectAll();
					}catch(Exception ex) {
						
					}
				}
			});
			btnNewButton.setBounds(54, 175, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setBounds(12, 208, 213, 44);
		}
		return status;
	}
}
