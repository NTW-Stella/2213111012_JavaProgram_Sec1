import java.util.*;
import java.text.*;
public class Test {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##,###.00");
		Scanner scan = new Scanner (System.in);
		System.out.print("Input Product Name   : ");
		String productName=scan.nextLine();
		System.out.print("Input Product Unit   : ");
		int productUnit=scan.nextInt();
		System.out.print("Input price per unit : ");
		float pricePerUnit=scan.nextFloat();
		float totalPrice = productUnit*pricePerUnit;
		System.out.println("----------------------------------------");
		System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
		System.out.println("----------------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = scan.nextInt();
		System.out.println("----------------------------------------");
		float totalDiscount = totalPrice*discount/100;
		System.out.println("Discount from "+discount+"%\t"+frm.format(totalDiscount)+" baht.");
		float totalPricePaid = totalPrice-totalDiscount;
		System.out.println("Amount to be paid \t"+frm.format(totalPricePaid)+" baht.");
	}
}