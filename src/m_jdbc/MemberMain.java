package m_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class MemberMain extends JFrame {
	
	
	private JDesktopPane contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMain frame = new MemberMain();
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
	public MemberMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 384);
		setJMenuBar(getMenuBar_1());
		contentPane = new JDesktopPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(SystemColor.inactiveCaption);
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uBA54\uB274");
			mnNewMenu.setOpaque(true);
			mnNewMenu.setBackground(SystemColor.inactiveCaption);
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
			mnNewMenu.add(getMntmNewMenuItem_3());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uD559\uC0DD \uC815\uBCF4 \uC785\uB825");
			mntmNewMenuItem.setOpaque(true);
			mntmNewMenuItem.setBackground(SystemColor.inactiveCaption);
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberInsert panel = new MemberInsert();
					contentPane.add(panel);
					panel.toFront();
					
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uD559\uC0DD \uC815\uBCF4 \uC218\uC815");
			mntmNewMenuItem_1.setOpaque(true);
			mntmNewMenuItem_1.setBackground(SystemColor.inactiveCaption);
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberUpdate panel = new MemberUpdate();
					contentPane.add(panel);
					panel.toFront();
					
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uD559\uC0DD \uC815\uBCF4 \uC0AD\uC81C");
			mntmNewMenuItem_2.setBackground(SystemColor.inactiveCaption);
			mntmNewMenuItem_2.setOpaque(true);
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberDelete panel = new MemberDelete();
					contentPane.add(panel);
					panel.toFront();
					
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("\uD559\uC0DD \uC815\uBCF4 \uC870\uD68C");
			mntmNewMenuItem_3.setBackground(SystemColor.inactiveCaption);
			mntmNewMenuItem_3.setOpaque(true);
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberSelect panel = new MemberSelect();
					contentPane.add(panel);
					panel.toFront();
					
				}
			});
		}
		return mntmNewMenuItem_3;
	}
}
