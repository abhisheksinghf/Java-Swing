import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI 
{
	public static void main(String[] args)
	{
		Abc obj = new Abc();
	}
}

class Abc extends JFrame
{
	public Abc()
	{
		setVisible(true);
		setSize(400,400);//400px x 400px Frame
		setLayout(new FlowLayout());
		//To Show Text
		//		JLabel l = new JLabel("Hello World !! This is my first Java Swing Program!!");
		JLabel l1 = new JLabel("Hello World !!");
		JLabel l2 = new JLabel("This is a GUI Program");

		add(l1);
		add(l2);//Overwrites l1 and prints l2

		//to solve this we need to set layout
		//we can use gridlayout,flowlayout ...
		setLayout(new FlowLayout());

		//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Terminates the program automatically
		setDefaultCloseOperation(3);//can also write 3...should write for all codes
	}
}