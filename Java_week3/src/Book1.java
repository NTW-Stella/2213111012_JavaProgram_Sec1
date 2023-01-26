
public class Book1 {
	private String title;
	private Author1 author;
	private int page;

	
	public Book1(String title,Author1 author,int page) {
		this.title = title;
		this.author = author;
		this.page = page;
		
	}
	public Book1(String title,Author1 author) {
		this.title = title;
		this.author = author;
		page = 0;
	}
	public Book1() {
		title = "";
		author = null;
		page = 0;
	}
	public String getTitle() {
		return this.title;
	}
	public Author1 getAuthor() {
		return this.author;
	}
	public void setPage (int page) {
		this.page = page;
	}
	public int getPage () {
		return this.page;
	}
	public String toString() {
		return title+" has "+page+" pages write by "+author;
	}
}
