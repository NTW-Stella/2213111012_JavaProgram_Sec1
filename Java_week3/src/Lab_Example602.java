import javax.swing.*;
public class Lab_Example602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		
		double itemPrice = 0;
		boolean validItem = false;
		
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter Item number to order"));
		
		for(int i =0;i<validValues.length;i++) {
			if(itemOrder == validValues[i]);{
				validItem = true;
				itemPrice = price[i];
			}
		}//End for
		if(validItem) {
			System.out.print("Item "+itemOrder+" is "+itemPrice);
		}
		else {
			System.out.print("Invalid Item ");
		}
	
		
	}

}
