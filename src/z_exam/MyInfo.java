package z_exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class MyInfo extends JFrame implements ActionListener { // 

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnABC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyInfo frame = new MyInfo();
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
	public MyInfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getBtnNewButton(), BorderLayout.CENTER);
		contentPane.add(getBtnABC(), BorderLayout.NORTH);
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("123");
			
			btnNewButton.addActionListener(this); 
			// MyInfo는 JFrame이기도 하지만 ActionListener 이기도 하기 때문에 매개변수로 this를 사용			
		}
		return btnNewButton;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			SubThread st = new SubThread();
			Thread t = new Thread(st);
			t.setDaemon(true);
			t.start();
	} catch(Exception ex) {   }
  }
	
	private JButton getBtnABC() {
		if (btnABC == null) {
			btnABC = new JButton("abc");
			btnABC.addActionListener(this);
		}
		return btnABC;
	}
}
