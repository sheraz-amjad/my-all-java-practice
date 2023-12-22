import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Muzzamil {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Muzzamil window = new Muzzamil();
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
	public Muzzamil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 258, 308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 222, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(10, 63, 55, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(66, 63, 55, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.setBounds(119, 63, 55, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setBounds(177, 63, 55, 41);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("1");
		btnNewButton_3_1.setBounds(10, 63, 55, 41);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 100, 55, 41);
		frame.getContentPane().add(btn7);
		
		JButton btnNewButton_3_3 = new JButton("8");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_3.setBounds(66, 100, 55, 41);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_3_3_1 = new JButton("1");
		btnNewButton_3_3_1.setBounds(119, 100, 55, 41);
		frame.getContentPane().add(btnNewButton_3_3_1);
		
		JButton btnNewButton_3_3_1_1 = new JButton("1");
		btnNewButton_3_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_3_1_1.setBounds(177, 100, 55, 41);
		frame.getContentPane().add(btnNewButton_3_3_1_1);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 141, 55, 41);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(66, 141, 55, 41);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(119, 141, 55, 41);
		frame.getContentPane().add(btn6);
		
		JButton btnNewButton_3_2_1_1_1_1 = new JButton("1");
		btnNewButton_3_2_1_1_1_1.setBounds(177, 141, 55, 41);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1_1);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 181, 55, 41);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setBounds(66, 181, 55, 41);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(119, 181, 55, 41);
		frame.getContentPane().add(btn3);
		
		JButton btnNewButton_3_2_1_1_1_5 = new JButton("1");
		btnNewButton_3_2_1_1_1_5.setBounds(177, 181, 55, 41);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1_5);
		
		JButton btnNewButton_3_2_1_1_1_6 = new JButton("1");
		btnNewButton_3_2_1_1_1_6.setBounds(10, 222, 55, 41);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1_6);
		
		JButton btnNewButton_3_2_1_1_1_7 = new JButton("1");
		btnNewButton_3_2_1_1_1_7.setBounds(66, 222, 55, 41);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1_7);
		
		JButton btnNewButton_3_2_1_1_1_8 = new JButton("1");
		btnNewButton_3_2_1_1_1_8.setBounds(119, 222, 55, 41);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1_8);
		
		JButton btnNewButton_3_2_1_1_1_9 = new JButton("1");
		btnNewButton_3_2_1_1_1_9.setBounds(177, 222, 55, 41);
		frame.getContentPane().add(btnNewButton_3_2_1_1_1_9);
	}

}
