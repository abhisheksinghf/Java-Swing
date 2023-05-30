import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Operations{
	public static void main(String[] args)
	{
		//First Create Object of this class Sum
		Math_Op s = new Math_Op();
	}
}

class Math_Op extends JFrame
{
	JTextField t1,t2,t3;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;

	public Math_Op()
	{

		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b1 = new JButton("ADD");
		b2 = new JButton("SUB");
		b3 = new JButton("MUL");
		b4 = new JButton("DIV");
		t3 = new JTextField(20);

		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(t3);
	
		b1.addActionListener((ActionListener) this);
		b2.addActionListener((ActionListener) this);
		b3.addActionListener((ActionListener) this);
		b4.addActionListener((ActionListener) this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		
		int value = num1 + num2;
		
		b1.setText(value+"");
	}

}