import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] radius = new double [5];
		double[] height = new double [5];
		for(int i =0;i<=4;i++) {
			radius[i] = Double.parseDouble(JOptionPane.showInputDialog((i+1)+". Input radius"));
			height[i] = Double.parseDouble(JOptionPane.showInputDialog((i+1)+". Input height"));
			
		}
		for(int i=0;i<=4;i++) {
			Cylinder cy1 = new Cylinder (radius[i],height[i]);
			JOptionPane.showMessageDialog(null,"Cylinder "+(i+1)+"volume = "+cy1.getVolume());
		}
	}

}
