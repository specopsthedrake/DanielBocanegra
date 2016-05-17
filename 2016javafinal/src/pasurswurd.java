
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class pasurswurd {

	private ArrayList<String> passcodes = new ArrayList();
	private ArrayList<String> messages = new ArrayList();
	private ArrayList<String> files = new ArrayList();

	public void setpassword() {
		int passs = Integer.parseInt(JOptionPane.showInputDialog("How many Passwords?"));

		for (int i = 0; i < passs; i++) {
			String y;

			passcodes.add(JOptionPane.showInputDialog("What's the password?"));
			messages.add(JOptionPane.showInputDialog("What's the message for this password?"));
		}
	}

	public int check() {
		for (int i = 0; i < passcodes.size(); i++)

			// if they get the password wrong
			if (!JOptionPane.showInputDialog("Enter the password number " + (i + 1)).equals(passcodes.get(i))) {
				// exit and return how far they got
				return i - 1;
				// if they got it right
			} else
			// System.out.println("files are the over ride");
			{
				// What's this do
				JOptionPane.showMessageDialog(null, messages.get(i));

			}
		return passcodes.size();
		// public void info() {
		// TODO Auto-generated method stub

	}

}
