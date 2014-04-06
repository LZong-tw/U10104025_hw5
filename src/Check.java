import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Check extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5504430587599356467L;
	public String getPasswd;
	public JPasswordField passwd;
	public JLabel Passw;
	public JButton ChangePasswd;
	public int count = 0;
	// public Check() {
	// // JPanel pl=new JPanel();
	// // passwd=new JPasswordField();
	// // JButton CheckButton=new JButton("Check");
	// // pl.setLayout(new GridLayout(1,1));
	// // pl.add(CheckButton);
	// // CheckButton.addActionListener(new CheckHandler());
	// //
	// // JPanel p2=new JPanel(new BorderLayout());
	// // p2.add(new JLabel("Password:"),BorderLayout.NORTH);
	// // p2.add(passwd,BorderLayout.CENTER);
	// // p2.add(pl,BorderLayout.SOUTH);
	// //
	// // add(p2,BorderLayout.CENTER);
	// }

	static String pass = new String("0000");
	public static Check check = new Check();
	public static Dialog dialog = new Dialog(check);
	static boolean passornot = false;

	public void window() {
		dialog.setTitle("Check Password");
		dialog.setSize(300, 120);

		passwd = new JPasswordField();
		Passw = new JLabel("Password:");
		JButton CheckButton = new JButton("Check");
		ChangePasswd = new JButton("ChangePasswd");
		dialog.setLayout(new GridLayout(2, 1));

		dialog.add(Passw);
		dialog.add(passwd);

		dialog.add(CheckButton);
		CheckButton.addActionListener(new CheckHandler());
		dialog.add(ChangePasswd);
		ChangePasswd.addActionListener(new ChangeHandler());

		dialog.setLocationRelativeTo(null);
		dialog.setModal(true);
		dialog.setVisible(true);
	}

	public class CheckHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getPasswd = new String(passwd.getPassword());
			if (getPasswd.equals(pass)) {
				dialog.setVisible(false);
			}
		}
	}

	public class ChangeHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (count == 0) {
				Passw.setText("New Password:");
				ChangePasswd.setText("OK");
				count = 1;
			} else if (count == 1) {
				Passw.setText("Password:");
				ChangePasswd.setText("ChangePassword");
				pass = new String(passwd.getPassword());
				passwd.setText("");
				count = 0;
			}
		}
	}
}
