package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserModifyCheck2 extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JButton button;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModifyCheck2 frame = new UserModifyCheck2();
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
	public UserModifyCheck2() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getButton());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton_1());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC815\uBCF4 \uC218\uC815");
			label.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			label.setBounds(12, 10, 164, 50);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("New label");
			label_1.setIcon(new ImageIcon(UserModifyCheck2.class.getResource("/semiIcon/home.PNG")));
			label_1.setBounds(188, 10, 72, 50);
		}
		return label_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserMain panel = new UserMain();
					panel.toFront();
					setVisible(false);
				}
			});
			button.setBounds(268, 29, 72, 23);
		}
		return button;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 70, 328, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(UserModifyCheck2.class.getResource("/semiIcon/\uC218\uC8152.PNG")));
			lblNewLabel.setBounds(35, 90, 95, 103);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserModify panel = new UserModify();
					panel.toFront();
					setVisible(false);
				}
			});
			btnNewButton.setBounds(45, 204, 78, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(UserModifyCheck2.class.getResource("/semiIcon/\uC0AD\uC81C2.png")));
			lblNewLabel_1.setBounds(198, 90, 96, 103);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserDelete panel = new UserDelete();
					panel.toFront();
					setVisible(false);
				}
			});
			btnNewButton_1.setBounds(212, 204, 72, 23);
		}
		return btnNewButton_1;
	}
}
