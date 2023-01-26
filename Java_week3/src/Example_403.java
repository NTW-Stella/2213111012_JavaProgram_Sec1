import java.util.*;
import javax.swing.*;
public class Example_403 {

	public static void main(String[] args) {
		/*Scanner inputKb = new Scanner(System.in);
		System.out.print("Input a sen tence : ");
		String sentence = inputKb.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sen tence, again : ");
			sentence = inputKb.nextLine();
		}
		System.out.println();
		int countofSpace = 0;
		for (int i =0;i<sentence.length();i++){
			if(sentence.charAt(i)== ' ') {
				countofSpace++;
			}
		}
		System.out.println("This sentence has "+countofSpace+" spacebar.");
		System.out.println("This sentence has "+(countofSpace+1)+" word.");
		*/
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence, again: ");
		}
		int countofSpace = 0;
		for (int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)== ' ') {
				countofSpace++;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has "+countofSpace+" spacebar."+
		"\nThis sentence has "+(countofSpace+1)+" word.");
	}
}
