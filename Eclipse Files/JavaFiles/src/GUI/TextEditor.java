package GUI;

import java.awt.EventQueue;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class TextEditor {

	private JFrame frame;
	private JTextField smallField;
	private JTextField bigField;
	private static Scanner filescanner;
	private static String text = "";

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextEditor window = new TextEditor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TextEditor() {
		initialize();
	}

	static void OpenFile(String filename) {
		
		
		try {
			
			filescanner = new Scanner(new File(filename));
			
			
		} catch (Exception e) {

			System.out.println("OpenFile: File not found ");
		}

		
	}
	
	static String readFile() {
		
		text = "";

		while(filescanner.hasNext()) {

		text += filescanner.next() + " ";

			
		}
		
		filescanner.close();
		
	
		return text;
		
}
	

	
	static void writefile(String filename, String filetext) {


			FileOutputStream fs;
			
			try {
				fs = new FileOutputStream(filename);
				PrintWriter pw = new PrintWriter(fs);
				pw.println(filetext);
				pw.close();
				System.out.println("Copy was created");
				
			} catch (FileNotFoundException e) {
				

				System.out.println("Error");
			}
			

		
	}
	

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		smallField = new JTextField();
		smallField.setBounds(31, 45, 130, 26);
		frame.getContentPane().add(smallField);
		smallField.setColumns(10);
		
		JLabel lblFileName = new JLabel("File name");
		lblFileName.setBounds(64, 20, 61, 16);
		frame.getContentPane().add(lblFileName);
		
		bigField = new JTextField();
		bigField.setBounds(31, 84, 413, 153);
		frame.getContentPane().add(bigField);
		bigField.setColumns(10);
		
		JButton findFile = new JButton("Find");
		findFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				bigField.setText("");
				
			try {
		
				String filetext = smallField.getText();
				OpenFile(filetext);
				bigField.setText(readFile());
			}
			
			catch (Exception ex) {
				bigField.setText("Find: File not found");
			}

			}
		});
		findFile.setBounds(192, 45, 117, 29);
		frame.getContentPane().add(findFile);
		
	
		
		JButton btnSaveChanges = new JButton("Save Changes");
		btnSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String filetext = "";
				String filetext2 = "";
				
				filetext = smallField.getText();
				filetext2 = bigField.getText();
				writefile(filetext, filetext2);
				bigField.setText("");
				
			}
				
		});
		btnSaveChanges.setBounds(160, 243, 117, 29);
		frame.getContentPane().add(btnSaveChanges);
	}
}
