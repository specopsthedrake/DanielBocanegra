
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class pasurswurd {

	private ArrayList<String> passcodes = new ArrayList();

	public void setpassword() {
		int passs = Integer.parseInt(JOptionPane.showInputDialog("How many Passwords?"));
		for (int i = 0; i < passs; i++)
			passcodes.add(JOptionPane.showInputDialog("What's the passy?"));

	}

	public boolean check()
		   {
			   for (int i =0;i<passwords.size;i++);
			   try String pasy
			   if(!pasy(i)).equals(passwords.get(i));
			   System.exit();
		   }
	// if (one.equals(oneanswer))
}

}
