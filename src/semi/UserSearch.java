package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserSearch extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel label;
	private JButton button;
	private JSeparator separator;
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserSearch frame = new UserSearch();
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
	public UserSearch() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLabel());
		contentPane.add(getButton());
		contentPane.add(getSeparator());
		contentPane.add(getTextField());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uB3C4\uC11C \uAC80\uC0C9");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 174, 52);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(UserSearch.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(187, 17, 72, 50);
		}
		return label;
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
			button.setBounds(271, 31, 72, 23);
		}
		return button;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 74, 358, 2);
		}
		return separator;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(22, 86, 210, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.setBounds(244, 85, 97, 23);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 125, 358, 232);
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
