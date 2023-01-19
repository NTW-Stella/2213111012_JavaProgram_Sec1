import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		
		Book b = new Book();
		Scanner scan = new Scanner (System.in);
		System.out.print("Input book title   : ");
		b.setTitle(scan.nextLine());
		System.out.print("Input book price   : ");
		b.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		b.setPublishyear(scan.nextInt());
		System.out.println();
		System.out.println(b);
	}

}
