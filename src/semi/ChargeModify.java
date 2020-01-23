package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChargeModify extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel label;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChargeModify frame = new ChargeModify();
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
	public ChargeModify() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 239);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getLabel());
		contentPane.add(getButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC774\uC6A9 \uC694\uAE08 \uAD00\uB9AC");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 248, 50);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 70, 486, 2);
		}
		return separator;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new NowCharge();
			panel.setBounds(12, 83, 236, 106);
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new NewCharge();
			panel_1.setBounds(262, 83, 236, 106);
		}
		return panel_1;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(ChargeModify.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(323, 16, 72, 50);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AdminMain panel = new AdminMain();
					panel.toFront();
					setVisible(false);
				}
			});
			button.setBounds(407, 30, 72, 23);
		}
		return button;
	}
}
