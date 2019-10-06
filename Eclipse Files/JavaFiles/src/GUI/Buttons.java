package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buttons {
	


	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buttons window = new Buttons();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Buttons() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b1 = new JButton("B1");
		b1.setBounds(0, 0, 450, 29);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Button 1 was pressed");
				
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("B2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Button 2 was pressed");
			}
		});
		b2.setBounds(33, 78, 117, 29);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("B3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Button 3 was pressed");
			}
		});
		b3.setBounds(270, 78, 117, 29);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("B4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Button 4 was pressed");
			}
		});
		b4.setBounds(43, 175, 117, 29);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("B5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Button 5 was pressed");
			}
		});
		b5.setBounds(270, 175, 117, 29);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("B6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Button 6 was pressed");
			}
		});
		b6.setBounds(0, 243, 444, 29);
		frame.getContentPane().add(b6);
	}
}
