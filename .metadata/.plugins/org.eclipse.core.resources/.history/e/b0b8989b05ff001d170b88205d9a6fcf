import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DateDifferenceGUI {
	private JFrame frame;
	private JTextField date1TextField;
	private JTextField date2TextField;
	private JLabel resultLabel;

	public static void main(String[] args) {
		DateDifferenceGUI gui = new DateDifferenceGUI();
		gui.createAndShowGUI();
	}

	private void createAndShowGUI() {
		frame = new JFrame("Date Difference Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		JLabel date1Label = new JLabel("Enter the first date (DD-MM-YYYY):");
		date1Label.setBounds(20, 20, 200, 20);
		frame.add(date1Label);

		date1TextField = new JTextField();
		date1TextField.setBounds(230, 20, 100, 20);
		frame.add(date1TextField);

		JLabel date2Label = new JLabel("Enter the second date (DD-MM-YYYY):");
		date2Label.setBounds(20, 60, 200, 20);
		frame.add(date2Label);

		date2TextField = new JTextField();
		date2TextField.setBounds(230, 60, 100, 20);
		frame.add(date2TextField);

		JButton calculateButton = new JButton("Calculate");
		calculateButton.setBounds(120, 100, 100, 20);
		frame.add(calculateButton);

		resultLabel = new JLabel();
		resultLabel.setBounds(20, 140, 400, 20);
		frame.add(resultLabel);

		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateDateDifference();
			}
		});

		frame.setSize(400, 200);
		frame.setVisible(true);
	}

	private void calculateDateDifference() {
		String date1String = date1TextField.getText();
		String date2String = date2TextField.getText();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		try {
			LocalDate date1 = LocalDate.parse(date1String, formatter);
			LocalDate date2 = LocalDate.parse(date2String, formatter);
			long daysBetween = ChronoUnit.DAYS.between(date1, date2);
			resultLabel.setText("The Number of Days Between " + date1String + " and " + date2String + " is: " + daysBetween);
		} catch (Exception e) {
			resultLabel.setText("Invalid date format. Please enter dates in the format DD-MM-YYYY.");
		}
	}
}
