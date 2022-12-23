import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputData = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int inputProduct = inputData.nextInt();
		Product [] CheckStockProduct = new Product[inputProduct];
		System.out.println();
		for (int i =0 ; i<CheckStockProduct.length;i++) {
			CheckStockProduct[i] = new Product();
			System.out.print("Input product Id   : ");
			CheckStockProduct[i].setId(inputData.next());
			System.out.print("Input product Unit : ");
			CheckStockProduct[i].setUnit(inputData.nextInt());
			System.out.println();
		}
		System.out.println("---------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("---------------------------------------");
		 for(Product pdc : CheckStockProduct ) {
			 if (pdc.checkStock(inputProduct).equals("LOW")){
				 System.out.println(">> "+pdc.getId()+" has "+pdc.getUnit()+" units");
			 }
			 
		 }
		 System.out.println("---------------------------------------");
			System.out.println("List of product in 'NORMAL' status.");
			System.out.println("---------------------------------------");
		 for(Product pdc : CheckStockProduct ) {
			 if (pdc.checkStock(inputProduct).equals("NORMAL")){
				 System.out.println(">> "+pdc.getId()+" has "+pdc.getUnit()+" units");
			 }
			 
		 }
		 System.out.println("---------------------------------------");
			System.out.println("List of product in 'HIGH' status.");
			System.out.println("---------------------------------------");
		 for(Product pdc : CheckStockProduct ) {
			 if (pdc.checkStock(inputProduct).equals("HIGH")){
				 System.out.println(">> "+pdc.getId()+" has "+pdc.getUnit()+" units");
			 }
			 
		 }
	}

}