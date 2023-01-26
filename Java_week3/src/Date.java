
public class Date {
	private int dMonth; //Variable to store the month
	private int dDay; //Variable to store the day
	private int dYear; //Variable to store the year
	
	
	public Date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}
	public Date (int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	public void setDate (int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	public int getMonth () {
		return dMonth;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		return getMonth()+"-"+getDay()+"-"+getYear();
	}
}
