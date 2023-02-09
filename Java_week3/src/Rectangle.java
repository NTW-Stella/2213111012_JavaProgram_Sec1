
public class Rectangle extends Shape{
	private double width;
	private double lenght;
	
	public Rectangle (double width,double lenght,String color) {
		super(color);
		this.width = width;
		this.lenght = lenght;
	}
	@Override
	public double getArea () {
		return this.width * this.lenght;
	}
	@Override
	public String toString () {
		return "Rectangle width = "+getWidth()+",lenght = "+getLenght()+", "+super.toString();
	}
	public double getWidth() {
		return this.width;
	}
	public double getLenght() {
		return this.lenght;
	}
}
