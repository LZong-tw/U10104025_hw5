import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7701346465549136986L;
	int count = 0, countDot = 0;
	public double a[];
	static JTextField show = new JTextField();

	public Main() {
		JPanel p1 = new JPanel();

		JButton B0 = new JButton("0");
		JButton B1 = new JButton("1");
		JButton B2 = new JButton("2");
		JButton B3 = new JButton("3");
		JButton B4 = new JButton("4");
		JButton B5 = new JButton("5");
		JButton B6 = new JButton("6");
		JButton B7 = new JButton("7");
		JButton B8 = new JButton("8");
		JButton B9 = new JButton("9");
		JButton BP = new JButton("+");
		JButton BS = new JButton("-");
		JButton BM = new JButton("*");
		JButton BDD = new JButton("/");
		JButton BE = new JButton("=");
		JButton Bd = new JButton(".");
		JButton C = new JButton("C");

		p1.setLayout(new GridLayout(4, 4));

		p1.add(B7);
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

		B0.addActionListener(new A0());
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

		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(show, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		show.setEditable(false);

		add(p2, BorderLayout.CENTER);
		add(C, BorderLayout.SOUTH);
	}

	public static Main main1;

	public static void main(String[] args) {
		Check check1 = new Check();
		main1 = new Main();
		main1.setTitle("Calculator");
		main1.setSize(400, 400);
		main1.setLocationRelativeTo(null);
		main1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main1.setVisible(true);
		check1.window();
	}

	public class A0 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			show.setText(show.getText() + "0");
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

	public class AP implements ActionListener {
		public void actionPerformed(ActionEvent e) {
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

	public class AE implements ActionListener {
		public void actionPerformed(ActionEvent e) {
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
				show.setText(show.getText() + "=" + ans);
				count = 0;
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

	public boolean isInteger(char a[], char b[]) {
		for (int x = 0; a[x] == '\0' || b[x] == '\0'; x++) {
			if (a[x] == '.' || b[x] == '.') {
				return false;
			}
		}
		return true;
	}
}
