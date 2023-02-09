import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product100B sold = new Product100B();
		
		int button = JOptionPane.showConfirmDialog(null,"Pattanakan?");
		if(button == 0) {
			sold = new PattanakanBranch();
		}
		
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the nuber of product: ")));
		JOptionPane.showMessageDialog(null, sold);
		
		
	}

}
