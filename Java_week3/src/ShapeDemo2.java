import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double [] radius = new double [5];
		double [] height = new double [5];
		for(int i=0;i<=4;i++) {
			radius[i] = scan.nextDouble();
			height[i] = scan.nextDouble();
		}
		for(int i=0;i<=4;i++) {
			Cylinder cy1 = new Cylinder (radius[i],height[i]);
			System.out.println("Cylinder "+(i+1)+"volume = "+cy1.getVolume());
		}
	}

}
