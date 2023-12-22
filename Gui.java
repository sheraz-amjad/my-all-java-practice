import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class Gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel =new JPanel();
		panel.add(new JButton("B1"));
		panel.add(new JButton("B6"));
		panel.add(new JButton("B7"));
		panel.add(new JButton("B8"));
		JFrame frame = new JFrame();
		frame.setTitle("MyFrame");
		frame.setResizable(false);
		frame.setSize(500,500);
		frame.add(panel,BorderLayout.NORTH);
		frame.add(new JButton ("B6"),BorderLayout.WEST);
		frame.add(new JButton ("B7"),BorderLayout.CENTER);
		frame.add(new JButton ("B8"),BorderLayout.EAST);
		frame.add(new JButton("B4"),BorderLayout.WEST);
		frame.add(new JButton("B5"),BorderLayout.CENTER);
		frame.add(new JButton("B3"),BorderLayout.EAST);
		frame.add(new JButton("B2"),BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	

	}

}
