package Lessons;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BasicSwing extends JFrame{
	
	JPanel p = new JPanel();
	JButton b = new JButton("Hello");
	JTextField t = new JTextField("Hi!");
	JTextArea ta = new JTextArea("How\nare\nyou?");
	
	public static void main(String[] args)
	{
		new BasicSwing();
	}
	
	public BasicSwing()
	{
		super("Basic Swing App");
		setSize(400,300);
		setResizable(true);
		
		p.add(b);
		p.add(t);
		p.add(ta);
		add(p);
		
		setVisible(true);
	}
}
