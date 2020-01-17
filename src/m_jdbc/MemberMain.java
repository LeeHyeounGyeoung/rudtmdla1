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
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_4;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;

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
		setBounds(100, 100, 646, 480);
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
			menuBar.add(getMnNewMenu_2());
			menuBar.add(getMnNewMenu_1());
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
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("QUERY");
			mnNewMenu_1.setOpaque(true);
			mnNewMenu_1.setBackground(SystemColor.inactiveCaption);
			mnNewMenu_1.add(getMntmNewMenuItem_4());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("SQL");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Query q = new Query();
					contentPane.add(q);
					q.toFront();
				}
			});
			mntmNewMenuItem_4.setOpaque(true);
			mntmNewMenuItem_4.setBackground(SystemColor.inactiveCaption);
		}
		return mntmNewMenuItem_4;
	}
	private JMenu getMnNewMenu_2() {
		if (mnNewMenu_2 == null) {
			mnNewMenu_2 = new JMenu("\uC131\uC801 \uAD00\uB9AC");
			mnNewMenu_2.setOpaque(true);
			mnNewMenu_2.setBackground(SystemColor.inactiveCaption);
			mnNewMenu_2.add(getMntmNewMenuItem_5());
			mnNewMenu_2.add(getMntmNewMenuItem_6());
			mnNewMenu_2.add(getMntmNewMenuItem_7());
			mnNewMenu_2.add(getMntmNewMenuItem_8());
		}
		return mnNewMenu_2;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("\uC131\uC801 \uC785\uB825");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreInput panel = new ScoreInput();
					contentPane.add(panel);
					panel.toFront();
				}
			});
			mntmNewMenuItem_5.setBackground(SystemColor.inactiveCaption);
			mntmNewMenuItem_5.setOpaque(true);
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmNewMenuItem_6() {
		if (mntmNewMenuItem_6 == null) {
			mntmNewMenuItem_6 = new JMenuItem("\uC131\uC801 \uC218\uC815");
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreUpdate panel = new ScoreUpdate();
					contentPane.add(panel);
					panel.toFront();
				}
			});
			mntmNewMenuItem_6.setBackground(SystemColor.inactiveCaption);
			mntmNewMenuItem_6.setOpaque(true);
		}
		return mntmNewMenuItem_6;
	}
	private JMenuItem getMntmNewMenuItem_7() {
		if (mntmNewMenuItem_7 == null) {
			mntmNewMenuItem_7 = new JMenuItem("\uC131\uC801 \uC870\uD68C");
			mntmNewMenuItem_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreSelect panel = new ScoreSelect();
					contentPane.add(panel);
					panel.toFront();
				}
			});
			mntmNewMenuItem_7.setBackground(SystemColor.inactiveCaption);
			mntmNewMenuItem_7.setOpaque(true);
		}
		return mntmNewMenuItem_7;
	}
	private JMenuItem getMntmNewMenuItem_8() {
		if (mntmNewMenuItem_8 == null) {
			mntmNewMenuItem_8 = new JMenuItem("\uC131\uC801 \uC0AD\uC81C");
			mntmNewMenuItem_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreDelete panel = new ScoreDelete();
					contentPane.add(panel);
					panel.toFront();
				}
			});
			mntmNewMenuItem_8.setBackground(SystemColor.inactiveCaption);
			mntmNewMenuItem_8.setOpaque(true);
		}
		return mntmNewMenuItem_8;
	}
}
