package GUI;

//Andres Di Gregorio

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class Calculator {
	


	private JFrame frame;
	private JTextField textField;
	int number, result, math;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[142.00,grow][139.00][130.00][][8.00]", "[][][][][][][][]"));
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 0 1 4 1,growx");
		textField.setColumns(10);
		
		
		JButton Bplus = new JButton("+");
		Bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Integer.parseInt(textField.getText());
				math =1;
				textField.setText("");
				
				
			}
		});
		frame.getContentPane().add(Bplus, "cell 0 3,growy");
		
		
		JButton Bsubstraction = new JButton("-");
		Bsubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Integer.parseInt(textField.getText());
				math =2;
				textField.setText("");
				
				
			}
		});
		frame.getContentPane().add(Bsubstraction, "cell 1 3");
		
		
		JButton Bmultiplication = new JButton("*");
		Bmultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Integer.parseInt(textField.getText());
				math =3;
				textField.setText("");
				
			
			}
		});
		frame.getContentPane().add(Bmultiplication, "cell 2 3");
		
		
		JButton Bdivision= new JButton("/");
		Bdivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Integer.parseInt(textField.getText());
				math =4;
				textField.setText("");
			}
		});
		frame.getContentPane().add(Bdivision, "cell 3 3");
		
		JButton B1 = new JButton("1");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 1);
		
			}
		});
		frame.getContentPane().add(B1, "cell 0 4");
		
		
		JButton B2 = new JButton("2");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 2);
		
			}
		});
		frame.getContentPane().add(B2, "cell 1 4");
		
		
		JButton B3 = new JButton("3");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 3);
			}
		});
		frame.getContentPane().add(B3, "cell 2 4");
		
		
		JButton B4 = new JButton("4");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 4);
			}
		});
		frame.getContentPane().add(B4, "cell 0 5");
		
		
		JButton B5 = new JButton("5");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 5);
				
			}
		});
		frame.getContentPane().add(B5, "cell 1 5");
		
		
		JButton B6 = new JButton("6");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 6);
			}
		});
		frame.getContentPane().add(B6, "cell 2 5");
		
		
		JButton B7 = new JButton("7");
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 7);
			}
		});
		frame.getContentPane().add(B7, "cell 0 6");
		
		
		JButton B8 = new JButton("8");
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 8);
			}
		});
		frame.getContentPane().add(B8, "cell 1 6");
		
		
		JButton B9 = new JButton("9");
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 9);
			}
		});
		frame.getContentPane().add(B9, "cell 2 6");
		
		
		JButton B0 = new JButton("0");
		B0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + 0);
			}
		});
		frame.getContentPane().add(B0, "cell 1 7");
		
		
		JButton Bresult = new JButton("=");
		Bresult.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		Bresult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				
		Math();
		textField.setText(Integer.toString(result));
		
			}
		});
		frame.getContentPane().add(Bresult, "cell 3 6 1 2,growy");
		
		JButton Bclear = new JButton("C");
		Bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				
			}
		});
		frame.getContentPane().add(Bclear, "cell 3 4 1 2,growy");
	}


	private void Math() {
		
		
			
			switch (math) {
			
			case 1: result = number + Integer.parseInt(textField.getText());
			break;
			
			case 2: result = number - Integer.parseInt(textField.getText());
			break;
			
			case 3: result = number * Integer.parseInt(textField.getText());
			break;
			
			case 4: result = number / Integer.parseInt(textField.getText());
			break;
			
			}
	}
	
	
	
	
	


}