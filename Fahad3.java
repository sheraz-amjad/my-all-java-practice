import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Fahad3 {
public static void main(String[] args)
{
JFrame frame = new JFrame("Student Form");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(550,500);
frame.getContentPane().setLayout(new BorderLayout(10,10));
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
JLabel l1 = new JLabel(" ID : ");
JLabel l2 = new JLabel(" Name : ");
JLabel l3 = new JLabel(" Age : ");
p1.add(l1);
p1.add(l2);
p1.add(l3);
frame.getContentPane().add(p1 , BorderLayout.WEST);
JTextField f1 = new JTextField();
f1.setPreferredSize(new Dimension(100, 25));
JTextField f2 = new JTextField();
f2.setPreferredSize(new Dimension(200, 25));
JTextField f3 = new JTextField();
f3.setPreferredSize(new Dimension(100,25));
JButton b1 = new JButton("Search");
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
f1.setText("48");
f2.setText("Sheraz");
f3.setText("19");
}
});
JButton b2 = new JButton("Insert");
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
f1.setText("Inserted successfully");
f2.setText("Inserted successfully");
f3.setText("Inserted successfully");
}
});
p3.add(f1);
p3.add(b1);
p4.add(f2);
p5.add(f3);
p6.add(b2);
p2.add(p3);
p2.add(p4);
p2.add(p5);
p2.add(p6);
frame.getContentPane().add(p2, BorderLayout.CENTER);
frame.setVisible(true);
frame.pack();
}
}