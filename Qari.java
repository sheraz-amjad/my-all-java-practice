import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Qari {

	private JFrame frmStudentRecord;
	private JTextField textField;
	private JTextField textField_1;
	String Name;
	String Rollno;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Qari window = new Qari();
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
	public Qari() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentRecord = new JFrame();
		frmStudentRecord.setTitle("Student Record");
		frmStudentRecord.setBounds(100, 100, 314, 321);
		frmStudentRecord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentRecord.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(88, 53, 200, 20);
		frmStudentRecord.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btninsert = new JButton("Insert");
		btninsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText()+btninsert.getText();
				textField.setText(name);
				String Rollno = textField.getText()+btninsert.getText();
				textField.setText(Rollno);
			}
		});
		btninsert.setBounds(56, 192, 89, 33);
		frmStudentRecord.getContentPane().add(btninsert);
		
		JButton btnsearch = new JButton("Search");
		btnsearch.setBounds(183, 192, 89, 33);
		frmStudentRecord.getContentPane().add(btnsearch);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 84, 200, 20);
		frmStudentRecord.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 56, 68, 17);
		frmStudentRecord.getContentPane().add(lblName);
		
		JLabel lblRollNo = new JLabel("RollNo");
		lblRollNo.setBounds(10, 84, 68, 20);
		frmStudentRecord.getContentPane().add(lblRollNo);
	}
}
