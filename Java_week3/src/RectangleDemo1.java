import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		 double width = Double.parseDouble(JOptionPane.showInputDialog("Input width : "));
		 double lenght = Double.parseDouble(JOptionPane.showInputDialog("Input lenght : "));
		 String color = JOptionPane.showInputDialog("Input color : ");
		 
		 Rectangle rec = new Rectangle(width,lenght,color);
		 
		 JOptionPane.showMessageDialog(null, rec+""
		 		+ "\nArea of Rectangle is "+rec.getArea()); //Call toString method() from Rectangle class

	}

}
