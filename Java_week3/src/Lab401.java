import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name : ");
		String inputName = scan.nextLine();
		int spacebar = inputName.indexOf(' ',0);
		if (spacebar == -1) 
		{
			System.out.print("Incorrect Name");
		}
		else 
		{
			String firstName = inputName.substring(0,spacebar);
			String lastName = inputName.substring(spacebar+1);
			System.out.print("First Name : " + firstName.toUpperCase() +
			         "\nLast Name : " + lastName.toLowerCase());
		}
	}

}
