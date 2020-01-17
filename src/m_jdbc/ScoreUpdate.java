package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class ScoreUpdate extends JInternalFrame {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	ScoreDao dao = new ScoreDao();
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tserial;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField tmId;
	private JTextField tmName;
	private JTextField trDate;
	private JTextField tsubject;
	private JTextField tscore;
	private JButton btnNewButton_1;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreUpdate frame = new ScoreUpdate();
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
	public ScoreUpdate() {
		super("성적 수정", false, true, true, true);
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
		
		setBounds(100, 100, 346, 358);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTserial());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getSeparator());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getLblNewLabel_5());
		getContentPane().add(getLblNewLabel_6());
		getContentPane().add(getTmId());
		getContentPane().add(getTmName());
		getContentPane().add(getTrDate());
		getContentPane().add(getTsubject());
		getContentPane().add(getTscore());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC218\uC815");
			lblNewLabel.setBounds(12, 10, 306, 43);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Serial");
			lblNewLabel_1.setBounds(12, 63, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTserial() {
		if (tserial == null) {
			tserial = new JTextField();
			tserial.setBounds(81, 63, 116, 21);
			tserial.setColumns(10);
		}
		return tserial;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int serial = Integer.parseInt(tserial.getText());
					ScoreVo vo = dao.search(serial);
					
					tmId.setText("");
					tmName.setText("");
					trDate.setText("");
					tsubject.setText("");
					tscore.setText("");
					
					if(vo == null) {
						status.setText("자료가 없습니다.");
					}else {
					tmId.setText(vo.getmId());
					tmName.setText(vo.getmName());
					trDate.setText(sdf.format(vo.getrDate()));
					tsubject.setText(vo.getSubject());
					tscore.setText(vo.getScore() + "");
					status.setText("자료를 수정하세요~");
					}
				}
			});
			btnNewButton.setBounds(221, 63, 97, 23);
		}
		return btnNewButton;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(12, 102, 306, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_2.setBounds(12, 114, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC131\uBA85");
			lblNewLabel_3.setBounds(12, 139, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC751\uC2DC\uC77C");
			lblNewLabel_4.setBounds(12, 164, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uACFC\uBAA9");
			lblNewLabel_5.setBounds(12, 189, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC810\uC218");
			lblNewLabel_6.setBounds(12, 214, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setEnabled(false);
			tmId.setBounds(81, 111, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setEnabled(false);
			tmName.setBounds(81, 136, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(81, 161, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
	private JTextField getTsubject() {
		if (tsubject == null) {
			tsubject = new JTextField();
			tsubject.setBounds(81, 186, 116, 21);
			tsubject.setColumns(10);
		}
		return tsubject;
	}
	private JTextField getTscore() {
		if (tscore == null) {
			tscore = new JTextField();
			tscore.setBounds(81, 211, 116, 21);
			tscore.setColumns(10);
		}
		return tscore;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreVo vo = new ScoreVo();
					Date d;
					try {
						d = sdf.parse(trDate.getText());
						
						vo.setSerial(Integer.parseInt(tserial.getText()));
						vo.setrDate(d);
						vo.setSubject(tsubject.getText());
						vo.setScore(Integer.parseInt(tscore.getText()));
						
						int cnt = dao.update(vo);
						if(cnt>0) {
							status.setText("정상적으로 수정됨");
						} else {
							status.setText("수정 중 오류가 발생되었습니다.");
						}
					
					}catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			btnNewButton_1.setBounds(81, 242, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setVerticalTextPosition(SwingConstants.BOTTOM);
			status.setBackground(SystemColor.inactiveCaption);
			status.setBounds(12, 282, 306, 34);
		}
		return status;
	}
}
