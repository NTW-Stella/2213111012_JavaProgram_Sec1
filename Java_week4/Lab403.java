import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Message : ");
		String sentence = input.nextLine();
		sentence = sentence.toLowerCase();
		if (sentence.indexOf("nichi")>=0) 
		{
			System.out.print("Nichi is a sentence ");
		}
		else System.out.print(sentence);
	}
}