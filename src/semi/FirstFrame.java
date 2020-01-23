package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
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
	public FirstFrame() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 379);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Book Cafe");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(33, 26, 245, 58);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(244, 164, 96));
			separator.setBackground(new Color(244, 164, 96));
			separator.setBounds(12, 100, 429, 2);
		}
		return separator;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login panel = new Login();
					panel.toFront();
					setVisible(false);
				}
			});
			btnNewButton.setBounds(159, 274, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(FirstFrame.class.getResource("/semiIcon/\uB85C\uADF8\uC778.PNG")));
			lblNewLabel_1.setBounds(137, 127, 141, 137);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon(FirstFrame.class.getResource("/semiIcon/\uBD81\uCE74\uD3983.png")));
			lblNewLabel_2.setBounds(289, 10, 89, 80);
		}
		return lblNewLabel_2;
	}
}
