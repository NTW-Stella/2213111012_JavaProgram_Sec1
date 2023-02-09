import java.util.*;
public class ShapeDemoNew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input Height : ");
		double height = scan.nextDouble();
		
		Circle cir1 = new Circle (radius,null);
		System.out.println();
		System.out.println(cir1);
		System.out.println("Circle[area = "+ cir1.getArea()+"]");
		
		Cylinder cy1 = new Cylinder(radius,height); 
		System.out.println("\n"+cy1);
		System.out.println("Cylinder[area = "+cy1.getArea()+"]");
		System.out.println("Cylinder[volume = "+cy1.getVolume()+"]");
		
	}

}
