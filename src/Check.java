import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Check extends JFrame{	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5504430587599356467L;
	static JPasswordField passwd=new JPasswordField();
	public Check(){
		JPanel pl=new JPanel();
		JButton CheckButton=new JButton("Check");
		pl.setLayout(new GridLayout(1,1));
		pl.add(CheckButton);
		CheckButton.addActionListener(new CheckHandler());
		
		JPanel p2=new JPanel(new BorderLayout());
		p2.add(new JLabel("Password:"),BorderLayout.NORTH);
		p2.add(passwd,BorderLayout.CENTER);
		p2.add(pl,BorderLayout.SOUTH);
		
		add(p2,BorderLayout.CENTER);
	}
	
	static String pass=new String("0000");
	static Check check=new Check();
	public static void main(String[] args){
		
		check.setTitle("Check Password");
		check.setSize(200, 120);
		check.setLocationRelativeTo(null);
		check.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		check.setVisible(true);
	}
	
	public class CheckHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			String psswd=new String(passwd.getPassword());
			if(psswd.equals(pass)){
				check.setVisible(false);
			}
		}
	}
	
	
}
