import java.util.*;
import java.text.*;
import javax.swing.*;
public class MusicWorldApp {
	static final double TAX_RATE = .0625;
	public static void main(String[] args) {
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		//NumberFormat f2 = NumberFormat.getPercentInstance();
		DecimalFormat frm1 = new DecimalFormat("##.#####");
		String cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order"
				+ "\nPlease enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		String cdPriceStr=JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars");
		String cdQuantianStr = JOptionPane.showInputDialog("Please enter the quantity to be purchased");
		int cdQuantian = Integer.parseInt(cdQuantianStr);
		double cdPrice = Double.parseDouble(cdPriceStr);
		double cdSubtotal=cdPrice*cdQuantian;
		double cdTotal= cdSubtotal * (1+TAX_RATE);
		
		JOptionPane.showMessageDialog(null, "Summary of the transaction: "
				+ "\nCD ID:"+cdId+
				"\nCD Title:"+cdTitle+"\nCD Unit Price"+f1.format(cdPrice)+
				"\nCD Quantity:"+cdQuantian+
				"\n"+
				"\nSubtotal:"+f1.format(cdSubtotal)+
				"\nTax rate:"+frm1.format(TAX_RATE*100)+"%"+
				"\nTotal:"+frm1.format(cdTotal)+
				"\n"+
				"\nEnd of Program");
		
				
		
		

				
		
		

	}

}
