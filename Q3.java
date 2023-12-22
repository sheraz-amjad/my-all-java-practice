import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q3 implements ActionListener
{
	String a  = "33" ;
	String b  = "FaheelButt";
	String c  = "19";
	JButton b1;
	JButton b2;
	JTextField f2;
	JTextField f1;
	JTextField f3;
	JLabel eror;
	JLabel eror2;
	
			public Q3() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(10,10));
		
		
		
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,0));
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4,0));
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.LEADING));
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout(FlowLayout.LEADING));
		JPanel p5 = new JPanel();
		p5.setLayout(new FlowLayout(FlowLayout.LEADING));
		JPanel p6 = new JPanel();
		p6.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		
		JLabel l1 = new JLabel("  ID : ");
		JLabel l2 = new JLabel("  Name : ");
		JLabel l3 = new JLabel("  Age : ");
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		frame.add(p1 , BorderLayout.WEST);
		
		f1 = new JTextField();
		f1.setPreferredSize(new Dimension(100, 25));
		f2 = new JTextField();
		f2.setPreferredSize(new Dimension(200, 25));
		f3 = new JTextField();
		f3.setPreferredSize(new Dimension(100,25));
		b1 = new JButton("Search");
		b2 = new JButton("Insert");
		eror = new JLabel("Invalid ID");
		eror.setForeground(Color.RED);
		eror.setVisible(false);
		eror2 = new JLabel("Already regester");
		eror2.setForeground(Color.GREEN);
		eror2.setVisible(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		p3.add(f1);
		p3.add(b1);
		p4.add(f2);
		p5.add(f3);
		p6.add(b2);
		p6.add(eror);
		p6.add(eror2);
		p2.add(p3);
		p2.add(p4);
		p2.add(p5);
		p2.add(p6);
		frame.add(p2, BorderLayout.CENTER);
		
		
		frame.setVisible(true);
		frame.pack();
		frame.setResizable(false);}
	@Override
	public void actionPerformed(ActionEvent e) {
		String sercgId = f1.getText();
		if(e.getSource() == b1)
		{
			eror2.setVisible(false);
			if(sercgId.equals(a))
			{
				eror.setVisible(false);
				f2.setText(b);
				f3.setText(c);
			}
			else
			{
				eror.setVisible(true);
			}
		}
		if (e.getSource() == b2)
		{
			eror.setVisible(false);
			
			
			if(sercgId.equals(a)) 
			{
				f1.setText("");
				f2.setText("");
				f3.setText("");
				eror2.setVisible(true);
				
				
			}
			else
			{
				a = f1.getText();
				b = f2.getText();
				c = f3.getText();
				eror2.setVisible(false);
				
			}
		}
	}
}