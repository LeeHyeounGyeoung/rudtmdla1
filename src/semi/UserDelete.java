package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserDelete extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel label;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserDelete frame = new UserDelete();
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
	public UserDelete() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 228, 167);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLabel());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC0AD\uC81C\uAC00 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4.");
			lblNewLabel.setBounds(37, 10, 138, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(UserDelete.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(64, 35, 72, 50);
		}
		return label;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Home >>");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login panel = new Login();
					UserPrice panel_1 = new UserPrice();
					
					panel.toFront();
					panel_1.toFront();
					setVisible(false);
				}
			});
			btnNewButton.setBounds(54, 95, 97, 23);
		}
		return btnNewButton;
	}
}
