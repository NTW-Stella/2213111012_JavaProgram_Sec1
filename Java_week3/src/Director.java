
public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Director(String name,String email) {
		this.name = "";
		this.email = "";
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		if(gender == 'm' || gender == 'M' ) {
			return "Male";
		}
		else if(gender == 'f' || gender == 'F') {
			return "Female";
		}
		else
			return null;
	}
	public String toString() {
		return name + "("+email+";"+getGenderName()+")";
	}
}
