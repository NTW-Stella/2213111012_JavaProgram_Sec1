
public class Cylinder extends Circle {
	private double height;
	
	public Cylinder (double radius , double height) {
		super(radius,null);
		this.height = height;
	}
	public double getHeight () {
		return this.height;
	}
	public double getVolume() {
		return super.getArea() * height;
	}
	@Override
	public double getArea() {
		return Math.PI * (height + super.getRadius());
	}
	@Override
	public String toString () {
		return "Cylinder[height="+height +",radius = "+getRadius()+"]";
	}
	
}
