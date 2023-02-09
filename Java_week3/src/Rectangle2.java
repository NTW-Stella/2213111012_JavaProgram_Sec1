
public class Rectangle2 {
	private double width;
	private double lenght;
	
	
	
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
