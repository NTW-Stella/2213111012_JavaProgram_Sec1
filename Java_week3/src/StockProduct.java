import java.util.*;
import java.text.*;
public class StockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputData = new Scanner(System.in);
		Product[] StockProduct = new Product[4];
		DecimalFormat frm = new DecimalFormat("#,###.00");
		for (int i=0; i<StockProduct.length;i++) {
			StockProduct[i] = new Product();
			System.out.print("Input product Id    : ");
			StockProduct[i].setId(inputData.next());
			System.out.print("Input product Unit  : ");
			StockProduct[i].setUnit(inputData.nextInt());
			
			while(StockProduct[i].getUnit() <= 0) {
				System.out.print("Input product Unit, again :  ");
				StockProduct[i].setUnit(inputData.nextInt());
			}
			System.out.print("Input product Price : ");
			StockProduct[i].setPrice(inputData.nextDouble());
			while(StockProduct[i].getPrice()<=0) {
				System.out.print("Input product Price, again : ");
				StockProduct[i].setPrice(inputData.nextDouble());
			}
			System.out.println();
		}//End of for
		System.out.println("---------------------------------------------");
		double totalCount = 0;
		for (int i = 0;i<StockProduct.length;i++) {
			System.out.println("Product ID : "+StockProduct[i].getId()+","+
		"Total price = "+frm.format(StockProduct[i].calculate())+" baht.");
			totalCount += StockProduct[i].calculate();
		}
		System.out.println("---------------------------------------------");
		System.out.println("Total price of all products is "+frm.format(totalCount)+" baht.");
	}

}