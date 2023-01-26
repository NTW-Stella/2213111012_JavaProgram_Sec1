import javax.swing.*;
public class Example_402 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
			while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
				inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
			}
			inputEmail = inputEmail.toLowerCase();
			/*
			if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")) {
				JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
			}
			else {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
			}
			*/
			boolean checkEmail = inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com");
			JOptionPane.showMessageDialog(null, (checkEmail)
					?"Your e-mail is "+inputEmail
					:"Your e-mail is not hotmail or gmail dot com");
  }
}
