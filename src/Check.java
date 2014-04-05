
import javax.swing.JFrame;
import java.util.Scanner;

public class Check{
	static String passwd=new String("0000");
	static Scanner ipt=new Scanner(System.in);
	public static void main(String[] args){
		JFrame check=new JFrame("check");
		while(!ipt.equals(passwd)){
			check.setSize(800, 800);
			check.setLocationRelativeTo(null);
			check.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			check.setVisible(true);
		}
		check.setVisible(false);
		Main;
	}
}
