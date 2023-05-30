import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//My First GUI Program

public class Name_App extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JTextField nameField;
	private JLabel nameLabel;
	private JButton submitButton;
	private JLabel displayName;
	private JPanel panel;

	public Name_App()
	{

		super("Name App");
		panel = new JPanel(new GridLayout(2, 2, 5, 5));
		//		panel = new JPanel(new FlowLayout(2, 2, 5));

		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		panel.setPreferredSize(new Dimension(400,150));
		panel.setBackground(Color.PINK);
		//added
		setResizable(false);
		nameLabel = new JLabel("Name : ");
		nameLabel.setFont(new Font("Serif", Font.BOLD, 18));
		nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLabel.setForeground(Color.black);
		nameField = new JTextField();
		nameField.setFont(new Font("Serif", Font.PLAIN, 18));
		displayName = new JLabel("");
		displayName.setFont(new Font("Serif", Font.BOLD, 18));
		displayName.setHorizontalAlignment(SwingConstants.RIGHT);
		submitButton = new JButton("SUBMIT");
		submitButton.setFont(new Font("Serif", Font.BOLD, 18));
		submitButton.setForeground(Color.BLUE);

		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(displayName);
		//				panel.add(new JLabel(""));
		panel.add(submitButton);
		submitButton.addActionListener(this);

		add(panel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == submitButton)
		{
			String name = nameField.getText();
			//			System.out.println(name);
			if(!name.isEmpty())
			{
				displayName.setText("Your Name is : "+name);
				displayName.setFont(new Font("Serif", Font.BOLD, 24));
				//				displayName.setText("");
			}
		}
		displayName.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				displayName.setForeground(Color.RED); // Change color on mouse enter
			}

			public void mouseExited(MouseEvent e) {
				displayName.setForeground(Color.GREEN); // Change color back on mouse exit
			}
		});
		nameLabel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				nameLabel.setForeground(Color.ORANGE); // Change color on mouse enter
			}

			public void mouseExited(MouseEvent e) {
				nameLabel.setForeground(Color.CYAN); // Change color back on mouse exit
			}
		});
		submitButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				submitButton.setForeground(Color.MAGENTA); // Change color on mouse enter
				submitButton.setBackground(Color.getHSBColor(350, 0, 20)); // Change color on mouse enter

			}

			public void mouseExited(MouseEvent e) {
				submitButton.setForeground(Color.ORANGE); // Change color back on mouse exit
			}
		});
		nameField.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				nameField.setForeground(Color.BLUE); // Change color on mouse enter
				nameField.setBackground(Color.YELLOW); // Change color on mouse enter

			}

			public void mouseExited(MouseEvent e) {
				nameField.setForeground(Color.GREEN); // Change color back on mouse exit
			}
		});
	}

	public static void main(String[] args)
	{
		new Name_App();
	}

}
