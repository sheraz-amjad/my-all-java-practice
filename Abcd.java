import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Abcd {

	private JFrame frmStudentRecord;
	private JTextField textField;
	private JTextField textField_1;
	String Name;
	int RollNo;
	JLabel eror;
	JLabel eror2;
	private JTextField textField_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Abcd window = new Abcd();
					window.frmStudentRecord.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Abcd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentRecord = new JFrame();
		frmStudentRecord.setForeground(Color.BLACK);
		frmStudentRecord.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frmStudentRecord.setTitle("Student Record");
		frmStudentRecord.setBounds(100, 100, 450, 300);
		frmStudentRecord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentRecord.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(29, 52, 87, 27);
		frmStudentRecord.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(138, 52, 198, 31);
		frmStudentRecord.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Roll No");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(27, 104, 89, 27);
		frmStudentRecord.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 94, 198, 37);
		frmStudentRecord.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(54, 173, 106, 31);
		frmStudentRecord.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(261, 173, 96, 31);
		frmStudentRecord.getContentPane().add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(271, 215, 86, 20);
		frmStudentRecord.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
