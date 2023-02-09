import javax.swing.*;
public class TestInformatrion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Input autor name: ");
		String email = JOptionPane.showInputDialog("Input author e-mail: ");
		String title = JOptionPane.showInputDialog("Input book title: ");
		int check = JOptionPane.showConfirmDialog(null, "Do you confirm your e-mail?");
		if (check == 1) {
			email = JOptionPane.showInputDialog("Input author e-mail: ");
		}
		JOptionPane.showMessageDialog(null,"Book title : "+title+
				"\nAuthor name : "+name+"\nAuthor e-mail : "+email);
	}

}
