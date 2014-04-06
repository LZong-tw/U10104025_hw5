import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
	/**
	 * 
	 */
	Font font = new Font("Arial", Font.BOLD, 20);// Set a preset font.
	private static final long serialVersionUID = -7701346465549136986L;
	int count = 0, countDot = 0; // count: Make sure +,-,*,/,= could only be
									// pressed one time.
									// counDot: Make sure the problem, such as
									// "54..21" could not be happened.
	static JTextField show = new JTextField(); // Show the expression by
												// Textfield.

	public Main() {
		JPanel p1 = new JPanel();

		JButton B0 = new JButton("0"); // B0~B9: Button for number 0~9
		JButton B1 = new JButton("1");
		JButton B2 = new JButton("2");
		JButton B3 = new JButton("3");
		JButton B4 = new JButton("4");
		JButton B5 = new JButton("5");
		JButton B6 = new JButton("6");
		JButton B7 = new JButton("7");
		JButton B8 = new JButton("8");
		JButton B9 = new JButton("9");
		JButton BP = new JButton("+"); // BP: Button for PLUS(+).
		JButton BS = new JButton("-"); // BS: Button for SUBTRACT(-).
		JButton BM = new JButton("*"); // BM: Button for MULTIPLY(*).
		JButton BDD = new JButton("/"); // BDD: Button for DIVIDE(/).
		JButton BE = new JButton("="); // BE: Button for EQUAL(=).
		JButton Bd = new JButton("."); // Bd: Button for DOT(.).
		JButton C = new JButton("C"); // C: Button for CLEAR(C).

		p1.setLayout(new GridLayout(4, 4));

		p1.add(B7); // Arrange the buttons.
		p1.add(B8);
		p1.add(B9);
		p1.add(BP);

		p1.add(B4);
		p1.add(B5);
		p1.add(B6);
		p1.add(BS);

		p1.add(B1);
		p1.add(B2);
		p1.add(B3);
		p1.add(BM);

		p1.add(B0);
		p1.add(BE);
		p1.add(Bd);
		p1.add(BDD);

		B0.addActionListener(new A0()); // Add action listeners for each button.
		B1.addActionListener(new A1());
		B2.addActionListener(new A2());
		B3.addActionListener(new A3());
		B4.addActionListener(new A4());
		B5.addActionListener(new A5());
		B6.addActionListener(new A6());
		B7.addActionListener(new A7());
		B8.addActionListener(new A8());
		B9.addActionListener(new A9());
		BP.addActionListener(new AP());
		BS.addActionListener(new AS());
		BM.addActionListener(new AM());
		BDD.addActionListener(new ADD());
		BE.addActionListener(new AE());
		Bd.addActionListener(new Ad());
		C.addActionListener(new C());

		JPanel p2 = new JPanel(new BorderLayout()); // Merge the panels into
													// one.
		p2.add(show, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		show.setEditable(false); // Let the Text field can't be edited through
									// keyboard.

		add(p2, BorderLayout.CENTER); // Put the merged panel onto the frame.
		add(C, BorderLayout.SOUTH); // Insert the CLEAR button at the bottom of
									// the frame.

		B0.setFont(font); // Change the font to the preset one to make the
							// letters more friendly.
		B1.setFont(font);
		B2.setFont(font);
		B3.setFont(font);
		B4.setFont(font);
		B5.setFont(font);
		B6.setFont(font);
		B7.setFont(font);
		B8.setFont(font);
		B9.setFont(font);
		BP.setFont(font);
		BS.setFont(font);
		BM.setFont(font);
		BDD.setFont(font);
		BE.setFont(font);
		Bd.setFont(font);
		C.setFont(font);
		show.setFont(font);
	}

	public static Main main1;

	public static void main(String[] args) {
		Check check1 = new Check(); // Create an object.
		main1 = new Main();
		main1.setTitle("Calculator");
		main1.setSize(400, 400);
		main1.setLocationRelativeTo(null);
		main1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main1.setVisible(true);
		check1.window(); // Call the password checking dialog.
	}

	public class A0 implements ActionListener { // Set the actions for each
												// button.
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "0"); // show.setText(show.getText() +
												// "#");
												// let the text field could
												// serially show what
												// user just key in.
		}
	}

	public class A1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "1");
		}
	}

	public class A2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "2");
		}
	}

	public class A3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "3");
		}
	}

	public class A4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "4");
		}
	}

	public class A5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "5");
		}
	}

	public class A6 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "6");
		}
	}

	public class A7 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "7");
		}
	}

	public class A8 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "8");
		}
	}

	public class A9 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "9");
		}
	}

	public class AP implements ActionListener { // I use count to save what
												// users used in the expression,
		public void actionPerformed(ActionEvent e) { // and make sure they could
														// only use one time for
														// each expression.
			if (count < 10) {
				show.setText(show.getText() + "+");
				countDot = 0;
			}
			count = 10;
		}
	}

	public class AS implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (count < 10) {
				show.setText(show.getText() + "-");
				countDot = 0;
			}
			count = 11;
		}
	}

	public class AM implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (count < 10) {
				show.setText(show.getText() + "*");
				countDot = 0;
			}
			count = 12;
		}
	}

	public class ADD implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (count < 10) {
				show.setText(show.getText() + "/");
				countDot = 0;
			}
			count = 13;
		}
	}

	public class AE implements ActionListener { // When the "=" be clicked, call
												// other classes according
		public void actionPerformed(ActionEvent e) { // to the value of "count".
			double ans = 0, a = 0, b = 0;
			if (count != 0) {
				switch (count) {
				case 10:
					String aa[] = show.getText().split("\\+");
					a = Double.valueOf(aa[0]).doubleValue();
					b = Double.valueOf(aa[1]).doubleValue();
					ans = Add.addd(a, b);
					break;
				case 11:
					String as[] = show.getText().split("\\-");
					a = Double.valueOf(as[0]).doubleValue();
					b = Double.valueOf(as[1]).doubleValue();
					ans = Sub.sub(a, b);
					break;
				case 12:
					String am[] = show.getText().split("\\*");
					a = Double.valueOf(am[0]).doubleValue();
					b = Double.valueOf(am[1]).doubleValue();
					ans = Mul.mul(a, b);
					break;
				case 13:
					String ad[] = show.getText().split("\\/");
					a = Double.valueOf(ad[0]).doubleValue();
					b = Double.valueOf(ad[1]).doubleValue();
					ans = Dev.dev(a, b);
					break;
				}
				show.setText(show.getText() + "=" + ans);// Don't forget to show
															// the full
															// equation.
				count = 0; // And let count back to zero.
			}
		}
	}

	public class Ad implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (countDot == 0) {
				show.setText(show.getText() + ".");
			}
			countDot = 1;
		}
	}

	public class C implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText("");
			countDot = 0;
			count = 0;
		}
	}

}
