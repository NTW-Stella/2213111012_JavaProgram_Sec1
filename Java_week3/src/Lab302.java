import javax.swing.*;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height: "));
		double height2 = height/100;
		double bmi = weight / (height2*height2);
		if (bmi<18.5) {
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+
					"\nYou're Underweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		if (bmi>18.5&&bmi<24.9) {
				JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+
						"\nYou're Nomal-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		if (bmi>25.0 && bmi<29.9) {
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+
					"\nYou're Overweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		if (bmi>30.0) {
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+
					"\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		}
	}

}
