
import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class pasurswurd {

	private String master;
	private ArrayList<String> passcodes = new ArrayList<String>();
	private ArrayList<String> messages = new ArrayList<String>();
	private ArrayList<String> files = new ArrayList();

	// main part for secuity thourgh hashes. To improve move password hashes in
	// a .dat file as well a messages
	public String info(String message) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// sets diffulty of hashes
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] inputBytes = digest.digest(message.getBytes("UTF-8"));

		// ask poore
		byte[] hashBytes = digest.digest(inputBytes);
		return convertByteArrayToHexString(hashBytes);

	}

	// connects to the changing passwords and messages
	private static String convertByteArrayToHexString(byte[] arrayBytes) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < arrayBytes.length; i++) {
			stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		return stringBuffer.toString();
	}
	// TODO Auto-generated method stub
	/*
	 * public static String generateMD5(String message) throws
	 * HashGenerationException { return hashString(message, "MD5"); }
	 * 
	 * public static String generateSHA1(String message) throws
	 * HashGenerationException { return hashString(message, "SHA-1"); }
	 * 
	 * public static String generateSHA256(String message) throws
	 * HashGenerationException { return hashString(message, "SHA-256"); }
	 */

	// creates the changing passwords and messages
	public void setpassword() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		int passs = Integer.parseInt(JOptionPane.showInputDialog("How many Passwords?"));

		for (int i = 0; i < passs; i++) {
			passcodes.add(info(JOptionPane.showInputDialog("What's the password?")));
			System.out.println(info(passcodes.get(i).toString()));
			messages.add(JOptionPane.showInputDialog("What's the message for this password?"));

		}
		master = "four";

	}

	public int check() throws HeadlessException, NoSuchAlgorithmException, UnsupportedEncodingException {
		// return all the messages
		// } else

		for (int i = 0; i < passcodes.size(); i++)

			// if they get the password wrong

			if (!info(JOptionPane.showInputDialog("Enter the password number " + (i + 1))).equals(passcodes.get(i))) {
				// exit and return how far they got
				return i - 1;
				// if they got it right
			} else

			{
				// What's this do
				JOptionPane.showMessageDialog(null, messages.get(i));

			}
		return passcodes.size();

	}

}
