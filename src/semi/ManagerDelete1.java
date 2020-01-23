package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semi.BookDelete;
import semi.ManagerFrame;
//import semi.userDao;
//import semi.userVo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionEvent;

public class ManagerDelete1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField MasterId;
	private JTextField MasterPwd;
	private JLabel lblNewLabel_2;
	private JSeparator separator;
	private JButton btnNewButton;
	private JSeparator separator_1;
	private JLabel status;
	private JLabel label;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerDelete1 frame = new ManagerDelete1();
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
	public ManagerDelete1() {
		addWindowListener(new WindowAdapter() {	
		});
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 238);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getMasterId());
		contentPane.add(getMasterPwd());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getSeparator());
		contentPane.add(getBtnNewButton());
		contentPane.add(getSeparator_1());
		contentPane.add(getStatus());
		contentPane.add(getLabel());
		contentPane.add(getButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setBounds(12, 85, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_1.setBounds(12, 116, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getMasterId() {
		if (MasterId == null) {
			MasterId = new JTextField();
			MasterId.setBounds(81, 82, 116, 21);
			MasterId.setColumns(10);
		}
		return MasterId;
	}
	private JTextField getMasterPwd() {
		if (MasterPwd == null) {
			MasterPwd = new JTextField();
			MasterPwd.setBounds(81, 113, 116, 21);
			MasterPwd.setColumns(10);
		}
		return MasterPwd;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC0AD\uC81C");
			lblNewLabel_2.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel_2.setBounds(12, 10, 74, 45);
		}
		return lblNewLabel_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 63, 283, 2);
		}
		return separator;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(210, 81, 85, 50);
		}
		return btnNewButton;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 151, 283, 2);
		}
		return separator_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 163, 283, 27);
		}
		return status;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(ManagerDelete1.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(108, 5, 72, 50);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ManagerFrame panel = new ManagerFrame();
					panel.toFront();
					setVisible(false);
				}
			});
			button.setBounds(192, 27, 72, 23);
		}
		return button;
	}
}
