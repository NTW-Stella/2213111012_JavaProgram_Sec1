
public class Theater extends Movie{
	private int theaterNo;
	
	public Theater(String id,String name,Director director,int theator) {
		super(id,name,director);
		this.theaterNo = theaterNo;
	}
	private Theater() {
		super();
		this.theaterNo = 0;
	}
	public String getTheaterName() {
		if(theaterNo >=1 && theaterNo <=11) {
			return "Basic Theater";
		}
		else if(theaterNo <=14) {
			return "Sweet Theater";
		}
		else if(theaterNo ==15) {
			return "Premium Theater";
		}
		else 
			return null;
	}
}
