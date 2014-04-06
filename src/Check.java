import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Check extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5504430587599356467L;
	public String getPasswd;								//A string for getting entered password.
	public JPasswordField passwd;							//Password field.
	public JLabel Passw;									//Password label.
	public JButton ChangePasswd;							//Button for changing password.
	public int count = 0;									//Calculate if the password is changing or not.
	static String pass = new String("0000");				//Default password.
	public static Check check = new Check();
	public static Dialog dialog = new Dialog(check);		//Use dialog to force users entering the password.

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

	public class CheckHandler implements ActionListener {	//Check if the password entered was right, then close the dialog.
		public void actionPerformed(ActionEvent e) {
			getPasswd = new String(passwd.getPassword());
			if (getPasswd.equals(pass)) {
				dialog.setVisible(false);
			}
		}
	}

	public class ChangeHandler implements ActionListener {	//Let users can change password.
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
