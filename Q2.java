	import java.awt.BorderLayout;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	public class Q2 {
	public static void main(String[] args)
	{
	JPanel p1 = new JPanel();
	p1.add(new JButton("B1"));
	p1.add(new JButton("B6"));
	p1.add(new JButton("B7"));
	p1.add(new JButton("B8"));
	JFrame frame = new JFrame();
	frame.setTitle("My Form");
	frame.setSize(500, 200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(p1,BorderLayout.NORTH);
	frame.add(new JButton("B4"),BorderLayout.WEST);
	frame.add(new JButton("B5"),BorderLayout.CENTER);
	frame.add(new JButton("B3"),BorderLayout.EAST);
	frame.add(new JButton("B2"),BorderLayout.SOUTH);
	frame.setVisible(true);
	}
	}
	