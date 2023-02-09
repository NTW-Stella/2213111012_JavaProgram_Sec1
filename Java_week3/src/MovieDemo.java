import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Imput movie id   : ");
		String movieId = scan.nextLine();
		System.out.println("Imput movie name : ");
		String movieName = scan.nextLine();
		System.out.println();
		
		System.out.println("Input director name   : ");
		String directorName = scan.nextLine();
		System.out.println("Input director e-mail :");
		String directorEmail = scan.nextLine();
		System.out.println("Input director gender :");
		String directorGender = scan.nextLine();
		while(!directorGender.equalsIgnoreCase("f")||!directorGender.equalsIgnoreCase("m")) {
			System.out.println("Iput director gender, again : ");
			directorGender = scan.nextLine();
		}
		System.out.println("Input movie theater no.");
	}

}
