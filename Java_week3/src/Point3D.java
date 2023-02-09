/* The point3D class models a 3D point at (x,y,z).
 * which is a subclass of Point2D
 */
public class Point3D extends Point2D {
	//Private instance variables
	private float z;
	
	//Constructors
	/**Default constructors */
	public Point3D() {
		super(); //call instance variable from superclass x = y = 0
		this.z = 0;
	}
	/**Constructor with parameters (x,y,z)*/
	public Point3D (float x,float y,float z) {
		super (x,y);
		this.z = z;
	}
	//Getters and Setters
	public float getZ () {
		return z;
	}
	public void setZ (int z) {
		this.z = z;
	}
	public void setXYZ(float x, float y , float z) {
		super.setX(x); //use setter in superclass,set(x) or set(y)
		super.setY(y);
		this.z = z;
	}
	public float[] getXYZ() {
		float [] results = new float[3]; //Construct an array of 2 element
		results[0] = super.getX();
		results[1] = super.getY();
		results[2] = this.z;
		return results; //return the array
	}
	/**Returns a string in the form of "(x,y),and z)"*/
	@Override
	public String toString() {
		return super.toString()+" ,and " +getZ() + ")";
	}
}	

