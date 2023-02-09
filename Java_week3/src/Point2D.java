
public class Point2D {
	//Private instance variable
	private float x;
	private float y;
	
	//Constructors
	//Default Constructors
	public Point2D() {
		this.x =0;
		this.y =0;
	}
	/**Constructor with parameters*/
	public Point2D (float x,float y) {
		this.x = x;
		this.y = y;
	}
	//Getters and Setters method
	public float getX() {
		return x;
	}
	public void setX (float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setXY(float x,float y) {
		this.x = x;
		this.y = y;
	}
	
	public float[] getXY() {
		float[] results = new float[2];
		results[0] = this.x;
		results[1] = this.y;
		return results;
	}
	/**Returns string int form of "(x,y)"*/
	public String toString() {
		return "(" +getX() + "," + getY() + ")";
	}
}
