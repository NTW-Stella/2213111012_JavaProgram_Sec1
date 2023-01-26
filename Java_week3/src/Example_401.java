import java.util.*;
public class Example_401 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String inputText = "";
		String wordtoDisplay ="";
		while(true) {
			System.out.print("Enter word : ");
			inputText = kb.next();
			if(inputText.equalsIgnoreCase("stop")){
				break;
			}
			wordtoDisplay = wordtoDisplay + inputText+"";
			
		}
		System.out.println(wordtoDisplay.toUpperCase());

	}

}
