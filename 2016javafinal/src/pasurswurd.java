
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class pasurswurd {

	private ArrayList<String> passcodes = new ArrayList();
	private ArrayList<String> messages = new ArrayList();

	public void setpassword() {
		int passs = Integer.parseInt(JOptionPane.showInputDialog("How many Passwords?"));

		for (int i = 0; i < passs; i++) {
			String y;

			passcodes.add(JOptionPane.showInputDialog("What's the password?"));
			messages.add(JOptionPane.showInputDialog("What's the messag for this password?"));
		}
	}

	public int check() {
		for (int i = 0; i < passcodes.size(); i++)

			if (!JOptionPane.showInputDialog("Enter the password number " + (i + 1)).equals(passcodes.get(i))) {
				return i - 1;
			}

		return passcodes.size();

	}

	public void info() {
		// TODO Auto-generated method stub

	}

}
